  package src.week2.friday;
  import java.util.Stack;
  import java.util.LinkedList;
  import java.util.Queue;
  import java.util.Scanner;
  public class DataStructureSimulator {
    

    public static void main(String[]args){

      /*
      DataStructureSimulator.java
  Create a Data Structure Simulator for Stacks and Queues
  Features:
  User selects:
  Stack
  Queue
  Adds elements
  Removes elements
  Prints current state
  */

  /*
  1. Import Scanner and ask the user whether they want to use a stack or queue
  2. Take input, and use if statements for the add and remove methods
  3. Print the final state of the stack/queue
  */
  Scanner scan = new Scanner(System.in);
  System.out.println("Do you want to simulate a Stack or a Queue?");
  String input = scan.nextLine().toLowerCase();

  if(input.equals("stack")){ //Stack case
    Stack<String> stack = new Stack();
    
    while(true){
      System.out.println("Enter elements you want to add. Type \" Done \" when you are finished");
      String element = scan.nextLine();
      if(element.equals("Done")){
        break;
      }
      stack.push(element);
    }

    System.out.println("Do you want to 'Remove' elements or 'Print' the final stack?");
    String input2 = scan.nextLine();

    if(input2.equals("Remove")){

      while(true){
          
            System.out.println("Type 'Pop' to remove the head of the stack. Type \" Done \" when you are finished" );
            String pop = scan.nextLine();
              if(pop.equals("Done")){
              break;
              } else{
                if(!stack.isEmpty()){
                  stack.pop();
                } else{
                  System.out.println("You can't pop anymore! Your stack is empty!");
                  System.out.println("Here is your stack: " + stack);
                  break;
                }
              }

            
            

                
      }
      
    
    
    } 

      
    if(input2.equals("Print")){
      System.out.println("Here is the final stack: " + stack);

    }
      }
      else if(input.equals("queue")){ //Queue case
      Queue<String> queue = new LinkedList();

      while(true){
      System.out.println("Enter elements you want to add. Type \" Done \" when you are finished");
      String element = scan.nextLine();
      if(element.equals("Done")){
        break;
      }
      queue.offer(element);
    }

    System.out.println("Do you want to 'Remove' elements or 'Print' the final queue?");
    String input3 = scan.nextLine();

    if(input3.equals("Remove")){

      while(true){
            System.out.println("Type 'Poll' to remove the first element in line from the queue. Type \" Done \" when you are finished" );
            String poll = scan.nextLine();
            if(poll.equals("Done")){
              break;
            }
            queue.poll();
            
      }
      System.out.println("Here is the final queue: " + queue);
      
    }

    
        }
    }
  }


    

      
    
    

