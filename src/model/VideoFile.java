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

    public VideoFile(String name, String codecType) {
        this.name = name;
        this.codecType = codecType;
    }
}
