package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款方付款方式
 *
 * @author auto create
 * @since 1.0, 2022-06-23 20:29:14
 */
public class PayerPaymentDTO extends AlipayObject {

	private static final long serialVersionUID = 6811665179345493562L;

	/**
	 * 付款渠道的真实姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 付款方式账号，如果是银行卡支付，该字段为卡号；如果支付余额支付该字段类型为用户uid
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 机构名称。如果支付方式不为银行卡，该字段不填
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 指定支付渠道。支持传入的值：
支付宝可用余额：AVAILABLE_BALANCE，
银行卡：BANK_CARD
	 */
	@ApiField("pay_tool_type")
	private String payToolType;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getPayToolType() {
		return this.payToolType;
	}
	public void setPayToolType(String payToolType) {
		this.payToolType = payToolType;
	}

}
