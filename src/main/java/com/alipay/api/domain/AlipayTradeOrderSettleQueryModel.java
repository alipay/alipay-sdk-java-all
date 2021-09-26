package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易分账查询接口
 *
 * @author auto create
 * @since 1.0, 2021-08-30 19:36:14
 */
public class AlipayTradeOrderSettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3898322579778153765L;

	/**
	 * 支付宝分账请求单号
	 */
	@ApiField("settle_no")
	private String settleNo;

	public String getSettleNo() {
		return this.settleNo;
	}
	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

}
