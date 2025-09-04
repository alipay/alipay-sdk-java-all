package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.videocall.room.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-01 15:01:31
 */
public class AlipayCommercePropertyVideocallRoomCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6221565772624197739L;

	/** 
	 * 业务名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/** 
	 * 业主ID值
	 */
	@ApiField("owner_id")
	private String ownerId;

	/** 
	 * 房间token
	 */
	@ApiField("r_token")
	private String rToken;

	/** 
	 * 视频房间号
	 */
	@ApiField("room_id")
	private String roomId;

	/** 
	 * 视频房间签名
	 */
	@ApiField("room_sign")
	private String roomSign;

	/** 
	 * 子业务名称
	 */
	@ApiField("sub_biz_name")
	private String subBizName;

	/** 
	 * 用于后续访客记录交互
	 */
	@ApiField("visit_biz_id")
	private String visitBizId;

	/** 
	 * 访客用户Id
	 */
	@ApiField("visitor_customer_id")
	private String visitorCustomerId;

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}
	public String getBizName( ) {
		return this.bizName;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerId( ) {
		return this.ownerId;
	}

	public void setrToken(String rToken) {
		this.rToken = rToken;
	}
	public String getrToken( ) {
		return this.rToken;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomId( ) {
		return this.roomId;
	}

	public void setRoomSign(String roomSign) {
		this.roomSign = roomSign;
	}
	public String getRoomSign( ) {
		return this.roomSign;
	}

	public void setSubBizName(String subBizName) {
		this.subBizName = subBizName;
	}
	public String getSubBizName( ) {
		return this.subBizName;
	}

	public void setVisitBizId(String visitBizId) {
		this.visitBizId = visitBizId;
	}
	public String getVisitBizId( ) {
		return this.visitBizId;
	}

	public void setVisitorCustomerId(String visitorCustomerId) {
		this.visitorCustomerId = visitorCustomerId;
	}
	public String getVisitorCustomerId( ) {
		return this.visitorCustomerId;
	}

}
