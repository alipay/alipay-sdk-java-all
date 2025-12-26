package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码解决方案业务开通
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:27:42
 */
public class AlipayOpenSpInteopEnterprisecodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4898935874685849426L;

	/**
	 * 商户营业执照信息
	 */
	@ApiField("business_license_info")
	private BusinessLicenseInfo businessLicenseInfo;

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
	 * 特殊行业资质信息
	 */
	@ApiField("special_license_info")
	private SpecialLicenseInfo specialLicenseInfo;

	public BusinessLicenseInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(BusinessLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
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

	public SpecialLicenseInfo getSpecialLicenseInfo() {
		return this.specialLicenseInfo;
	}
	public void setSpecialLicenseInfo(SpecialLicenseInfo specialLicenseInfo) {
		this.specialLicenseInfo = specialLicenseInfo;
	}

}
