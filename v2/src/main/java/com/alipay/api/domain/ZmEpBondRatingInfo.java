package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工商企业评级记录信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:24
 */
public class ZmEpBondRatingInfo extends AlipayObject {

	private static final long serialVersionUID = 4814173582125418293L;

	/**
	 * 发行人名称
	 */
	@ApiField("issuer_name")
	private String issuerName;

	/**
	 * 评级
	 */
	@ApiField("rating")
	private String rating;

	/**
	 * 变动方向
	 */
	@ApiField("rating_change")
	private String ratingChange;

	/**
	 * 评级公司
	 */
	@ApiField("rating_company")
	private String ratingCompany;

	/**
	 * 评级日期
	 */
	@ApiField("rating_date")
	private String ratingDate;

	/**
	 * 评级对象
	 */
	@ApiField("rating_object")
	private String ratingObject;

	/**
	 * 展望
	 */
	@ApiField("rating_outlook")
	private String ratingOutlook;

	/**
	 * 评级方式
	 */
	@ApiField("rating_type")
	private String ratingType;

	public String getIssuerName() {
		return this.issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getRating() {
		return this.rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRatingChange() {
		return this.ratingChange;
	}
	public void setRatingChange(String ratingChange) {
		this.ratingChange = ratingChange;
	}

	public String getRatingCompany() {
		return this.ratingCompany;
	}
	public void setRatingCompany(String ratingCompany) {
		this.ratingCompany = ratingCompany;
	}

	public String getRatingDate() {
		return this.ratingDate;
	}
	public void setRatingDate(String ratingDate) {
		this.ratingDate = ratingDate;
	}

	public String getRatingObject() {
		return this.ratingObject;
	}
	public void setRatingObject(String ratingObject) {
		this.ratingObject = ratingObject;
	}

	public String getRatingOutlook() {
		return this.ratingOutlook;
	}
	public void setRatingOutlook(String ratingOutlook) {
		this.ratingOutlook = ratingOutlook;
	}

	public String getRatingType() {
		return this.ratingType;
	}
	public void setRatingType(String ratingType) {
		this.ratingType = ratingType;
	}

}
