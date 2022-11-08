package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 建立合作关系
 *
 * @author auto create
 * @since 1.0, 2022-08-19 12:59:00
 */
public class AlipayMarketingPartnershipsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4842663839371685445L;

	/**
	 * 本次授权给合作方的营销资源。
	 */
	@ApiField("authorized_data")
	private MarketingAuthorizedData authorizedData;

	/**
	 * 合作方相关信息
	 */
	@ApiField("partner")
	private MarketingPartner partner;

	public MarketingAuthorizedData getAuthorizedData() {
		return this.authorizedData;
	}
	public void setAuthorizedData(MarketingAuthorizedData authorizedData) {
		this.authorizedData = authorizedData;
	}

	public MarketingPartner getPartner() {
		return this.partner;
	}
	public void setPartner(MarketingPartner partner) {
		this.partner = partner;
	}

}
