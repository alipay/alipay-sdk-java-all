package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款业务机构主动提醒动作额外信息
 *
 * @author auto create
 * @since 1.0, 2025-02-25 11:21:19
 */
public class ConsumerLoanTriggerActionExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5621753978842456371L;

	/**
	 * 触发事件中的动作类型，REPAY代表用户发生了还款
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 当前动作所对应的实体，范围由小到大为：还款计划->账单->借据->全部
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 幂等号，代表当前一次动作事件
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 还款金额，单位为分，1000代表10.00元
	 */
	@ApiField("paid_amount")
	private Long paidAmount;

	/**
	 * 用户还款时间
	 */
	@ApiField("paid_time")
	private Date paidTime;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(Long paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Date getPaidTime() {
		return this.paidTime;
	}
	public void setPaidTime(Date paidTime) {
		this.paidTime = paidTime;
	}

}
