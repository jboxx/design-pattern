package io.jboxx.designpattern.compositepattern;

import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * It's a composite class
 */
public class Folder extends Item implements IDirectory, IITem {

    Set<Item> itemDirectories;

    public Folder(
            Folder folder, String name, double size,
            String createdDate, String lastModifiedDate) {
        super(folder, name, size, createdDate, lastModifiedDate, "Folder");
        itemDirectories = new LinkedHashSet<>();
    }

    @Override
    public double getSize() {
        double size = 0;
        for (Item item : itemDirectories) {
            size += item.size();
        }
        return size + size();
    }

    @Override
    public String getPath() {
        StringBuilder path = new StringBuilder("/" + name());
        do {
            Folder f = folder();
            if (f == null) {
                break;
            }
            path.append("/").append(f.name());
        } while (true);

        return path.toString();
    }

    @Override
    public void add(Item item) {
        item.setFolder(this);
        itemDirectories.add(item);
    }

    @Override
    public void remove(Item item) {
        if (!itemDirectories.isEmpty()) {
            itemDirectories.remove(item);
        }
    }
}
