package model;

public class VideoFile {
    String name;
    String codecType;

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }
}
