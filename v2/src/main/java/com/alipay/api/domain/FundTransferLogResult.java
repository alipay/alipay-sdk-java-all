package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云店资金转账记录
 *
 * @author auto create
 * @since 1.0, 2022-12-27 10:20:10
 */
public class FundTransferLogResult extends AlipayObject {

	private static final long serialVersionUID = 8221168344581262464L;

	/**
	 * 转账金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 资金操作备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 源账户
	 */
	@ApiField("source_account")
	private String sourceAccount;

	/**
	 * 转账日志记录状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 目标账户
	 */
	@ApiField("target_account")
	private String targetAccount;

	/**
	 * 单据创建时间
	 */
	@ApiField("trans_create_time")
	private String transCreateTime;

	/**
	 * 转账日期
	 */
	@ApiField("trans_date")
	private String transDate;

	/**
	 * 操作类型
TRANSFER：转账
WITHDRAW：提现
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSourceAccount() {
		return this.sourceAccount;
	}
	public void setSourceAccount(String sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetAccount() {
		return this.targetAccount;
	}
	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}

	public String getTransCreateTime() {
		return this.transCreateTime;
	}
	public void setTransCreateTime(String transCreateTime) {
		this.transCreateTime = transCreateTime;
	}

	public String getTransDate() {
		return this.transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
