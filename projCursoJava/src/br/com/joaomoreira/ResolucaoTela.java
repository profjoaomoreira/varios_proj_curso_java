
package br.com.joaomoreira;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoTela {


    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
   
}
