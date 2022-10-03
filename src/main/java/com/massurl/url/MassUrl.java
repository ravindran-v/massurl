package com.massurl.url;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class MassUrl {

	@Id
	@GeneratedValue
	private long massUrlId;

	@NotBlank(message = "Url cannot be empty")
	private String originalUrl;

	private long viewCount;

	public MassUrl() {
	}

	public MassUrl(long massUrlId, String originalUrl, long viewCount) {
		super();
		this.massUrlId = massUrlId;
		this.originalUrl = originalUrl;
		this.viewCount = viewCount;
	}

	public long getMassUrlId() {
		return massUrlId;
	}

	public void setMassUrlId(long massUrlId) {
		this.massUrlId = massUrlId;
	}

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public long getViewCount() {
		return viewCount;
	}

	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

}
