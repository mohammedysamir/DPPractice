package facade;

import interfaces.Codec;
import model.*;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started...");
        VideoFile file = new VideoFile(fileName);
        CodecFactory codecFactory = new CodecFactory();
        Codec sourceCodec = codecFactory.extract(file);
        Codec destinationCodec;
        if (format.equalsIgnoreCase("mp4"))
            destinationCodec = new MPEG4Codec();
        else
            destinationCodec = new OggCompressionCodec();
        BitrateReader reader = new BitrateReader();
        VideoFile buffer = reader.read(file, sourceCodec);
        VideoFile intermediateResult = reader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed...");
        return result;
    }
}
