package toDimensionalArray.opgave3MutipelChoice;

import java.util.Arrays;

public class MultipleChoice {
    private char[] correctAnswer = { 'B', 'C', 'A', 'A', 'B', 'A', 'C', 'D', 'A', 'C' };

    private char[][] studentAnswers;

    public MultipleChoice(int numberOfStudents) {
        studentAnswers = new char[numberOfStudents][10];
        for (int i = 0; i < studentAnswers.length; i++) {
            for (int j = 0; j < studentAnswers[i].length; j++) {
                int tal = (int) (Math.random() * 4); // tal mellem 0-3
                char c = (char) (tal + 'A');
                studentAnswers[i][j] = c;
            }
        }
    }

    public void printStudentAnswers() {
        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Student " + (i + 1) + " resultat: ");
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (j != 0) {
                    System.out.print(", ");
                }
                System.out.print(studentAnswers[i][j]);
            }
            System.out.println();
        }
    }

    public void printCorrectAnswers() {
        System.out.println("De korrekte svar:  " + Arrays.toString(correctAnswer));
    }

    /**
     * Udskriver for hver studerende antallet af rigtige svar
     */
    public void printCorrectAnswersPrStudent() {
    	int correct = 0;
    	System.out.println("Nedenfor finder du antallet af korrekte svar for hver student:");
        for(int i = 0; i < studentAnswers.length; i++) {
        	for(int j = 0; j < studentAnswers[i].length; j++) {
        		if(studentAnswers[i][j] == correctAnswer[j]) {
        			correct++;
        		}
        		
        		
        	}
        	System.out.println("Spiller " + (i+1) + " fik: " + correct + " rigtig(e)!");
        	correct = 0;
        }
    }

    /**
     * Udskriver for hver spørgsmål antallet af rigtige svar
     */
    public void printCorrectAnswerPrQuestion() {
    	int correct = 0;
    	System.out.println("Nedenfor finder du antallet af korrekte svar på hvert spørgsmål:");
        for(int i = 0; i < studentAnswers[0].length; i++) {
        	for(int j = 0; j < studentAnswers.length; j++) {
        		if(studentAnswers[j][i] == correctAnswer[j]) {
        			correct++;
        			
        		}
        		
        	}
        	System.out.println("Spørgsmål " + (i+1) + " blev svaret rigtig " + correct + " gang(e)!");
    		correct = 0;
        	
        	
        	
        	
        }
    }

}
