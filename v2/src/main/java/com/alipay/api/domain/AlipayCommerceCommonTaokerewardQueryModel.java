package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客完成的激励记录查询
 *
 * @author auto create
 * @since 1.0, 2023-12-09 10:18:51
 */
public class AlipayCommerceCommonTaokerewardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2742145616676284848L;

	/**
	 * 淘客的支付宝账号
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 淘客的支付宝openId
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 淘客领取的任务的任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
	}

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

}
