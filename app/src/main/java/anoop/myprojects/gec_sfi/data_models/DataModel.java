package anoop.myprojects.gec_sfi.data_models;

/**
 * Created by anoop on 6/15/18.
 */

public class DataModel {

    String name;
    String version;
    int id_;
    int image;

    public DataModel(String name, String version, int id_, int image) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}