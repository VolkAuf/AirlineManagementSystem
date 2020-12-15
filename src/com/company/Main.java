package com.company;

import com.company.Forms.FormAerodrome;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        SwingUtilities.invokeLater(FormAerodrome::new);
    }
}
