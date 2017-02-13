package com.zen.smi.dao.entities;

// Generated Aug 15, 2015 9:17:09 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Messages generated by hbm2java
 */
@Entity
@Table(name = "messages", catalog = "")
public class Messages implements java.io.Serializable {

	private Integer messageId;
	private String name;
	private String type;
	private String code;
	private String textEn;

	public Messages() {
	}

	public Messages(String name, String type, String code, String textEn) {
		this.name = name;
		this.type = type;
		this.code = code;
		this.textEn = textEn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "message_id", unique = true, nullable = false)
	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "type", length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "code", length = 45)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "text_en", length = 65535)
	public String getTextEn() {
		return this.textEn;
	}

	public void setTextEn(String textEn) {
		this.textEn = textEn;
	}

}
