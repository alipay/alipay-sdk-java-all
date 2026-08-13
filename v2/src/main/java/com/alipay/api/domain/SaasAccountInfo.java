package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-13 14:47:50
 */
public class SaasAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 1596386783653376544L;

	/**
	 * SaaS客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 账户当前企业主体的企业登记号，用于标识企业主体。境内企业通常填写统一社会信用代码。
	 */
	@ApiField("enterprise_registration_no")
	private String enterpriseRegistrationNo;

	/**
	 * 机构账户名称
	 */
	@ApiField("inst_account_name")
	private String instAccountName;

	/**
	 * 机构账户号
	 */
	@ApiField("inst_account_no")
	private String instAccountNo;

	/**
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEnterpriseRegistrationNo() {
		return this.enterpriseRegistrationNo;
	}
	public void setEnterpriseRegistrationNo(String enterpriseRegistrationNo) {
		this.enterpriseRegistrationNo = enterpriseRegistrationNo;
	}

	public String getInstAccountName() {
		return this.instAccountName;
	}
	public void setInstAccountName(String instAccountName) {
		this.instAccountName = instAccountName;
	}

	public String getInstAccountNo() {
		return this.instAccountNo;
	}
	public void setInstAccountNo(String instAccountNo) {
		this.instAccountNo = instAccountNo;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

}
