package com.kognitiv.backend.assignment.model;

import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@Table(name = "Image")
@ApiModel(value = "Images", description = "Photos details")
public class Image {

	private Long albumId;
	private Long id;
	private String title;
	private String url;
	private String thumbnailUrl;

	public Long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
}