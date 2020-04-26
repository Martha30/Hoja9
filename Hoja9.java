package h9;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Hoja9 {

	 public static void main(String[] args) throws IOException {

	        boolean wantsToContinue = true;

	        BinaryTree dictionary = null;
	        ArrayList<String> sentence;

	        while (wantsToContinue){

	            System.out.println(menu());
	            System.out.print("\nIngrese una opcion: ");
	            Scanner input = new Scanner(System.in);
	            String op = input.next();

	            switch (op){
	                case "1":
	                    System.out.print("\n\nIngrese path del archivo diccionario: ");
	                    Scanner input2 = new Scanner(System.in);
	                    String path = input2.next();
	                    dictionary = readWords(path);
	                    System.out.println("\nPalabras disponibles(InOrder):\n");
	                    System.out.println(BinaryTree.inOrder(dictionary));
	                    break;
	                case "2":
	                    if (dictionary != null){
	                        System.out.print("\n\nIngrese path del archivo oracion: ");
	                        Scanner input3 = new Scanner(System.in);
	                        String path2 = input3.next();
	                        sentence = readSentence(path2);
	                        sentence = translate(sentence, dictionary);
	                        String translatedSentence = "";
	                        for (String word: sentence) {
	                            translatedSentence += " " + word;
	                        }
	                        System.out.println("\nOracion Traducida: " + translatedSentence);
	                    } else {
	                        System.out.println("\nERROR: NO se ha ingresado un diccionario.");
	                    }
	                    break;
	                case "3":
	                    wantsToContinue = false;
	                    break;
	                default:
	                    System.out.println("\nLa opcion ingresada no es valida.");
	                    break;
	            }

	        }
	
}
