package model;

import interfaces.Codec;

public class MPEG4Codec implements Codec {
    String type = "mp4";

    public String getType() {
        return type;
    }
}
