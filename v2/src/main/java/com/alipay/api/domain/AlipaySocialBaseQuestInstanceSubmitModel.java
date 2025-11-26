package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小目标打卡接口
 *
 * @author auto create
 * @since 1.0, 2021-12-08 10:44:04
 */
public class AlipaySocialBaseQuestInstanceSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7715566823492893451L;

	/**
	 * 小目标实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 调用方标识
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
