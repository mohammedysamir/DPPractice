package implementation;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    String getChannel();
    void setChannel(String channel);
}
