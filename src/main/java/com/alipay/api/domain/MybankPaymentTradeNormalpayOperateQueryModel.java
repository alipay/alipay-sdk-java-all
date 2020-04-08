package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付操作查询
 *
 * @author auto create
 * @since 1.0, 2019-02-25 19:19:24
 */
public class MybankPaymentTradeNormalpayOperateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8359711612979695842L;

	/**
	 * 创建订单时返回的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 请求流水号；外部平台在请求支付和打款等操作时传入的流水号
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
