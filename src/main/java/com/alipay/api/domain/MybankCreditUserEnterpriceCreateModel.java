package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过企业证件创建网商企业会员
 *
 * @author auto create
 * @since 1.0, 2017-09-21 16:40:02
 */
public class MybankCreditUserEnterpriceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5557879623174478628L;

	/**
	 * 企业名称
	 */
	@ApiField("enterprice_name")
	private String enterpriceName;

	/**
	 * 企业关联手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 营业执照号
	 */
	@ApiField("national_legal")
	private String nationalLegal;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("national_legal_merge")
	private String nationalLegalMerge;

	public String getEnterpriceName() {
		return this.enterpriceName;
	}
	public void setEnterpriceName(String enterpriceName) {
		this.enterpriceName = enterpriceName;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNationalLegal() {
		return this.nationalLegal;
	}
	public void setNationalLegal(String nationalLegal) {
		this.nationalLegal = nationalLegal;
	}

	public String getNationalLegalMerge() {
		return this.nationalLegalMerge;
	}
	public void setNationalLegalMerge(String nationalLegalMerge) {
		this.nationalLegalMerge = nationalLegalMerge;
	}

}
