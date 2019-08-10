package anoop.myprojects.gec_sfi;

/**
 * Created by anoop on 6/15/18.
 */

public class DataModelNews {

    String name;
    String version;
    int id_;
    String image;

    public DataModelNews(String name, String version, int id_,String image) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image=image;
    }

    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }

    public String getVersion() {
        return version;
    }

    public int getId() {
        return id_;
    }
}