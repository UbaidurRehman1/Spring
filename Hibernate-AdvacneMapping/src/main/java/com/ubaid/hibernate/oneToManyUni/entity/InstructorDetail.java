package com.ubaid.hibernate.oneToManyUni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * As this is mapped by Instructor and I am making it unidirectional 
 * so there is no need fo Instructor instance
 * @author UbaidurRehman
 *
 */

@Entity
@Table(name="instructor_detail")
public class InstructorDetail
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="hobby")
	private String hobby;
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	
	public InstructorDetail()
	{

	}

	public InstructorDetail(String hobby, String youtubeChannel)
	{
		super();
		this.hobby = hobby;
		this.youtubeChannel = youtubeChannel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", hobby=" + hobby + ", youtubeChannel=" + youtubeChannel + "]";
	}
	
}
