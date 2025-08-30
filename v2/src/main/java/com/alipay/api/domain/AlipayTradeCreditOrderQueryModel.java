package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付信用订单查询
 *
 * @author auto create
 * @since 1.0, 2025-08-18 17:05:38
 */
public class AlipayTradeCreditOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1529945226268561521L;

	/**
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/**
	 * 外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

}
