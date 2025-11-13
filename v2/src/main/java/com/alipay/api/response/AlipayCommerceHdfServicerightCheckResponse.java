package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdf.serviceright.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-28 18:57:40
 */
public class AlipayCommerceHdfServicerightCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 6461821315994442793L;

	/** 
	 * 业务身份
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/** 
	 * 是否有权益
	 */
	@ApiField("has_right")
	private Boolean hasRight;

	/** 
	 * 三方UID
	 */
	@ApiField("open_partner_user_id")
	private String openPartnerUserId;

	/** 
	 * 权益剩余数量
	 */
	@ApiField("right_cnt")
	private String rightCnt;

	/** 
	 * 权益结束时间
	 */
	@ApiField("right_end_time")
	private Date rightEndTime;

	/** 
	 * 权益开始时间
	 */
	@ApiField("right_start_time")
	private Date rightStartTime;

	/** 
	 * 权益总数量
	 */
	@ApiField("right_total_cnt")
	private String rightTotalCnt;

	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}
	public String getBizIdentity( ) {
		return this.bizIdentity;
	}

	public void setHasRight(Boolean hasRight) {
		this.hasRight = hasRight;
	}
	public Boolean getHasRight( ) {
		return this.hasRight;
	}

	public void setOpenPartnerUserId(String openPartnerUserId) {
		this.openPartnerUserId = openPartnerUserId;
	}
	public String getOpenPartnerUserId( ) {
		return this.openPartnerUserId;
	}

	public void setRightCnt(String rightCnt) {
		this.rightCnt = rightCnt;
	}
	public String getRightCnt( ) {
		return this.rightCnt;
	}

	public void setRightEndTime(Date rightEndTime) {
		this.rightEndTime = rightEndTime;
	}
	public Date getRightEndTime( ) {
		return this.rightEndTime;
	}

	public void setRightStartTime(Date rightStartTime) {
		this.rightStartTime = rightStartTime;
	}
	public Date getRightStartTime( ) {
		return this.rightStartTime;
	}

	public void setRightTotalCnt(String rightTotalCnt) {
		this.rightTotalCnt = rightTotalCnt;
	}
	public String getRightTotalCnt( ) {
		return this.rightTotalCnt;
	}

}
