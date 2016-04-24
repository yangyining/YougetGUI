package sample;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.File;


public class DownloadData {

    private final StringProperty videoProfile = new SimpleStringProperty();

    private final StringProperty url = new SimpleStringProperty();

    private final StringProperty progress = new SimpleStringProperty("等待下载...");

    private final ObjectProperty<File> downloadDirectory = new SimpleObjectProperty<>();

    private final StringProperty name = new SimpleStringProperty("等待加载...");

    public DownloadData(String url, File downloadDirectory) {
        this.url.set(url);
        this.downloadDirectory.set(downloadDirectory);
    }

    public String getVideoProfile() {
        return videoProfile.get();
    }

    public void setVideoProfile(String videoProfile) {
        this.videoProfile.set(videoProfile);
    }

    public StringProperty videoProfileProperty() {
        return videoProfile;
    }

    public File getDownloadDirectory() {
        return downloadDirectory.get();
    }

    public void setProgress(String progress) {
        this.progress.set(progress);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public File getDownloadDir() {
        return downloadDirectory.get();
    }

    public ObjectProperty<File> downloadDirectoryProperty() {
        return downloadDirectory;
    }

    public String getUrl() {
        return url.get();
    }

    public StringProperty urlProperty() {
        return url;
    }

    public String getProgress() {
        return progress.get();
    }

    public StringProperty progressProperty() {
        return progress;
    }

}
