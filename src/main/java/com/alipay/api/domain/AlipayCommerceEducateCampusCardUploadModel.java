package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户学生证信息同步
 *
 * @author auto create
 * @since 1.0, 2021-01-11 11:30:49
 */
public class AlipayCommerceEducateCampusCardUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1544589372732283716L;

	/**
	 * 逐步废弃，请使用card_pictures字段！学生证照片链接(可多张)。注：需要提供图片oss URL访问地址，且url需要长期有效
	 */
	@ApiListField("campus_card_picture")
	@ApiField("string")
	private List<String> campusCardPicture;

	/**
	 * 学生证图片链接list，包含图片类型
	 */
	@ApiListField("card_pictures")
	@ApiField("campus_card_picture")
	private List<CampusCardPicture> cardPictures;

	/**
	 * 学历，枚举类型：专科0，本科1，研究生2，博士3
	 */
	@ApiField("degree")
	private String degree;

	/**
	 * 入学时间，格式yyyy-mm-dd，不传无法自动机器审核
	 */
	@ApiField("enroll_date")
	private Date enrollDate;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	public List<String> getCampusCardPicture() {
		return this.campusCardPicture;
	}
	public void setCampusCardPicture(List<String> campusCardPicture) {
		this.campusCardPicture = campusCardPicture;
	}

	public List<CampusCardPicture> getCardPictures() {
		return this.cardPictures;
	}
	public void setCardPictures(List<CampusCardPicture> cardPictures) {
		this.cardPictures = cardPictures;
	}

	public String getDegree() {
		return this.degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Date getEnrollDate() {
		return this.enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
