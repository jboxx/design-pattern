package io.jboxx.designpattern.compositepattern;

public class Item {

    private Folder folder;
    private String name;
    private double size;
    private String createdDate;
    private String lastModifiedDate;
    private String kind;
    private String extension;

    public Item(Folder folder, String name, double size, String createdDate, String lastModifiedDate, String kind) {
        this.folder = folder;
        this.name = name;
        this.size = size;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.kind = kind;
    }

    public Item(Folder folder, String name, double size, String createdDate, String lastModifiedDate, String kind, String extension) {
        this.folder = folder;
        this.name = name;
        this.size = size;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.kind = kind;
        this.extension = extension;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public Folder folder() {
        return folder;
    }

    public double size() {
        return size;
    }

    public String name() {
        return name;
    }
}
