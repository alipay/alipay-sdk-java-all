package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店行业资质
 *
 * @author auto create
 * @since 1.0, 2026-04-16 10:22:12
 */
public class ShopIndustryLicense extends AlipayObject {

	private static final long serialVersionUID = 6316249815644762652L;

	/**
	 * 证件过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 资质证件编号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 资质图片信息
	 */
	@ApiField("license_pic")
	private String licensePic;

	/**
	 * 行业资质类型，需使用<a href="https://mdn.alipayobjects.com/mrcheshop/afts/file/iGfGQL0ATkEAAAAAAAAAAAAADiWmAQBr?af_fileName=%E8%B5%84%E8%B4%A8%E7%B1%BB%E5%9E%8B.xlsx">资质列表</a>中类型
	 */
	@ApiField("license_type")
	private String licenseType;

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
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

	public String getLicenseType() {
		return this.licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

}
