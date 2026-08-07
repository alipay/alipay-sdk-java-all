package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本次银行转账实际使用的SaaS账户信息。仅在显式单选银行转账且同步创单成功时返回。
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:57:50
 */
public class SaasAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 4663356273179739441L;

	/**
	 * SaaS客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

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
