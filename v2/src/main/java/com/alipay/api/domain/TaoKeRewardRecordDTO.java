package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 激励记录信息
 *
 * @author auto create
 * @since 1.0, 2023-09-20 22:25:33
 */
public class TaoKeRewardRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 3154348599389514691L;

	/**
	 * 达成交易的用户openId
	 */
	@ApiField("guided_open_id")
	private String guidedOpenId;

	/**
	 * 达成交易的用户
	 */
	@ApiField("guided_uid")
	private String guidedUid;

	/**
	 * 淘客的支付宝号
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 淘客的支付宝openId号
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 商户侧外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 激励金额
	 */
	@ApiField("reward_amount")
	private String rewardAmount;

	/**
	 * 等待激励
	 */
	@ApiField("status")
	private String status;

	/**
	 * 淘客领取的任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	public String getGuidedOpenId() {
		return this.guidedOpenId;
	}
	public void setGuidedOpenId(String guidedOpenId) {
		this.guidedOpenId = guidedOpenId;
	}

	public String getGuidedUid() {
		return this.guidedUid;
	}
	public void setGuidedUid(String guidedUid) {
		this.guidedUid = guidedUid;
	}

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

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRewardAmount() {
		return this.rewardAmount;
	}
	public void setRewardAmount(String rewardAmount) {
		this.rewardAmount = rewardAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

}
