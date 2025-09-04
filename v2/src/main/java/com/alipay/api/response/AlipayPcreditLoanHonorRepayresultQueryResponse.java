package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorRepayApplyTermDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.repayresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-01 17:07:38
 */
public class AlipayPcreditLoanHonorRepayresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6121792557831875159L;

	/** 
	 * 还款交易流水号。result_code=0时必填
	 */
	@ApiField("out_repay_no")
	private String outRepayNo;

	/** 
	 * 还款金额，单位：分，还款成功必传
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/** 
	 * 荣耀侧还款交易流水号。result_code=0时必填
	 */
	@ApiField("repay_no")
	private String repayNo;

	/** 
	 * 还款失败原因，失败时必传
	 */
	@ApiField("repay_result")
	private String repayResult;

	/** 
	 * 还款状态，1-还款中，2-还款成功，4-还款失败。result_code=0时必填
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
	 * 实际还款时间，毫秒，还款成功必传
	 */
	@ApiField("repay_time")
	private Long repayTime;

	public void setOutRepayNo(String outRepayNo) {
		this.outRepayNo = outRepayNo;
	}
	public String getOutRepayNo( ) {
		return this.outRepayNo;
	}

	public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}
	public String getRepayAmount( ) {
		return this.repayAmount;
	}

	public void setRepayNo(String repayNo) {
		this.repayNo = repayNo;
	}
	public String getRepayNo( ) {
		return this.repayNo;
	}

	public void setRepayResult(String repayResult) {
		this.repayResult = repayResult;
	}
	public String getRepayResult( ) {
		return this.repayResult;
	}

	public void setRepayStatus(Long repayStatus) {
		this.repayStatus = repayStatus;
	}
	public Long getRepayStatus( ) {
		return this.repayStatus;
	}

	public void setRepayTerms(List<HonorRepayApplyTermDTO> repayTerms) {
		this.repayTerms = repayTerms;
	}
	public List<HonorRepayApplyTermDTO> getRepayTerms( ) {
		return this.repayTerms;
	}

	public void setRepayTime(Long repayTime) {
		this.repayTime = repayTime;
	}
	public Long getRepayTime( ) {
		return this.repayTime;
	}

}
