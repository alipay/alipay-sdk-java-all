package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdf.serviceright.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-21 19:42:40
 */
public class AlipayCommerceHdfServicerightConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8327586143364141822L;

	/** 
	 * 业务身份
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/** 
	 * 占用信息
	 */
	@ApiField("occupy_result")
	private Boolean occupyResult;

	/** 
	 * 外部userid
	 */
	@ApiField("open_partner_user_id")
	private String openPartnerUserId;

	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}
	public String getBizIdentity( ) {
		return this.bizIdentity;
	}

	public void setOccupyResult(Boolean occupyResult) {
		this.occupyResult = occupyResult;
	}
	public Boolean getOccupyResult( ) {
		return this.occupyResult;
	}

	public void setOpenPartnerUserId(String openPartnerUserId) {
		this.openPartnerUserId = openPartnerUserId;
	}
	public String getOpenPartnerUserId( ) {
		return this.openPartnerUserId;
	}

}
