package io.jboxx.designpattern.compositepattern;

import java.util.Date;
import java.util.List;

public class ImplementationCompositePattern {

    public static void main(String[] args) {

        String createdDate = new Date().toString();
        Folder folderA = new Folder(
                null, "folderA", 100,
                createdDate, createdDate);

        System.out.println("halo apa kabar terlalu lembut buat aku jadi nya kayak gini ");

        System.out.println("folderA path " + folderA.getPath());
        System.out.println("folderA size " + folderA.getSize());


        String createdDateFile1 = new Date().toString();
        File file1 = new File(
                folderA, "file1", 20,
                createdDateFile1, createdDateFile1,
                "image", "jpg");

        System.out.println("file1 path " + file1.getPath());
        System.out.println("file1 size " + file1.getSize());
        System.out.println("folderA path " + folderA.getPath());
        System.out.println("folderA size " + folderA.getSize());

        folderA.remove(file1);
    }
}
