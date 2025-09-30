package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心付开通接口——资质
 *
 * @author auto create
 * @since 1.0, 2024-11-27 15:37:19
 */
public class SettleInMerchantLicense extends AlipayObject {

	private static final long serialVersionUID = 1226297624851749775L;

	/**
	 * 商户上传资质详情
	 */
	@ApiListField("common_merchant_licenses")
	@ApiField("common_merchant_license")
	private List<CommonMerchantLicense> commonMerchantLicenses;

	/**
	 * 商户二级类目code
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 商户简称。用于芝麻信用服务开通。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系方式
	 */
	@ApiField("phone")
	private String phone;

	public List<CommonMerchantLicense> getCommonMerchantLicenses() {
		return this.commonMerchantLicenses;
	}
	public void setCommonMerchantLicenses(List<CommonMerchantLicense> commonMerchantLicenses) {
		this.commonMerchantLicenses = commonMerchantLicenses;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
