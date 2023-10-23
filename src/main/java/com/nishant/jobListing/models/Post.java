package com.nishant.jobListing.models;

import java.math.BigInteger;
import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "JobPost")
public class Post {

	@Id
	private BigInteger _id;
	
	private String desc;
	private String profile;
	private int exp;
	private String[] techs;
	
	
	
	
	
	public BigInteger getId() {
		return _id;
	}
	public void setId(BigInteger _id) {
		this._id = _id;
	}
	public Post() {
		super();
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
	@Override
	public String toString() {
		return "Post [id=" + _id + ", desc=" + desc + ", profile=" + profile + ", exp=" + exp + ", techs="
				+ Arrays.toString(techs) + "]";
	}
}
