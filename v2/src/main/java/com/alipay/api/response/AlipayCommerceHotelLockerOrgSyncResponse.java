package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hotel.locker.org.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-02 11:48:49
 */
public class AlipayCommerceHotelLockerOrgSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5218751477244881499L;

	/** 
	 * 支付宝机构唯一ID
	 */
	@ApiField("alipay_org_id")
	private String alipayOrgId;

	public void setAlipayOrgId(String alipayOrgId) {
		this.alipayOrgId = alipayOrgId;
	}
	public String getAlipayOrgId( ) {
		return this.alipayOrgId;
	}

}
