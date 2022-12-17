import java.util.Map;
import java.util.TreeMap;

//Parameters: string
//return a sorted string with the letter count, no spaces, all in lower case.
// 'HelloWorld' => 'd1e1h1l3o2r1w1' 
// loop through and keep a count for each letter. If the letter exists in the output add one to the counter otherwise push the character.
//using a map will speed up the process
public class Main {
  public static void main(String[] args) {
    // Input string
    String input = "Hello, world!";

    // Convert the input string to lowercase
    input = input.toLowerCase();

    // Create a map to store the character counts
    Map<Character, Integer> charCounts = new TreeMap<>();

    // Count the occurrences of each character in the input string
    for (char c : input.toCharArray()) {
      if (charCounts.containsKey(c)) {
        charCounts.put(c, charCounts.get(c) + 1);
      } else {
        charCounts.put(c, 1);
      }
    }

    // Build the output string
    StringBuilder output = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
      output.append(entry.getKey());
      output.append(entry.getValue());
    }

    // Convert the output string to lowercase and sort it by letter
    String sortedOutput = output.toString().toLowerCase();
    char[] sortedChars = sortedOutput.toCharArray();
    java.util.Arrays.sort(sortedChars);
    sortedOutput = new String(sortedChars);

    // Remove the spaces from the sorted output string
    sortedOutput = sortedOutput.replaceAll("\\s+", "");

    // Print the sorted output string with no spaces
    System.out.println(sortedOutput);
  }
}