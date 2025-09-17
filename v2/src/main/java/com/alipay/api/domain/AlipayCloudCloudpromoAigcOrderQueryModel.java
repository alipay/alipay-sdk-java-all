package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销AIGC订单查询
 *
 * @author auto create
 * @since 1.0, 2023-10-26 11:36:52
 */
public class AlipayCloudCloudpromoAigcOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5289527432928813153L;

	/**
	 * 支付宝内部订单id，唯一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}
