package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区查询
 *
 * @author auto create
 * @since 1.0, 2025-03-04 13:42:25
 */
public class AlipayCommerceHousingCommunityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8225684952819671695L;

	/**
	 * 小区id
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 外部小区编码
	 */
	@ApiField("external_id")
	private String externalId;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

}
