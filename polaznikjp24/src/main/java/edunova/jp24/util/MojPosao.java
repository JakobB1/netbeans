/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author dell
 */
public class MojPosao {
    
    public static String getPosao(){
         //https://www.posao.hr/oglasi/front-end-developer-m-f/765204/
        try {
            String html = new Scanner(
                    new URL("https://www.posao.hr/oglasi/front-end-developer-m-f/765204/")
                            .openStream(),"UTF-8").useDelimiter("\\A").next();
            //System.out.println(html);
            
            Document d = Jsoup.parse(html);
            //
            return Xsoup.compile("/html/body/div[1]/div[1]/text()")
                    .evaluate(d).get();
        } catch (Exception e) {
            return null;
        }
    }
    
}