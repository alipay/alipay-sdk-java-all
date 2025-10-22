package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdf.serviceright.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-20 20:31:43
 */
public class AlipayCommerceHdfServicerightCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8353348616151592131L;

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
	 * 权益数量
	 */
	@ApiField("right_cnt")
	private String rightCnt;

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

}
