package com.kodilla.stream;




import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;

import static com.kodilla.stream.iterate.NumbersGenerator.generateEven;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("hihi", text -> text + "ABC");
        poemBeautifier.beautify("ASD", text -> text.toLowerCase());
        poemBeautifier.beautify("ASDASD", text -> "HHH"+text+"HHH");
        poemBeautifier.beautify("POSZLA OLA DO PRZEDSZKOLA", text -> text.replace("O", "!").toLowerCase().trim());
        poemBeautifier.beautify("TO JEST TEKST", text -> text = null);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}
