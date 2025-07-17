package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 副本活动查询
 *
 * @author auto create
 * @since 1.0, 2024-01-02 09:38:55
 */
public class AlipayUserGameopenpromoChallengeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8144335322812718662L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 获取小程序启动参数的channel字段，未获取到请默认传other
	 */
	@ApiField("query_channel")
	private String queryChannel;

	/**
	 * 支付宝唯一用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQueryChannel() {
		return this.queryChannel;
	}
	public void setQueryChannel(String queryChannel) {
		this.queryChannel = queryChannel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
