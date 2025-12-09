package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消控室token获取接口
 *
 * @author auto create
 * @since 1.0, 2025-06-19 19:58:53
 */
public class AlipayCommercePropertyManagerAuthModel extends AlipayObject {

	private static final long serialVersionUID = 5714244333683758599L;

	/**
	 * token授权类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 项目Id
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 对接方系统项目Id
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

}
