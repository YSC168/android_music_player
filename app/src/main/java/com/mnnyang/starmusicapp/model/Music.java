package com.mnnyang.starmusicapp.model;

/**
 * 音乐javabean <br>
 * Created by mnnyang on 17-4-11.
 */

public class Music {
    public enum Type {
        ONLINE, LOCAL
    }

    private long id;
    private long duration;
    private String title;
    private String artist;
    private String path;
    private String album;
    private String albumPath;
    private String fileName;
    private long fileSize;
    /*默认是本地音乐*/
    private Type type = Type.LOCAL;

    public Type getType() {
        return type;
    }

    public Music setType(Type type) {
        this.type = type;
        return this;
    }

    public long getId() {
        return id;
    }

    public Music setId(long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Music setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public Music setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public String getAlbum() {
        return album;
    }

    public Music setAlbum(String album) {
        this.album = album;
        return this;
    }

    public long getDuration() {
        return duration;
    }

    public Music setDuration(long duration) {
        this.duration = duration;
        return this;
    }

    public String getPath() {
        return path;
    }

    public Music setPath(String path) {
        this.path = path;
        return this;
    }

    public String getAlbumPath() {
        return albumPath;
    }

    public Music setAlbumPath(String albumPath) {
        this.albumPath = albumPath;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public Music setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public long getFileSize() {
        return fileSize;
    }

    public Music setFileSize(long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", albumPath='" + albumPath + '\'' +
                '}';
    }

}
