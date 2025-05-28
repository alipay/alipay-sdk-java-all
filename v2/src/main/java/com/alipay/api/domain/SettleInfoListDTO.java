package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账明细
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:50
 */
public class SettleInfoListDTO extends AlipayObject {

	private static final long serialVersionUID = 8646991856989884636L;

	/**
	 * 分账失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 百分比，最多两位小数
	 */
	@ApiField("separate_ledger_rate")
	private String separateLedgerRate;

	/**
	 * 结算金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 服务商默认账户: ISV_DEFAULT
其余分账账户: OTHER_ACCOUNT
	 */
	@ApiField("settle_role")
	private String settleRole;

	/**
	 * 待分账: WAIT_SETTLE
分账中: SETTLING
分账成功: SETTLE_SUCCESS
分账失败: SETTLE_FAIL
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 分账触发时间
	 */
	@ApiField("settle_time")
	private Date settleTime;

	/**
	 * 收款分账账户
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 用户号: userId
支付宝登录号: loginName
	 */
	@ApiField("trans_in_type")
	private String transInType;

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getSeparateLedgerRate() {
		return this.separateLedgerRate;
	}
	public void setSeparateLedgerRate(String separateLedgerRate) {
		this.separateLedgerRate = separateLedgerRate;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getSettleRole() {
		return this.settleRole;
	}
	public void setSettleRole(String settleRole) {
		this.settleRole = settleRole;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

}
