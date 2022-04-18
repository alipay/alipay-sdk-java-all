package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步企业税务信息
 *
 * @author auto create
 * @since 1.0, 2020-04-13 09:54:06
 */
public class AlipayEbppInvoiceCompanySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 3582988846731877316L;

	/**
	 * 拓展字段，json格式
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 企业税务信息
	 */
	@ApiField("invoice_company")
	private InvoiceCompanyInfo invoiceCompany;

	/**
	 * 支付宝开票链路必传， 定义商户的一级简称，用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。 只能包含大小写字母，数字，或下划线。匹配规则：^[A-Za-z0-9][A-Za-z_0-9]*$
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 业务平台code, 由发票中台分配，工单入驻商户时不填，
非工单入驻时候必填。
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 业务平台商户ID/用户ID，工单入驻商户时不填， 非工单入驻时候必填。
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 入驻工单ID，由发票中台生成。通过工单入驻商户时，必传
	 */
	@ApiField("register_id")
	private String registerId;

	/**
	 * 支付宝开票链路必传， 定义商户的二级简称，用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的"商户门店简称"。 如：肯德基-杭州西湖区文一西路店：KFC_HZ_19003 要求："商户品牌简称+商户门店简称"作为确定商户及其下属机构的唯一标识，不可重复。
只能包含大小写字母，数字，或下划线。匹配规则：^[A-Za-z0-9][A-Za-z_0-9]*$
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public InvoiceCompanyInfo getInvoiceCompany() {
		return this.invoiceCompany;
	}
	public void setInvoiceCompany(InvoiceCompanyInfo invoiceCompany) {
		this.invoiceCompany = invoiceCompany;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
