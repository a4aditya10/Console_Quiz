import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[10]; // Creates array of references 
    String[] selection = new String[10];// Stores responses from the player 
    public QuestionService(){
        questions[0] = new Question(1, "What is the capital of France?", "London", "Berlin", "Paris", "Madrid", "Paris");

        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", "Mars");
        
        questions[2] = new Question(3, "Who painted the Mona Lisa?", "Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo", "Leonardo da Vinci");
        
        questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
        
        questions[4] = new Question(5, "In which year did World War II end?", "1943", "1944", "1945", "1946", "1945");
        
        questions[5] = new Question(6, "What is the chemical symbol for gold?", "Go", "Gd", "Au", "Ag", "Au");
        
        questions[6] = new Question(7, "Which country is home to the kangaroo?", "New Zealand", "South Africa", "Australia", "Brazil", "Australia");
        
        questions[7] = new Question(8, "What is the largest planet in our solar system?", "Earth", "Mars", "Jupiter", "Saturn", "Jupiter");
        
        questions[8] = new Question(9, "Who wrote 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain", "William Shakespeare");
        
        questions[9] = new Question(10, "What is the capital of Japan?", "Beijing", "Seoul", "Bangkok", "Tokyo", "Tokyo");

    }

    public void playQuiz(){
        int i=0;
        for(Question question : questions){
            System.out.print("Q"+question.getId()+") ");
            System.out.println(question.getQuestion());
            System.out.println();
            System.out.println("-> "+question.getopt1());
            System.out.println("-> "+question.getopt2());
            System.out.println("-> "+question.getopt3());
            System.out.println("-> "+question.getopt4());
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer: ");
            selection[i++] =  sc.nextLine();
            // System.out.println();
            // System.out.println();
            System.out.print("\033[H\033[2J");  
            System.out.flush();

           }
        } 

        public void CalculateScore(){
            int score = 0;
            for(int i=0;i<questions.length;i++){
                Question q = questions[i];
                String ActualAnswer = q.getAnswer();
                String UserAnswer = selection[i];
                UserAnswer=UserAnswer.toLowerCase();
               ActualAnswer= ActualAnswer.toLowerCase();
            if(UserAnswer.equals(ActualAnswer)){
                      score++;
            }
        }

        System.out.println("Your score is: "+score+"/10");
    
      }


}
