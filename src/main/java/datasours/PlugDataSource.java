package datasours;

import java.util.Arrays;
import java.util.List;

public class PlugDataSource implements INoteShopDataSource {
    private static final List<Netbook> plugNotesData = Arrays.asList(
            new Netbook(1, "MacBook Pro (13 дюймов, M2, 2022 г.)", "Mac14,7", 94900.0),
            new Netbook(2, "MacBook Pro 16 Late 2021 ", "MK183", 119000.0),
            new Netbook(3, "Apple MacBook Air Mid 2022", "MLY03", 115900.0),
            new Netbook(4, "Apple MacBook Air Late 2020", "MGN93", 77900.0)
    );

    private static final List<Image> plugImagesData = Arrays.asList(
            new Image(1, "pictures/MacPro.jpeg", 1),
            new Image(2, "pictures/ProCommon.jpeg", 1),
            new Image(3, "pictures/MacPro2.jpeg", 2),
            new Image(4, "pictures/ProCommon.jpeg", 2),
            new Image(5, "pictures/MacAir.jpeg", 3),
            new Image(6, "pictures/MacAir.MacCommon.jpeg", 3),
            new Image(7, "pictures/MacAir2.jpeg", 4)
    );

    public PlugDataSource() {
    }

    @Override
    public List<Netbook> getAllPhones() {
        return plugNotesData;
    }

    @Override
    public Netbook getPhoneById(int noteId) {
        return plugNotesData.stream().filter(phone -> phone.getId() == noteId).findFirst().get();
    }

    @Override
    public List<Image> getPhoneImages(int noteId) {
        return plugImagesData.stream().filter(image -> image.getNoteId() == noteId).toList();
    }

    @Override
    public Image getPhonePreviewImage(int noteId) {
        return plugImagesData.stream().filter(image -> image.getNoteId() == noteId).findFirst().get();
    }
}
