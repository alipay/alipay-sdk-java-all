package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区活动数据同步
 *
 * @author auto create
 * @since 1.0, 2020-06-22 14:29:12
 */
public class AlipayOpenAppCommunityUserpromoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7544619445494151868L;

	/**
	 * 业务数据
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 场景来源(创建时必填，其他更新时可以不填)
	 */
	@ApiField("scene_src")
	private String sceneSrc;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 发放对象
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 营销活动类型（券/红包/xxx）
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getSceneSrc() {
		return this.sceneSrc;
	}
	public void setSceneSrc(String sceneSrc) {
		this.sceneSrc = sceneSrc;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
