package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 详细信息可扩展复杂结构
 *
 * @author auto create
 * @since 1.0, 2024-04-08 13:42:48
 */
public class EcoDetailLoanInfo extends AlipayObject {

	private static final long serialVersionUID = 1269912395387624814L;

	/**
	 * 借款额度，单位为元，精确到小数点后两位
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 借款事由
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 转账单号
	 */
	@ApiField("trans_no")
	private String transNo;

	/**
	 * 转账方式
	 */
	@ApiField("trans_type")
	private String transType;

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getTransNo() {
		return this.transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	public String getTransType() {
		return this.transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}

}
