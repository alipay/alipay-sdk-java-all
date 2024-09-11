package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家个体工商户创建接口
 *
 * @author auto create
 * @since 1.0, 2022-04-20 17:51:16
 */
public class AntMerchantExpandMerchantIndividualCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4785459781957659715L;

	/**
	 * 商户证件编号（企业或者个体工商户提供营业执照，事业单位提供事证号）
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 营业执照图片，图片字节流base64编码后传入。
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBusinessLicense() {
		return this.businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
