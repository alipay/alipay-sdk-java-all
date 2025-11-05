package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:31
 */
public class KoubeiCateringOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5666268471287665332L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
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

}
