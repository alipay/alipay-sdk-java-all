package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款记录
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:08:36
 */
public class HonorRepayRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 8637343825299269583L;

	/**
	 * 蚂蚁侧借款订单单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 还款交易流水号
	 */
	@ApiField("out_repay_no")
	private String outRepayNo;

	/**
	 * 还款金额，单位：分。还款中、还款失败时返回申请金额，还款成功时返回实际还款金额
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/**
	 * 还款失败原因
	 */
	@ApiField("repay_result")
	private String repayResult;

	/**
	 * 还款状态，1-还款中，2-还款成功，4-还款失败（还款中只会返回收银后的）
	 */
	@ApiField("repay_status")
	private Long repayStatus;

	/**
	 * 实际还款时间，毫秒(还款中为还款申请提交的时间，还款失败和成功为实际还款时间)
	 */
	@ApiField("repay_time")
	private Long repayTime;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRepayNo() {
		return this.outRepayNo;
	}
	public void setOutRepayNo(String outRepayNo) {
		this.outRepayNo = outRepayNo;
	}

	public String getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayResult() {
		return this.repayResult;
	}
	public void setRepayResult(String repayResult) {
		this.repayResult = repayResult;
	}

	public Long getRepayStatus() {
		return this.repayStatus;
	}
	public void setRepayStatus(Long repayStatus) {
		this.repayStatus = repayStatus;
	}

	public Long getRepayTime() {
		return this.repayTime;
	}
	public void setRepayTime(Long repayTime) {
		this.repayTime = repayTime;
	}

}
