package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保证金明细详情
 *
 * @author auto create
 * @since 1.0, 2023-05-05 19:49:16
 */
public class BailDetailResult extends AlipayObject {

	private static final long serialVersionUID = 6614288179894274779L;

	/**
	 * 保证金收支金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 保证金类型描述，仅供参考
	 */
	@ApiField("bail_type")
	private String bailType;

	/**
	 * 本次操作后的保证金余额。字段数据展示为"--"，表明数据暂未更新，请稍等1分钟后重试。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 业务描述，资金收支对应的详细业务场景信息
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/**
	 * 业务基础订单号，资金收支对应的原始业务订单唯一识别编号
	 */
	@ApiField("biz_orig_no")
	private String bizOrigNo;

	/**
	 * 保证金说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 业务发生时间
	 */
	@ApiField("trans_dt")
	private String transDt;

	/**
	 * 保证金业务流水号
	 */
	@ApiField("trans_log_id")
	private String transLogId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBailType() {
		return this.bailType;
	}
	public void setBailType(String bailType) {
		this.bailType = bailType;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBizDesc() {
		return this.bizDesc;
	}
	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}

	public String getBizOrigNo() {
		return this.bizOrigNo;
	}
	public void setBizOrigNo(String bizOrigNo) {
		this.bizOrigNo = bizOrigNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getTransDt() {
		return this.transDt;
	}
	public void setTransDt(String transDt) {
		this.transDt = transDt;
	}

	public String getTransLogId() {
		return this.transLogId;
	}
	public void setTransLogId(String transLogId) {
		this.transLogId = transLogId;
	}

}
