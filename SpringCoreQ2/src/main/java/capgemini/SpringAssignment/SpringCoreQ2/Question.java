package capgemini.SpringAssignment.SpringCoreQ2;

import org.springframework.stereotype.Component;

@Component
public class Question {
	String questions;
	int questionId;
	String answers;
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [questions=" + questions + ", questionId=" + questionId + ", answers=" + answers + "]";
	}
	

}
