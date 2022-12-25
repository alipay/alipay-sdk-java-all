package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付操作查询
 *
 * @author auto create
 * @since 1.0, 2021-04-13 20:31:00
 */
public class MybankPaymentTradeNormalpayOperateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7461512372818442946L;

	/**
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 请求流水号；外部平台在请求支付、退款、打款等操作时传入的流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
