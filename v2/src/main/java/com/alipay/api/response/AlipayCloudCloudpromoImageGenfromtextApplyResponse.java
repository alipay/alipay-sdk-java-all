package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.image.genfromtext.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-13 16:06:54
 */
public class AlipayCloudCloudpromoImageGenfromtextApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6757939337572647182L;

	/** 
	 * 支付宝内部订单id，唯一
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务号，原样返回商户请求号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

}
