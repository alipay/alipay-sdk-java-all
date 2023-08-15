package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客激励发放
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:32:02
 */
public class AlipayCommerceCommonTaskrewardSettleModel extends AlipayObject {

	private static final long serialVersionUID = 1653541745729868943L;

	/**
	 * 导购员的userId
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员的openId
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 激励发放途径，ZFB代表由支付宝执行淘客激励发放，MERCHANT表示由商户自己发送激励，但需要调用此接口结束该交易单激励，MERCHANT_DISCARD商户判断不需要发放激励，告知支付宝侧结束激励任务
	 */
	@ApiField("reward_way")
	private String rewardWay;

	/**
	 * 淘客领取任务的支付宝任务id
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

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRewardWay() {
		return this.rewardWay;
	}
	public void setRewardWay(String rewardWay) {
		this.rewardWay = rewardWay;
	}

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

}
