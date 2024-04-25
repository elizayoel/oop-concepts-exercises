package Lab_Oct02_Classes_Objects;

import java.util.Scanner;

public class Q3Candidate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Candidate c1 = new Candidate("Eliza",new Vote());
        Candidate c2 = new Candidate("Sasa", new Vote());

        int menu = -1;
        while(menu != 0){
            System.out.println("1. Increment Candidate 1");
            System.out.println("2. Increment Candidate 2");
            System.out.println("3. Decrement Candidate 1");
            System.out.println("4. Decrement Candidate 2");
            System.out.println("0. End the vote");
            menu = scan.nextInt();

            if(menu == 1){
                c1.getVote().increment();
            } else if (menu == 2) {
                c2.getVote().increment();
            } else if (menu == 3) {
                c1.getVote().decrement();
            } else if(menu == 4) {
                c2.getVote().decrement();
            }
        }
        System.out.println("VOTING RESULT");
        System.out.println(c1.getName() + " " + c1.getVote().getCount());
        System.out.println(c2.getName() + " " + c2.getVote().getCount());
    }
}


class Vote{
    private int count;

    public Vote(){
        clear();
    }
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public void clear(){
        count = 0;
    }
    public void increment(){
        count++;
    }
    public void decrement(){
        count--;
    }
}

class Candidate{
    private String name;
    private Vote vote;

    public Candidate(){
        this.name = "";
        this.vote = null;
    }
    public Candidate(String name, Vote vote){
        this.name = name;
        this.vote = vote;
    }
    public String getName (){
        return name;
    }
    public Vote getVote(){
        return vote;
    }
}