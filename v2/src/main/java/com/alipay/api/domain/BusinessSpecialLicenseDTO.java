package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 特殊资质信息
 *
 * @author auto create
 * @since 1.0, 2023-01-09 21:06:59
 */
public class BusinessSpecialLicenseDTO extends AlipayObject {

	private static final long serialVersionUID = 1419614768824797213L;

	/**
	 * 特殊资质图片
	 */
	@ApiField("license_pic")
	private String licensePic;

	/**
	 * 特殊资质类型
	 */
	@ApiField("license_type")
	private String licenseType;

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
