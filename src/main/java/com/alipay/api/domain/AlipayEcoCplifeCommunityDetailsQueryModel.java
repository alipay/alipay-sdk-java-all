package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单个物业小区信息
 *
 * @author auto create
 * @since 1.0, 2017-01-14 11:36:24
 */
public class AlipayEcoCplifeCommunityDetailsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2737192721772914612L;

	/**
	 * 支付宝社区小区统一编号，必须在物业账号名下存在。
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
