package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.airticket.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 15:42:33
 */
public class AlipayCommerceTransportAirticketOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8376299418181121779L;

	/** 
	 * 订单修改时间，与请求入参的modified_time保持一致
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 订单状态code，展示更新后的订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部订单号，与请求中的保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public Date getModifiedTime( ) {
		return this.modifiedTime;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
