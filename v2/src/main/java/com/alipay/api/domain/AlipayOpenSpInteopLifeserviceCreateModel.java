package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心生活解决方案业务开通
 *
 * @author auto create
 * @since 1.0, 2026-04-07 11:07:45
 */
public class AlipayOpenSpInteopLifeserviceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1513418316387474658L;

	/**
	 * 商户营业执照信息
	 */
	@ApiField("business_license_info")
	private BusinessLicenseInfo businessLicenseInfo;

	/**
	 * 商家联系方式
	 */
	@ApiField("contact_info")
	private LifeServiceContactInfo contactInfo;

	/**
	 * 一体化作业开通主单号，单号为服务商一体化作业主单创建返回值。
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * 商家经营类目编码。参见 <a href="https://opendocs.alipay.com/common/02khjv">商家经营类目2.0</a> 中的“一级类目code_二级类目code”。
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * null
	 */
	@ApiListField("special_license_info")
	@ApiField("special_license_info")
	private List<SpecialLicenseInfo> specialLicenseInfo;

	public BusinessLicenseInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(BusinessLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	public LifeServiceContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(LifeServiceContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public List<SpecialLicenseInfo> getSpecialLicenseInfo() {
		return this.specialLicenseInfo;
	}
	public void setSpecialLicenseInfo(List<SpecialLicenseInfo> specialLicenseInfo) {
		this.specialLicenseInfo = specialLicenseInfo;
	}

}
