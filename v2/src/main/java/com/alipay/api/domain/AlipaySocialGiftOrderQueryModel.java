package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询订单接口
 *
 * @author auto create
 * @since 1.0, 2018-10-11 21:12:59
 */
public class AlipaySocialGiftOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2649718752491677623L;

	/**
	 * 商户再送礼平台的唯一ID，用于标识具体的调用业务方，需要先在送礼平台进行业务类型的分配之后才看使用。
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 对应送礼平台的主订单ID，可根据此进行订单查询
	 */
	@ApiField("order_id")
	private String orderId;

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
