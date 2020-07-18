//Demonstrates the use of Polymorphism concepts.
//
package MoviePlots;

import java.util.Scanner;

class MoviePlots {
    private String name;//

    //Constructor
    public MoviePlots(String name) {
        this.name = name;
    }
    //Get method
    public String getName() {
        return name;
    }
    //plots() method of MoviePlots class.
    public String plots(){
        return "No plots yet.";
    }
}

class HarryPotter extends MoviePlots {

    //Constructor of HarryPotter class
    public HarryPotter() {

        super( "Harry Potter" );//Super class field indication.
    }
    @Override
    public String plots()//Overriding the properties of plots() method of MoviePlots class.
    {
        return "Harry Potter movies is about the magical world.";
    }
}

class PiratesOfCaribbean extends MoviePlots {

    public PiratesOfCaribbean() {
        super( "Pirates of Caribbean" );
    }

    @Override
    public String plots() {
        return "Pirates of caribbean is about the fantasy world of pirates.";
    }
}
    class BeautyAndTheBeast extends MoviePlots {


        public BeautyAndTheBeast() {
            super( "Beauty and the Beast" );
        }

        @Override
        public String plots() {
            return "Beauty and the Beast is about the love story of a beautiful girl and the hideous beast.";
        }
    }

    class Hobbits extends MoviePlots {
        public Hobbits() {
            super( "The Hobbits" );
        }

        @Override
        public String plots() {
            return "The Hobbits is about the story of a mythical creatures who saved the world.";
        }
    }

    class LordOfTheRing extends MoviePlots {
        public LordOfTheRing() {
            super( "Lord of the Ring" );
        }

        @Override
        public String plots() {
            return "Lord of the Ring is about the war between the bad and good mythical creatures.";
        }
    }


public class MainMoviePlots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Range to print is from 1 to 20: ");
        System.out.println("How many times do you want to print the random movies? ");
        int x = scanner.nextInt();

        for(int i = 1 ; i <= x ; i++){
            MoviePlots moviePlots = randomMovie();//little bit confused. Go through it again.
            System.out.println(i+".Movie name: " + moviePlots.getName() + "\nMovie's plot: "+moviePlots.plots());
            System.out.println();
        }
    }

    public static MoviePlots randomMovie() {
        int randomNum = (int) (Math.random() * 5 + 1);
        System.out.println( "Random number is " + randomNum +"." );

        switch (randomNum) {
            case 1:
                return new HarryPotter();

            case 2:
                return new PiratesOfCaribbean();

            case 3:
                return new BeautyAndTheBeast();

            case 4:
                return new Hobbits();

            case 5:
                return new LordOfTheRing();

            default:
                return null;
        }
    }
}


