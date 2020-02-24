package com.company;

/*

1002 Problem number 2 on the conversion of integer types
Place the type conversion operators correctly to get the answer: d = 3.765
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;

Requirements:
1. The program should display the text on the screen.
2. You cannot change the display command.
3. The main () method must contain a variable of type int.
4. The main () method must contain a variable b of type int.
5. The main () method must contain a variable c of type float.
6. The main () method must contain a d variable of type double.
7. The initial value of the variables during initialization cannot be changed. You can add only cast operators.
8. The program should print the number 3.765.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;
        System.out.println(d);
    }
}













