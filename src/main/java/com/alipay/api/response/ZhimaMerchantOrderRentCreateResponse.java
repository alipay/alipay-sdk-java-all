package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.rent.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-20 16:13:10
 */
public class ZhimaMerchantOrderRentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1337432444715523698L;

	/** 
	 * 是否准入：
Y-准入
N-不准入
	 */
	@ApiField("admit_state")
	private String admitState;

	/** 
	 * 商户发起借用服务时，需要在借用结束后返回给商户的参数
	 */
	@ApiField("invoke_state")
	private String invokeState;

	/** 
	 * 芝麻信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+4位随机数
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 借用者的userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setAdmitState(String admitState) {
		this.admitState = admitState;
	}
	public String getAdmitState( ) {
		return this.admitState;
	}

	public void setInvokeState(String invokeState) {
		this.invokeState = invokeState;
	}
	public String getInvokeState( ) {
		return this.invokeState;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
