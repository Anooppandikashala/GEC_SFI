package anoop.myprojects.gec_sfi.data_models;

/**
 * Created by anoop on 6/15/18.
 */

public class DataModelNotification {

    String name;
    String version;
    int id_;

    public DataModelNotification(String name, String version, int id_) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getId() {
        return id_;
    }
}