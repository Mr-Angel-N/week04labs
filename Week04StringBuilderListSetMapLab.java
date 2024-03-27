
//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject:  StringBuilders, Lists, Sets, & Maps
//Java Week 04 Lab  
//
package Week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

 public static void main(String[] args) {

     // 1. Why would we use a StringBuilder instead of a String?
     //      a. Instantiate a new StringBuilder
     //      b. Append the characters 0 through 9 to it separated by dashes
     //              Note:  make sure no dash appears at the end of the StringBuilder
     System.out.println("Q.01:");
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < 10; i++) {
       sb.append(i);
       if (i != 9) {
           sb.append("-");
       }
     }
     System.out.println(sb.toString());
          
     // 2. List of String:
     //      a. Create a list of Strings 
     //      b. Add 5 Strings to it, each with a different length
     System.out.println("Q.02:");
     List <String> cars = new ArrayList<String>();
     cars.add("300zx");
     cars.add("g35");
     cars.add("fx35");
     cars.add("titan");
     cars.add("pathfinder");
      
     // 3. Write and test a method that takes a list of strings 
     //          and returns the shortest string
     System.out.println("Q.03:");
     String shortest = findShortestString(cars);
     System.out.println("Shortest string: " + shortest);
     
     // 4. Write and test a method that takes a list of strings 
     //          and returns the list with the first and last element switched
     System.out.println("Q.04:");
     List<String> switchedList = switchFirstAndLast(cars);
     System.out.println("Switched list: " + switchedList);
     
     // 5. Write and test a method that takes a list of strings 
     //          and returns a string with all the list elements concatenated to each other,
     //          separated by a comma
     System.out.println("Q.05:");
     String concatenatedString = concatenateWithComma(cars);
     System.out.println("Concatenated string: " + concatenatedString);
 
     // 6. Write and test a method that takes a list of strings and a string 
     //          and returns a new list with all strings from the original list
     //          containing the second string parameter (i.e. like a search method)
     System.out.println("Q.06:");
     List<String> searchResults = search(cars, "a");
     for (String result : searchResults) {
       System.out.println(result);
     }
     
     // 7. Write and test a method that takes a list of integers 
     //          and returns a List<List<Integer>> with the following conditions specified
     //          for the return value:
     //      a. The first List in the returned value contains any number from the input list 
     //          that is divisible by 2
     //      b. The second List contains values from the input list that are divisible by 3
     //      c. The third containing values divisible by 5, and 
     //      d. The fourth all numbers from the input List not divisible by 2, 3, or 5
     System.out.println("Q.07:");
     List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     List<List<Integer>> dividedLists = divideNumbers(numbers);
     System.out.println("Divided lists: " + dividedLists);
     
     // 8. Write and test a method that takes a list of strings 
     //          and returns a list of integers that contains the length of each string
     System.out.println("Q.08:");
     List<Integer> lengths = stringLengths(cars);
     System.out.println("Lengths of strings: " + lengths);
     
     // 9. Create a set of strings and add 5 values
     System.out.println("Q.09:");
     Set<String> stringSet = new HashSet<>();
     stringSet.add("red");
     stringSet.add("blue");
     stringSet.add("green");
     stringSet.add("orange");
     stringSet.add("purple");
     System.out.println("String set: " + stringSet);
     
     // 10. Write and test a method that takes a set of strings and a character 
     //          and returns a set of strings consisting of all the strings in the
     //          input set that start with the character parameter.
     System.out.println("Q.10:");
     char startChar = 'g';
     Set<String> filteredSet = filterStringsStartingWith(stringSet, startChar);
     System.out.println("Filtered set: " + filteredSet);
     
     // 11. Write and test a method that takes a set of strings 
     //          and returns a list of the same strings
     System.out.println("Q.11:");
     List<String> stringList = setToList(stringSet);
     System.out.println("Converted list: " + stringList);

     // 12. Write and test a method that takes a set of integers 
     //          and returns a new set of integers containing only even numbers 
     //          from the original set
     System.out.println("Q.12:");
     Set<Integer> integerSet = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     Set<Integer> evenNumbersSet = filterEvenNumbers(integerSet);
     System.out.println("Set of even numbers: " + evenNumbersSet);
     
     // 13. Create a map of string and string and add 3 items to it where the key of each
     //          is a word and the value is the definition of the word
     System.out.println("Q.13:");
     Map<String, String> wordMap = new HashMap<>();
     // Add items to the map
     wordMap.put("racecar", "an automobile built or modified for racing.");
     wordMap.put("boost", "help or encourage (something) to increase or improve.");
     wordMap.put("grip", "an effective form of control over something.");
     // Print the map
     System.out.println("Word map: " + wordMap);
     
     // 14. Write and test a method that takes a Map<String, String> and a string 
     //          and returns the value for a key in the map that matches the
     //          string parameter (i.e. like a language dictionary lookup)
     System.out.println("Q.14:");
     String word = "nitrous";
     String definition = dictionaryLookup(wordMap, word);
     System.out.println("Definition of '" + word + "': " + definition);
     
     // 15. Write and test a method that takes a List<String> 
     //          and returns a Map<Character, Integer> containing a count of 
     //          all the strings that start with a given character
     System.out.println("Q.15:");
     Map<Character, Integer> countMap = countStringsStartingWith(stringList);
     System.out.println("Count map: " + countMap);

 }
 
 // Method 15:
 public static Map<Character, Integer> countStringsStartingWith(List<String> stringList) {
   Map<Character, Integer> countMap = new HashMap<>();
   // Iterate through the list of strings
   for (String str : stringList) {
       // Get the first character of the string
       char firstChar = str.charAt(0);
       // Update the count in the map
       countMap.put(firstChar, countMap.getOrDefault(firstChar, 0) + 1);
   }
   return countMap;
}
 
 // Method 14:
 public static String dictionaryLookup(Map<String, String> wordMap, String word) {
   return wordMap.getOrDefault(word, "Word not found in dictionary");
}
 
 // Method 12:
 public static Set<Integer> filterEvenNumbers(Set<Integer> integerSet) {
   Set<Integer> evenNumbersSet = new HashSet<>();
   // Iterate through the set of integers
   for (Integer num : integerSet) {
       // Check if the number is even
       if (num % 2 == 0) {
           // Add the even number to the set of even numbers
           evenNumbersSet.add(num);
       }
   }
   return evenNumbersSet;
}
 
 // Method 11:
 public static List<String> setToList(Set<String> stringSet) {
   List<String> stringList = new ArrayList<>(stringSet);
   return stringList;
}

 // Method 10:
 public static Set<String> filterStringsStartingWith(Set<String> stringSet, char startChar) {
   Set<String> filteredSet = new HashSet<>();
   // Iterate through the set of strings
   for (String str : stringSet) {
       // Check if the string starts with the specified character
       if (str.charAt(0) == startChar) {
           // Add the string to the filtered set
           filteredSet.add(str);
       }
   }
   return filteredSet;
}
 
 // Method 8:
 public static List<Integer> stringLengths(List<String> cars) {
   List<Integer> lengths = new ArrayList<>();
   // Iterate through the list of strings
   for (String car : cars) {
       // Add the length of each string to the lengths list
       lengths.add(car.length());
   }
   return lengths;
}
 // Method 7:
 public static List<List<Integer>> divideNumbers(List<Integer> numbers) {
   List<List<Integer>> dividedLists = new ArrayList<>();
   dividedLists.add(new ArrayList<>()); // List for numbers divisible by 2
   dividedLists.add(new ArrayList<>()); // List for numbers divisible by 3
   dividedLists.add(new ArrayList<>()); // List for numbers divisible by 5
   dividedLists.add(new ArrayList<>()); // List for numbers not divisible by 2, 3, or 5
   
   // Iterate through the list of numbers
   for (Integer num : numbers) {
       // Check divisibility by 2, 3, and 5
       if (num % 2 == 0) {
           dividedLists.get(0).add(num); // Add to the list of numbers divisible by 2
       }
       if (num % 3 == 0) {
           dividedLists.get(1).add(num); // Add to the list of numbers divisible by 3
       }
       if (num % 5 == 0) {
           dividedLists.get(2).add(num); // Add to the list of numbers divisible by 5
       }
       // Check if not divisible by 2, 3, or 5
       if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
           dividedLists.get(3).add(num); // Add to the list of numbers not divisible by 2, 3, or 5
       }
   }
   return dividedLists;
}
 // Method 6:
 public static List<String> search(List<String> cars, String query) {
   List<String> results = new ArrayList<>();
   for (String car : cars) {
       if (car.contains(query)) {
           results.add(car);
       }
   } 
   return results;
}
 // Method 5:
 public static String concatenateWithComma(List<String> cars) {
   StringBuilder sb = new StringBuilder();
   for (int i = 0; i < cars.size(); i++) {
       sb.append(cars.get(i));
       if (i < cars.size() - 1) {
           sb.append(",");
       }
   }
   return sb.toString();
}
 // Method 4:
 public static List<String> switchFirstAndLast(List<String> cars) {
   String temp = cars.get(0);
   cars.set(0, cars.get(cars.size() - 1));
   cars.set(cars.size() - 1, temp);
   return cars; 
 }
 // Method 3:
 public static String findShortestString(List<String> strings) {
   if (strings.isEmpty()) {
       return null;
   }
   String shortest = strings.get(0);
   for (String str : strings) {
       if (str.length() < shortest.length()) {
           shortest = str;
       }
   }
   return shortest;
}
 }