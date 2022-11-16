package model;

import interfaces.Codec;

public class BitrateReader {
    public VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Bitrate Reader: reading a file...");
        return file;
    }

    public VideoFile convert(VideoFile file, Codec codec) {
        System.out.println("Bitrate Reader: writing a file...");
        return file;
    }
}
