package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家营销任务查询
 *
 * @author auto create
 * @since 1.0, 2023-04-04 13:44:01
 */
public class AlipayMerchantIndirectPromotaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1333457349848576171L;

	/**
	 * 平台定义的业务场景编码，用以区分不同的业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝侧定义的商户组编号，作为同一商户主体下多个smid的唯一商户编号
	 */
	@ApiField("group_mid")
	private String groupMid;

	/**
	 * 任务标识编码，用以区分任务类型
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 商家报名任务通过后生成的唯一任务编号
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
