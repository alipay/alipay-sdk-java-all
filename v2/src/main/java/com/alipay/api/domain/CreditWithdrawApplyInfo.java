package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码资产授信取款申请明细
 *
 * @author auto create
 * @since 1.0, 2024-03-14 15:17:41
 */
public class CreditWithdrawApplyInfo extends AlipayObject {

	private static final long serialVersionUID = 7886833281842799453L;

	/**
	 * 支付宝流水号
	 */
	@ApiField("alipay_pay_no")
	private String alipayPayNo;

	/**
	 * 请款金额，单位元，精度分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAlipayPayNo() {
		return this.alipayPayNo;
	}
	public void setAlipayPayNo(String alipayPayNo) {
		this.alipayPayNo = alipayPayNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
