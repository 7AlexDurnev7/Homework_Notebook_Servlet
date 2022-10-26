package datasours;

import java.util.List;

public interface INoteShopDataSource {
    List<Netbook> getAllPhones();
    Netbook getPhoneById(int phoneId);
    List<Image> getPhoneImages(int phoneId);

    Image getPhonePreviewImage(int phoneId);
}
