package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 科普内容
 *
 * @author auto create
 * @since 1.0, 2026-04-16 17:47:45
 */
public class ArticleVo extends AlipayObject {

	private static final long serialVersionUID = 4525455386522941962L;

	/**
	 * 科普文字内容
	 */
	@ApiField("article_content")
	private String articleContent;

	/**
	 * 科普ID
	 */
	@ApiField("article_id")
	private String articleId;

	/**
	 * 科普主题
	 */
	@ApiField("article_title")
	private String articleTitle;

	/**
	 * 科普类型
	 */
	@ApiField("article_type")
	private String articleType;

	/**
	 * 医生头像
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 视频时长，单位：秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 是否三甲
	 */
	@ApiField("third_class")
	private Boolean thirdClass;

	/**
	 * 医生职称
	 */
	@ApiField("title")
	private String title;

	public String getArticleContent() {
		return this.articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleId() {
		return this.articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleType() {
		return this.articleType;
	}
	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Boolean getThirdClass() {
		return this.thirdClass;
	}
	public void setThirdClass(Boolean thirdClass) {
		this.thirdClass = thirdClass;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
