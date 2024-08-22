package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连营销活动奖品申领
 *
 * @author auto create
 * @since 1.0, 2023-04-18 20:46:51
 */
public class AlipayMerchantIndirectRewardApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8658769257994324122L;

	/**
	 * 业务场景编码，用以区分不同的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商户账号组ID
	 */
	@ApiField("group_mid")
	private String groupMid;

	/**
	 * 支付宝登录号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 营销任务编码，平台定义的任务类型编号
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 营销任务唯一编号，报名任务时返回
	 */
	@ApiField("task_id")
	private String taskId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getGroupMid() {
		return this.groupMid;
	}
	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
