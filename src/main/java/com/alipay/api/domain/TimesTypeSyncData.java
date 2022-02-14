package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务次数型数据，当选择次数任务时传入
 *
 * @author auto create
 * @since 1.0, 2021-01-30 13:17:17
 */
public class TimesTypeSyncData extends AlipayObject {

	private static final long serialVersionUID = 1375575437215368466L;

	/**
	 * 商户回传的优惠金额，如用户享受的红包金额，单位元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 商户数据回传的优惠信息的名称。
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/**
	 * 用户和商户发生交易的交易单金额，单位元。
	 */
	@ApiField("task_amount")
	private String taskAmount;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 当为次数型任务时必须传。
	 */
	@ApiField("task_times")
	private Long taskTimes;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public String getTaskAmount() {
		return this.taskAmount;
	}
	public void setTaskAmount(String taskAmount) {
		this.taskAmount = taskAmount;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public Long getTaskTimes() {
		return this.taskTimes;
	}
	public void setTaskTimes(Long taskTimes) {
		this.taskTimes = taskTimes;
	}

}
