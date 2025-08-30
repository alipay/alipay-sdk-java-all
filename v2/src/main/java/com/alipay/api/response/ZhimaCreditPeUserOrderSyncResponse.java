package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:59
 */
public class ZhimaCreditPeUserOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3726448181358551221L;

	/** 
	 * 芝麻信用服务业务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 信用服务订单状态.

INIT: 下单状态; 

WAIT_FULFILL: 
订单待守约；

CLOSED：订单取消；

COMPLETE：订单已守约
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部请求幂等号，即接口入参的out_request_no，接口处理完之后回传
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 业务处理是否成功标记，成功返回true，其他情况下返回false
	 */
	@ApiField("success")
	private Boolean success;

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
