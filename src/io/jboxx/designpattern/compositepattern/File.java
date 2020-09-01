package io.jboxx.designpattern.compositepattern;

public class File extends Item implements IDirectory {

    public File(
            Folder folder, String name, double size, String createdDate,
            String lastModifiedDate, String kind, String extension) {
        super(folder, name, size, createdDate, lastModifiedDate, kind, extension);
        super.folder().add(this);
    }

    @Override
    public double getSize() {
        return size();
    }

    @Override
    public String getPath() {
        return folder().getPath() + "/" + name();
    }
}
