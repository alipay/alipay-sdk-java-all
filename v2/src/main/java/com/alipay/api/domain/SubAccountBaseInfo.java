package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子账号识别信息
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:18:00
 */
public class SubAccountBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 8623289299956792214L;

	/**
	 * 主账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 全球化银行缩写
	 */
	@ApiField("out_fin_inst_abbreviation")
	private String outFinInstAbbreviation;

	/**
	 * 子账号
	 */
	@ApiField("sub_account_no")
	private String subAccountNo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOutFinInstAbbreviation() {
		return this.outFinInstAbbreviation;
	}
	public void setOutFinInstAbbreviation(String outFinInstAbbreviation) {
		this.outFinInstAbbreviation = outFinInstAbbreviation;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}
	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

}
