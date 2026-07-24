package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照信息
 *
 * @author auto create
 * @since 1.0, 2026-07-22 13:47:51
 */
public class LubBusinessCopyLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 2699849187737768251L;

	/**
	 * 营业执照图片OSS Key
	 */
	@ApiField("bl_image_oss")
	private String blImageOss;

	/**
	 * 营业执照图片URL
	 */
	@ApiField("bl_image_url")
	private String blImageUrl;

	/**
	 * 营业执照法人姓名
	 */
	@ApiField("bl_legal_person_name")
	private String blLegalPersonName;

	/**
	 * 营业执照主体名称
	 */
	@ApiField("bl_license_name")
	private String blLicenseName;

	/**
	 * 营业执照编号（统一社会信用代码）
	 */
	@ApiField("bl_license_no")
	private String blLicenseNo;

	/**
	 * 营业执照有效期结束，格式 yyyy-MM-dd，空表示长期有效
	 */
	@ApiField("bl_valid_end_date")
	private String blValidEndDate;

	/**
	 * 营业执照有效期开始，格式 yyyy-MM-dd
	 */
	@ApiField("bl_valid_start_date")
	private String blValidStartDate;

	public String getBlImageOss() {
		return this.blImageOss;
	}
	public void setBlImageOss(String blImageOss) {
		this.blImageOss = blImageOss;
	}

	public String getBlImageUrl() {
		return this.blImageUrl;
	}
	public void setBlImageUrl(String blImageUrl) {
		this.blImageUrl = blImageUrl;
	}

	public String getBlLegalPersonName() {
		return this.blLegalPersonName;
	}
	public void setBlLegalPersonName(String blLegalPersonName) {
		this.blLegalPersonName = blLegalPersonName;
	}

	public String getBlLicenseName() {
		return this.blLicenseName;
	}
	public void setBlLicenseName(String blLicenseName) {
		this.blLicenseName = blLicenseName;
	}

	public String getBlLicenseNo() {
		return this.blLicenseNo;
	}
	public void setBlLicenseNo(String blLicenseNo) {
		this.blLicenseNo = blLicenseNo;
	}

	public String getBlValidEndDate() {
		return this.blValidEndDate;
	}
	public void setBlValidEndDate(String blValidEndDate) {
		this.blValidEndDate = blValidEndDate;
	}

	public String getBlValidStartDate() {
		return this.blValidStartDate;
	}
	public void setBlValidStartDate(String blValidStartDate) {
		this.blValidStartDate = blValidStartDate;
	}

}
