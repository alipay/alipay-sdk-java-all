package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行机构根据银行充值订单号查询该笔支付在支付宝的交易详情
 *
 * @author auto create
 * @since 1.0, 2016-02-05 14:41:59
 */
public class AlipaySecurityDataFinanceDisputeModel extends AlipayObject {

	private static final long serialVersionUID = 7634166454429744628L;

	/**
	 * 银行机构代码
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 充值订单号
	 */
	@ApiField("instruction_id")
	private String instructionId;

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getInstructionId() {
		return this.instructionId;
	}
	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}

}
