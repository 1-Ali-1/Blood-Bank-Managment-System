package com.Ali.Storage_From_File_To_Collection;

import java.io.*;

public class WriteToFile {

public void writeObjectToFile(Object ob,String txt) throws IOException {
    FileOutputStream f = new FileOutputStream(new File(txt));
    ObjectOutputStream o = new ObjectOutputStream(f);
    o.writeObject(ob);
    o.close();
    f.close();
}

}
