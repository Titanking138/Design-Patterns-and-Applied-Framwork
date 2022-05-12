/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpaf_lab10;

/**
 *
 * @author IT069 arjun
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;

    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public Answer() {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
