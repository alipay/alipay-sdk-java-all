package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-02 15:35:00
 */
public class KoubeiCateringOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8421444933155675238L;

	/** 
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 口碑端订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 口碑退款单id
	 */
	@ApiField("refund_id")
	private String refundId;

	/** 
	 * 是否需要重试，true-需要，false-不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundId( ) {
		return this.refundId;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
