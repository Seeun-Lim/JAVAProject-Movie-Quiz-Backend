package fr.epita.quiz.resources;

import fr.epita.quiz.datamodel.Answer;
import fr.epita.quiz.datamodel.User;

public class AnswerDTO {

	private String content;
	private String loginName;
	
	public AnswerDTO() {
	}
	
	public AnswerDTO(Answer entity) {
		this.content=entity.getContent();
	}
	
	public AnswerDTO(User entity) {
		this.setLoginName(entity.getLoginName());
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
}
