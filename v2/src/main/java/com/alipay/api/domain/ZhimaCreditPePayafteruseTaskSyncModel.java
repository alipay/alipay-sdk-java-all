package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务更新
 *
 * @author auto create
 * @since 1.0, 2025-03-13 17:13:28
 */
public class ZhimaCreditPePayafteruseTaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7784841176635752724L;

	/**
	 * 实际业务动作的发生时间，比如任务完成的业务时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 任务流水的类型
	 */
	@ApiField("goal_type")
	private String goalType;

	/**
	 * 代表一次任务推进的进度值，格式为固定数字，在MONEY类型下单位为分，在TIMES类型下单位为次
	 */
	@ApiField("goal_value")
	private String goalValue;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家侧的订单号，用于幂等控制
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部请求幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 完结；取消；权益核销
	 */
	@ApiField("update_type")
	private String updateType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getGoalType() {
		return this.goalType;
	}
	public void setGoalType(String goalType) {
		this.goalType = goalType;
	}

	public String getGoalValue() {
		return this.goalValue;
	}
	public void setGoalValue(String goalValue) {
		this.goalValue = goalValue;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getUpdateType() {
		return this.updateType;
	}
	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
