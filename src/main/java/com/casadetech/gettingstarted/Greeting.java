package com.casadetech.gettingstarted;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
public class Greeting {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String content;
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
}
