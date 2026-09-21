package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CPA任务投放连接查询
 *
 * @author auto create
 * @since 1.0, 2026-09-08 11:44:22
 */
public class AlipayEbppInstserviceCpataskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4157779982545415446L;

	/**
	 * 分销渠道的定义，由运营侧统一分配。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * cpa子任务ID
	 */
	@ApiField("sub_task_id")
	private String subTaskId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSubTaskId() {
		return this.subTaskId;
	}
	public void setSubTaskId(String subTaskId) {
		this.subTaskId = subTaskId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
