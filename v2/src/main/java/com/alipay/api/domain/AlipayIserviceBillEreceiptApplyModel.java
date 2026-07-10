package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请电子账回单
 *
 * @author auto create
 * @since 1.0, 2026-06-29 12:32:55
 */
public class AlipayIserviceBillEreceiptApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5344151529644742485L;

	/**
	 * 支付宝资金流水号。发薪转账成功后返回的唯一标识，可通过星云薪酬发薪结果获取。
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	public String getPayFundOrderId() {
		return this.payFundOrderId;
	}
	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}

}
