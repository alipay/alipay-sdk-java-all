package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.carfin.orgexpress.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-04 15:32:53
 */
public class XingheLendassistCarfinOrgexpressCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3168614413543488894L;

	/** 
	 * 星河侧快递单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/** 
	 * 取件码
	 */
	@ApiField("pickup_code")
	private String pickupCode;

	/** 
	 * 拒绝原因
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 1：创建成功
2：创建失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 运单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}
	public String getExpressNo( ) {
		return this.expressNo;
	}

	public void setPickupCode(String pickupCode) {
		this.pickupCode = pickupCode;
	}
	public String getPickupCode( ) {
		return this.pickupCode;
	}

	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}
	public String getTrackingNo( ) {
		return this.trackingNo;
	}

}
