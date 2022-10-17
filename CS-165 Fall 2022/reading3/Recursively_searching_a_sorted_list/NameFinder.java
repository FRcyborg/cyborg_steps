// Not working, got though text and see if there is an eeeerrrrrrooooorrrrr


import java.util.Scanner;
import java.util.ArrayList;
/*
    Figure 3.3.2
    Recursively searching a sorted list
*/

public class NameFinder {

    public static int findMatch(ArrayList<String> stringList, String itemMatch, int lowVal, int highVal) {
        int midVal;
        int itemPos;
        int rangeSize;

        rangeSize = (highVal - lowVal) / 2;
        midVal = (highVal + lowVal) / 2;

        if (itemMatch.equals(stringList.get(midVal))) {
            itemPos = midVal;
        }
        else if ( rangeSize == 1) {
            itemPos = -1;
        } 
        else {
            if (itemMatch.compareTo(stringList.get(midVal)) < 0) {
                itemPos = findMatch(stringList, itemMatch, lowVal, midVal);
            }
            else {
                itemPos = findMatch(stringList, itemMatch, midVal + 1, highVal);
            }
        }
        return itemPos;
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> attendeesList = new ArrayList<String>();
        String attendeeName;
        int matchPos;

        attendeesList.add("Adams, Mary");
        attendeesList.add("Carver, Michael");
        attendeesList.add("Domer, Hugo");
        attendeesList.add("Fredericks, Carlos");
        attendeesList.add("Li, Jie");

        System.out.print("Enter person's name: Last, First: ");
        attendeeName = scnr.nextLine();

        matchPos = findMatch(attendeesList, attendeeName, 0, attendeesList.size() - 1);
        if (matchPos >= 0) {
            System.out.println("Found at position " + matchPos + ".");
        } 
        else {
            System.out.println("Not found.");
        }
    } // end of main

} // end of class
