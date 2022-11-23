package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连营销任务领取
 *
 * @author auto create
 * @since 1.0, 2022-11-21 16:37:01
 */
public class AlipayMerchantIndirectPromotaskTakeModel extends AlipayObject {

	private static final long serialVersionUID = 3358566883479743746L;

	/**
	 * 业务场景编码，接入时参考业务接入文档由支付宝侧分配。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝侧定义的商户组唯一编号，作为同一商户主体下多个smid的唯一商户编号。
	 */
	@ApiField("group_mid")
	private String groupMid;

	/**
	 * 服务器渠道2088
	 */
	@ApiField("source_pid")
	private String sourcePid;

	/**
	 * 任务领取时间
	 */
	@ApiField("take_time")
	private Date takeTime;

	/**
	 * 任务英文编号
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 任务实例ID，领取任务后有效
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

	public String getSourcePid() {
		return this.sourcePid;
	}
	public void setSourcePid(String sourcePid) {
		this.sourcePid = sourcePid;
	}

	public Date getTakeTime() {
		return this.takeTime;
	}
	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
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
