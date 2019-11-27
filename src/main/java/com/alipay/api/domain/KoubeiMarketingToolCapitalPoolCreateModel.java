package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖金池创建接口
 *
 * @author auto create
 * @since 1.0, 2017-06-09 01:36:16
 */
public class KoubeiMarketingToolCapitalPoolCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1246332591983853341L;

	/**
	 * 奖金池充值支付宝账号
	 */
	@ApiField("debit_account")
	private String debitAccount;

	/**
	 * 奖金池有效期结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 奖金池描述信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 奖池名称
	 */
	@ApiField("pool_name")
	private String poolName;

	/**
	 * 奖金池充值金额（单位：元 ）
	 */
	@ApiField("recharge_amount")
	private String rechargeAmount;

	/**
	 * 奖金池有效期开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getDebitAccount() {
		return this.debitAccount;
	}
	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPoolName() {
		return this.poolName;
	}
	public void setPoolName(String poolName) {
		this.poolName = poolName;
	}

	public String getRechargeAmount() {
		return this.rechargeAmount;
	}
	public void setRechargeAmount(String rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
