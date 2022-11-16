package model;

import interfaces.Codec;

public class OggCompressionCodec implements Codec {
    String type = "ogg";

    public String getType() {
        return type;
    }
}