package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户参与天天减活动进度信息
 *
 * @author auto create
 * @since 1.0, 2026-04-17 10:01:56
 */
public class UserTaskProgress extends AlipayObject {

	private static final long serialVersionUID = 1864211361591954793L;

	/**
	 * 天天减活动进度日期
	 */
	@ApiField("progress_time")
	private String progressTime;

	/**
	 * 天天减活动期间，用户有参与核销金额，单位：分
	 */
	@ApiField("use_discount_amount")
	private Long useDiscountAmount;

	/**
	 * 天天减活动期间核销状态，有已核销、未核销、待使用三种状态
	 */
	@ApiField("use_status")
	private String useStatus;

	public String getProgressTime() {
		return this.progressTime;
	}
	public void setProgressTime(String progressTime) {
		this.progressTime = progressTime;
	}

	public Long getUseDiscountAmount() {
		return this.useDiscountAmount;
	}
	public void setUseDiscountAmount(Long useDiscountAmount) {
		this.useDiscountAmount = useDiscountAmount;
	}

	public String getUseStatus() {
		return this.useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

}
