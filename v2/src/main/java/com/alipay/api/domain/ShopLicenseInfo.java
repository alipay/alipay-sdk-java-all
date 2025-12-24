package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主体证照信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:09:26
 */
public class ShopLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 5631816517374974752L;

	/**
	 * 证件到期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 主体证件名称
	 */
	@ApiField("license_name")
	private String licenseName;

	/**
	 * 主体证件号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 主体证件图片
	 */
	@ApiField("license_pic")
	private String licensePic;

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getLicenseName() {
		return this.licenseName;
	}
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLicensePic() {
		return this.licensePic;
	}
	public void setLicensePic(String licensePic) {
		this.licensePic = licensePic;
	}

}
