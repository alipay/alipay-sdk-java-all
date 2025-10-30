package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款申请单结果
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:16
 */
public class HonorRepayApplyResultDTO extends AlipayObject {

	private static final long serialVersionUID = 1619447286382451122L;

	/**
	 * 荣耀用户ID
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 荣耀侧借款申请订单号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/**
	 * 蚂蚁借款申请流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 还款交易流水号
	 */
	@ApiField("out_repay_no")
	private String outRepayNo;

	/**
	 * 还款金额，单位：分
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/**
	 * 荣耀侧还款交易流水号，批扣或线下还款时没有
	 */
	@ApiField("repay_no")
	private String repayNo;

	/**
	 * 还款失败原因
	 */
	@ApiField("repay_result")
	private String repayResult;

	/**
	 * 还款来源
主动还款：PARTNER_IN-APP_REPAYMENT
批扣还款、线下还款：OTHER
	 */
	@ApiField("repay_source")
	private String repaySource;

	/**
	 * 还款状态，2-还款成功，4-还款失败
	 */
	@ApiField("repay_status")
	private Long repayStatus;

	/**
	 * 还款期次明细列表
	 */
	@ApiListField("repay_terms")
	@ApiField("honor_repay_apply_term_d_t_o")
	private List<HonorRepayApplyTermDTO> repayTerms;

	/**
	 * 还款时间，毫秒
	 */
	@ApiField("repay_time")
	private Long repayTime;

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getLoanApplyNo() {
		return this.loanApplyNo;
	}
	public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

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

	public String getRepayNo() {
		return this.repayNo;
	}
	public void setRepayNo(String repayNo) {
		this.repayNo = repayNo;
	}

	public String getRepayResult() {
		return this.repayResult;
	}
	public void setRepayResult(String repayResult) {
		this.repayResult = repayResult;
	}

	public String getRepaySource() {
		return this.repaySource;
	}
	public void setRepaySource(String repaySource) {
		this.repaySource = repaySource;
	}

	public Long getRepayStatus() {
		return this.repayStatus;
	}
	public void setRepayStatus(Long repayStatus) {
		this.repayStatus = repayStatus;
	}

	public List<HonorRepayApplyTermDTO> getRepayTerms() {
		return this.repayTerms;
	}
	public void setRepayTerms(List<HonorRepayApplyTermDTO> repayTerms) {
		this.repayTerms = repayTerms;
	}

	public Long getRepayTime() {
		return this.repayTime;
	}
	public void setRepayTime(Long repayTime) {
		this.repayTime = repayTime;
	}

}
