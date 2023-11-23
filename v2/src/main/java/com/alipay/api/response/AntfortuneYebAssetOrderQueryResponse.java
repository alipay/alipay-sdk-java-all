package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.yeb.asset.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:36:44
 */
public class AntfortuneYebAssetOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6258335261614946951L;

	/** 
	 * 订单关闭方
	 */
	@ApiField("close_by")
	private String closeBy;

	/** 
	 * 订单关闭原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/** 
	 * 订单关闭时间
	 */
	@ApiField("gmt_close")
	private Date gmtClose;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 用户UserId在应用AppId下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单超时时间
	 */
	@ApiField("order_timeout")
	private Date orderTimeout;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setCloseBy(String closeBy) {
		this.closeBy = closeBy;
	}
	public String getCloseBy( ) {
		return this.closeBy;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}
	public String getCloseReason( ) {
		return this.closeReason;
	}

	public void setGmtClose(Date gmtClose) {
		this.gmtClose = gmtClose;
	}
	public Date getGmtClose( ) {
		return this.gmtClose;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderTimeout(Date orderTimeout) {
		this.orderTimeout = orderTimeout;
	}
	public Date getOrderTimeout( ) {
		return this.orderTimeout;
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
