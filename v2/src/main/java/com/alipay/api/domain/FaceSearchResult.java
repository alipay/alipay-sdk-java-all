package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸搜索结果
 *
 * @author auto create
 * @since 1.0, 2018-11-13 20:47:09
 */
public class FaceSearchResult extends AlipayObject {

	private static final long serialVersionUID = 5463725155821948753L;

	/**
	 * faceType
	 */
	@ApiField("face_type")
	private String faceType;

	/**
	 * 分数
	 */
	@ApiField("score")
	private String score;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 身份证姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getFaceType() {
		return this.faceType;
	}
	public void setFaceType(String faceType) {
		this.faceType = faceType;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
