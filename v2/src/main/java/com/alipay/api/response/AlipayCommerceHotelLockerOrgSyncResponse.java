package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hotel.locker.org.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 09:57:39
 */
public class AlipayCommerceHotelLockerOrgSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6215987859628651624L;

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
