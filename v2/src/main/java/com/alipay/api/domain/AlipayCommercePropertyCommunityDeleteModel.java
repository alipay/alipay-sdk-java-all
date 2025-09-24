package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 项目删除接口
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class AlipayCommercePropertyCommunityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6355646279543619631L;

	/**
	 * 项目ID
	 */
	@ApiField("community_id")
	private String communityId;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

}
