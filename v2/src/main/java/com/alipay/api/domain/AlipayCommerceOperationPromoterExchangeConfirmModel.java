package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分兑换奖品确认视图
 *
 * @author auto create
 * @since 1.0, 2025-04-03 11:14:12
 */
public class AlipayCommerceOperationPromoterExchangeConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6361976638654637452L;

	/**
	 * 奖品code,唯一标识
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 需要绑定的门店对映的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 任务code，唯一标识
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 店员id，点击提交的收银员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
