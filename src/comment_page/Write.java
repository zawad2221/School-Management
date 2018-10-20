/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comment_page;

import java.io.File;
import java.io.FileWriter;
import static java.lang.System.exit;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

/**
 *
 * @author hp
 */
public class Write {

    public static void writeComment(String c) {
        try {
            File f = new File("comment.txt");
            FileWriter fw = new FileWriter(f, true);
            fw.write(c);
            fw.write("\r\n");

            fw.close();
        } catch (Exception e) {
            exit(1);
        }
    }

}
