package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.isv.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-14 11:15:03
 */
public class AlipayOpenMiniIsvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5427318492376166428L;

	/** 
	 * 小程序appId，商家确认后非空，若商家未确认或超时返回空
	 */
	@ApiField("min_app_id")
	private String minAppId;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单号，开发者帐号+外部订单号维度来控制请求务幂等
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * PROCESS处理中，TIMEOUT超时，AGREED同意， REJECTED拒绝
	 */
	@ApiField("status")
	private String status;

	public void setMinAppId(String minAppId) {
		this.minAppId = minAppId;
	}
	public String getMinAppId( ) {
		return this.minAppId;
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

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
