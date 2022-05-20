package string.problems;
public class DuplicateWord {

        public static void main(String[] args) {
            String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
            int count;
            int wordCount = 0;
            double sum = 0;

            st = st.toLowerCase();
            String words[] = st.split(" ");

            System.out.println("Duplicate words: ");
            for (int i=0; i < words.length; i++) {
                count = 1;
                for (int j = i+1; j <words.length; j++) {
                    if(words[i].equals(words[j])) {
                        count++;
                        words[j] = "0";
                    }
                }
                for (String word : words) {
                    double wordLength = word.length();
                    sum += wordLength;
                    wordCount++;
                }
                if(count > 1 && words[i]!= "0")
                    System.out.println(words[i] + " - " + count);
            }
            double average = 0;
            if (wordCount > 0) {
                average = sum / wordCount;
            }
            System.out.println("Average word length: " + average);
        }
    }



}
