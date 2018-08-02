import java.util.Scanner;
public class RemoveSpaceWord {
	
	private static String result="";

	public static void main(String[] args) {
		
		RemoveSpaceWord removeSpaceWord= new RemoveSpaceWord();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence to reduce spaces");
		String sentence= scanner.nextLine();
		
		String resultSpaceRemove= 	reduceSpace(sentence);
		
		System.out.println("Result Sentence (with extra spaces reduced): "+resultSpaceRemove);
		
		System.out.println("Provide a word to be deleted");
		String word= scanner.nextLine();
		System.out.println("Provide its position number");
		int pos= scanner.nextInt();
		
		String resultWordDelete = wordDelete(word,pos);
		System.out.println("Result Sentence (with word deleted): "+resultWordDelete);
	}
	
	public static String reduceSpace(String sentence) {
		
		for(int i=0;i<sentence.length();i++) {
			
			if(sentence.charAt(i)==' ' && sentence.charAt(i+1) == ' ') {    //Loop for removing Space
				//for(int j=i+1;j<sentence.length();j++) {
					//if(sentence.charAt(i) == sentence.charAt(j)) {
						continue;
					}
						else {
							//i=j-1;
							//break;
							result += sentence.charAt(i);
						}
					//}
				//}
			}
			return result;
		}
	
	static String wordDelete(String word, int pos) {//Condition for deleting duplicate word
		String wordDelete = "";
		int counter=0;
		String sen= RemoveSpaceWord.result;
		for(int i=0;i<result.length();i++) {
			
		
			if(result.charAt(i) == ' ') {
				counter++;
			}
			if(counter == pos-1) {
				continue;
			}
			wordDelete += result.charAt(i);
		}
		return wordDelete;
	}
	}

