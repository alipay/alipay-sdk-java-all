package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法人身份证信息，与business_license_info同时传或同时不传
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:56
 */
public class LumLegalPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 4296612798713239931L;

	/**
	 * 法人身份证反面图片URL
	 */
	@ApiField("id_image_url_back")
	private String idImageUrlBack;

	/**
	 * 法人身份证正面图片URL
	 */
	@ApiField("id_image_url_front")
	private String idImageUrlFront;

	/**
	 * 法人身份证姓名
	 */
	@ApiField("id_legal_person_name")
	private String idLegalPersonName;

	/**
	 * 法人身份证号
	 */
	@ApiField("id_license_no")
	private String idLicenseNo;

	/**
	 * 法人身份证有效期结束，格式yyyy-MM-dd，空表示长期有效
	 */
	@ApiField("id_valid_end_date")
	private String idValidEndDate;

	/**
	 * 法人身份证有效期开始，格式yyyy-MM-dd
	 */
	@ApiField("id_valid_start_date")
	private String idValidStartDate;

	public String getIdImageUrlBack() {
		return this.idImageUrlBack;
	}
	public void setIdImageUrlBack(String idImageUrlBack) {
		this.idImageUrlBack = idImageUrlBack;
	}

	public String getIdImageUrlFront() {
		return this.idImageUrlFront;
	}
	public void setIdImageUrlFront(String idImageUrlFront) {
		this.idImageUrlFront = idImageUrlFront;
	}

	public String getIdLegalPersonName() {
		return this.idLegalPersonName;
	}
	public void setIdLegalPersonName(String idLegalPersonName) {
		this.idLegalPersonName = idLegalPersonName;
	}

	public String getIdLicenseNo() {
		return this.idLicenseNo;
	}
	public void setIdLicenseNo(String idLicenseNo) {
		this.idLicenseNo = idLicenseNo;
	}

	public String getIdValidEndDate() {
		return this.idValidEndDate;
	}
	public void setIdValidEndDate(String idValidEndDate) {
		this.idValidEndDate = idValidEndDate;
	}

	public String getIdValidStartDate() {
		return this.idValidStartDate;
	}
	public void setIdValidStartDate(String idValidStartDate) {
		this.idValidStartDate = idValidStartDate;
	}

}
