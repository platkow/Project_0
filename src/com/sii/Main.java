package com.sii;

import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {

        //Titles
        Titles title1 = new Titles("Lost in translation");
        Titles title2 = new Titles("Psy");
        Titles title3 = new Titles("Kiler");
        Titles title4 = new Titles("The Hobbit");
        Titles title5 = new Titles("Doctor No");

        ArrayList<Titles> titles = new ArrayList<>();
        titles.add(0, title1);
        titles.add(1, title2);
        titles.add(2, title3);
        titles.add(3, title4);
        titles.add(4, title5);

        //Actors
        Actors actor1 = new Actors("Tom", "Hanks");
        Actors actor2 = new Actors("Bogusław", "Linda");
        Actors actor3 = new Actors("Cezary", "Pazura");
        Actors actor4 = new Actors("Richard", "Armitage");
        Actors actor5 = new Actors("Sean", "Connery");

        Actors[] actors = new Actors[5];
        actors[0] = actor1;
        actors[1] = actor2;
        actors[2] = actor3;
        actors[3] = actor4;
        actors[4] = actor5;

        //FilmGenre
        FilmGenre genre1 = new FilmGenre("Romance");
        FilmGenre genre2 = new FilmGenre("Detective story");
        FilmGenre genre3 = new FilmGenre("Crime comedy");
        FilmGenre genre4 = new FilmGenre("Science fiction");
        FilmGenre genre5 = new FilmGenre("Action");

        LinkedList<FilmGenre> genres = new LinkedList<>();
        genres.add(0, genre1);
        genres.add(1, genre2);
        genres.add(2, genre3);
        genres.add(3, genre4);
        genres.add(4, genre5);

        for (int i = 0; i < titles.size(); i++) {
            StringBuilder filmDetails = new StringBuilder()
                    .append("Film title: ")
                    .append(titles.get(i))
                    .append(", ")
                    .append("Actor: ")
                    .append(actors[i])
                    .append(", ")
                    .append("Film genre: ")
                    .append(genres.get(i));
            System.out.println(filmDetails);
        }
    }
}
