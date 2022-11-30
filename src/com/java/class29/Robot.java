package com.java.class29;

public class Robot {
    String name;
    int age;
    int speed;
    Robot() {
        System.out.println("Hello, I would like to introduce new models of Robots, which were created to ease our life!");
    }
    Robot(String name, int age,int speed){
        this.name = name;
        this.age = age;
        this.speed = speed;
        System.out.println("Its name is " + name + ". It is pretty young, its age is " + age +
                " years. It can move with the speed of "+ speed + " mph");
    }
    Robot(int weight, int memory, int yearCreated) {
        this("Dotya", 2, 5);
        System.out.println("This robot can wash dishes and prepare food. Its memory is " + memory +
                " gigabytes. It has lot of different recipes build in it's memory. It was created in "+ yearCreated +
                ". It is not so heavy, its weight is " + weight + " pounds");
    }
    Robot(int speed) {
        System.out.println("It can move with the speed of " + speed);
    }
    public void run() {
        System.out.println("This robot can run with the speed " + speed + "MPH");
    }
}
    class VacuumRobot extends Robot {
        int price;
        String model;
        VacuumRobot(){
            System.out.println("You need to try them!");
        }
        VacuumRobot(int price, String model){

            super("Botya", 3, 7);
            System.out.println("This Vacuum Robot will clean your home, just turn it on and go to your work, " +
                    "it will vacuum your home perfectly. This model " + model + " costs only " + price + " dollars");
        }
        void clean(){
            System.out.println("It is the best!");

        }

    }

