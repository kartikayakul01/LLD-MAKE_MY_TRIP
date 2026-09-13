import models.UserEnum;

import java.util.Scanner;

class Main{
    static Scanner sc = new Scanner(System.in);
    private static UserEnum userSelections(){

        while(true){
            try{
                System.out.println("Login as ");
                System.out.println("Press 1: as Admin");
                System.out.println("Press 2: as User");
                UserEnum user = UserEnum.getThing(sc.nextInt());
                System.out.println("You selected = "+user.toString());

                return user;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    private static void adminFlowStarts(){

    }
    private static void consumerFlowStarts(){}

    public static void main(String[] args){
        System.out.println("================= Welcome to MOVIE TICKET BOOKING SYSTEM =============================");

        UserEnum theUser= userSelections();
        System.out.println(theUser.toString()+" flow starts");
        switch (theUser){
            case Admin -> {
                adminFlowStarts();
                break;
            }
            case Consumer -> {
                consumerFlowStarts();
                break;
            }
            default -> {
                System.out.println("No flow");
                break;
            }
        }


    }
}