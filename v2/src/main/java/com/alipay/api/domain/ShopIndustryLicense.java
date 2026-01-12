package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店行业资质
 *
 * @author auto create
 * @since 1.0, 2023-11-09 11:32:40
 */
public class ShopIndustryLicense extends AlipayObject {

	private static final long serialVersionUID = 3752197699465261818L;

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
