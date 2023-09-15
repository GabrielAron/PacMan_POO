package com.mycompany.pacman_poo.newpackage;

import javax.swing.JFrame;

public class Pacman extends JFrame {

    public static void main(String[] args) {
        Pacman pac = new Pacman();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(380, 420);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);
    }

    public Pacman() {
        add(new Model());
    }

}
