package anoop.myprojects.gec_sfi;

import com.google.firebase.database.Exclude;

/**
 * Created by anoop on 7/5/18.
 */

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mKey;
    private String mDesc;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String name, String imageUrl, String Desc) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl;
        mDesc=Desc;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}
