package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车主名片驾驶证信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 10:20:18
 */
public class ZmCarOwnerDrivingLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 8295741379187614373L;

	/**
	 * 驾驶证失效日期
	 */
	@ApiField("license_expired_date")
	private String licenseExpiredDate;

	/**
	 * 驾驶证图片url
	 */
	@ApiListField("license_img")
	@ApiField("string")
	private List<String> licenseImg;

	/**
	 * 准驾车型
	 */
	@ApiField("license_level")
	private String licenseLevel;

	/**
	 * 驾驶证编号，即身份证号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 驾驶证状态
	 */
	@ApiField("license_state")
	private String licenseState;

	/**
	 * 验证等级，目前只有官方验证
	 */
	@ApiField("verification_level")
	private String verificationLevel;

	public String getLicenseExpiredDate() {
		return this.licenseExpiredDate;
	}
	public void setLicenseExpiredDate(String licenseExpiredDate) {
		this.licenseExpiredDate = licenseExpiredDate;
	}

	public List<String> getLicenseImg() {
		return this.licenseImg;
	}
	public void setLicenseImg(List<String> licenseImg) {
		this.licenseImg = licenseImg;
	}

	public String getLicenseLevel() {
		return this.licenseLevel;
	}
	public void setLicenseLevel(String licenseLevel) {
		this.licenseLevel = licenseLevel;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLicenseState() {
		return this.licenseState;
	}
	public void setLicenseState(String licenseState) {
		this.licenseState = licenseState;
	}

	public String getVerificationLevel() {
		return this.verificationLevel;
	}
	public void setVerificationLevel(String verificationLevel) {
		this.verificationLevel = verificationLevel;
	}

}
