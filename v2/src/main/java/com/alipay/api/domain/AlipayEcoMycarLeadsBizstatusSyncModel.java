package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线索数据变更
 *
 * @author auto create
 * @since 1.0, 2025-11-17 19:50:18
 */
public class AlipayEcoMycarLeadsBizstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4698621666647885199L;

	/**
	 * 已到店，支付宝方统一分配
	 */
	@ApiField("leads_biz_code")
	private String leadsBizCode;

	/**
	 * 线索id（当source_channel和scene_code为空时必选，有线索id时优先通过线索id唯一定位线索）
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 线索场景码（当leads_id为空时必选）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 线索渠道（当leads_id为空时必选）
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getLeadsBizCode() {
		return this.leadsBizCode;
	}
	public void setLeadsBizCode(String leadsBizCode) {
		this.leadsBizCode = leadsBizCode;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
