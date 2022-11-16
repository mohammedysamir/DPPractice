package model;

import interfaces.Codec;

public class CodecFactory {
    public  Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equalsIgnoreCase("mp4")) {
            System.out.println("Codec extracting mpeg audio...");
            return new MPEG4Codec();
        } else if (type.equalsIgnoreCase("ogg")) {
            System.out.println("Codec extracting ogg audio...");
            return new OggCompressionCodec();
        }
        return null;
    }
}
