package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金管控资金划拨
 *
 * @author auto create
 * @since 1.0, 2024-05-28 10:30:55
 */
public class AnttechBlockchainFinanceFsupvFundTransferModel extends AlipayObject {

	private static final long serialVersionUID = 8763742541492561164L;

	/**
	 * 资金管控任务编号
	 */
	@ApiField("fund_supv_task_id")
	private String fundSupvTaskId;

	/**
	 * 交易请求号，以yyyyMMdd时间串格式开始，在调用方系统、内需要保持全局唯一，是判断幂等逻辑请求唯一识别码。
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 资金管控划拨金额，单位: 元
	 */
	@ApiField("transfer_amount")
	private String transferAmount;

	/**
	 * 是否释放剩余余额。指在本次划拨请求时，是否释放除本次划拨金额的剩余余额部分
	 */
	@ApiField("unfreeze_balance_flag")
	private Boolean unfreezeBalanceFlag;

	public String getFundSupvTaskId() {
		return this.fundSupvTaskId;
	}
	public void setFundSupvTaskId(String fundSupvTaskId) {
		this.fundSupvTaskId = fundSupvTaskId;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTransferAmount() {
		return this.transferAmount;
	}
	public void setTransferAmount(String transferAmount) {
		this.transferAmount = transferAmount;
	}

	public Boolean getUnfreezeBalanceFlag() {
		return this.unfreezeBalanceFlag;
	}
	public void setUnfreezeBalanceFlag(Boolean unfreezeBalanceFlag) {
		this.unfreezeBalanceFlag = unfreezeBalanceFlag;
	}

}
