public class Question {
   int id;
   private String question;
   private String answer;
   private String opt1;
   private String opt2;
   private String opt3;
   private String opt4;

// Constructor
   public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
    this.id = id;
    this.question = question;
    this.opt1 = opt1;
    this.opt2 = opt2;
    this.opt3 = opt3;
    this.opt4 = opt4;
    this.answer = answer;
}
    public String getAnswer() {
    return answer;
    }
    public void setAnswer(String answer) {
    this.answer = answer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getopt1() {
        return opt1;
    }
    public void setopt1(String opt1) {
        this.opt1 = opt1;
    }
    public String getopt2() {
        return opt2;
    }
    public void setopt2(String opt1) {
        this.opt2 = opt2;
    }
    public String getopt3() {
        return opt3;
    }
    public void setopt3(String opt1) {
        this.opt3 = opt3;
    }
    public String getopt4() {
        return opt4;
    }
    public void setopt4(String opt1) {
        this.opt4 = opt4;
    }
    // @Override
    // public String toString() {
    //     return "Question [id=" + id + ", question=" + question + ", answer=" + answer + ", opt1=" + opt1 + ", opt2="
    //             + opt2 + ", opt3=" + opt3 + ", opt4=" + opt4 + "]";
    // }

}
