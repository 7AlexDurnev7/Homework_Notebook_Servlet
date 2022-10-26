package datasours;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DataSourceFactory {
    private static final String PLUG_DATA_SOURCE_VALUE = "plug";
    private final String dataSourceConf;

    public DataSourceFactory() throws NamingException {
        Context ctx = new InitialContext();
        Context env = (Context) ctx.lookup("java:comp/env");
        dataSourceConf = (String)env.lookup("data-source");
    }

    public INoteShopDataSource getDataSource() {
        return switch(dataSourceConf) {
            case PLUG_DATA_SOURCE_VALUE -> new PlugDataSource();
            default -> null;
        };
    }
}
