package Quiz;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
public class QuizCard {
    private String Question;
    private String Answer;
    public QuizCard (String Question, String Answer){
        this.Question = Question;
        this.Answer = Answer;
    }

    public String getQuestion() {
        return Question;
    }

    public String getAnswer() {
        return Answer;
    }
}

