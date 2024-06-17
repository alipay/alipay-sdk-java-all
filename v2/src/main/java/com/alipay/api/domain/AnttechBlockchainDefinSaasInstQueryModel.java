package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链b2b资金服务机构信息查询
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:53:38
 */
public class AnttechBlockchainDefinSaasInstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2448354718662298733L;

	/**
	 * 机构名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 业务平台Id
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

}
