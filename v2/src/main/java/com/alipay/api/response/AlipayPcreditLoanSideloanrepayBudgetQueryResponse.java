package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanrepay.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 15:47:28
 */
public class AlipayPcreditLoanSideloanrepayBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6275529179213418446L;

	/** 
	 * 试算还款利息 单位:元, 精度:小数点后两位
	 */
	@ApiField("calculate_repay_interest")
	private String calculateRepayInterest;

	/** 
	 * 试算还款罚息 单位:元, 精度:小数点后两位
	 */
	@ApiField("calculate_repay_penalty")
	private String calculateRepayPenalty;

	/** 
	 * 试算还款本金 单位:元, 精度:小数点后两位
	 */
	@ApiField("calculate_repay_principal")
	private String calculateRepayPrincipal;

	/** 
	 * 试算还款总金额 单位:元, 精度:小数点后两位, 口径:试算本金 + 试算利息 + 试算罚息
	 */
	@ApiField("calculate_repay_total_amount")
	private String calculateRepayTotalAmount;

	/** 
	 * 扩展字段, 还款试算时会放入借据号列表和应还金额信息，还款提交时透传。
	 */
	@ApiField("extension")
	private String extension;

	/** 
	 * 表示请求处理状态。
SUCCESS - 成功
NEED_RETRY -需要重试
FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * returnCode为FAIL或者NEED_RETRY状态下，返回具体错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 可以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	public void setCalculateRepayInterest(String calculateRepayInterest) {
		this.calculateRepayInterest = calculateRepayInterest;
	}
	public String getCalculateRepayInterest( ) {
		return this.calculateRepayInterest;
	}

	public void setCalculateRepayPenalty(String calculateRepayPenalty) {
		this.calculateRepayPenalty = calculateRepayPenalty;
	}
	public String getCalculateRepayPenalty( ) {
		return this.calculateRepayPenalty;
	}

	public void setCalculateRepayPrincipal(String calculateRepayPrincipal) {
		this.calculateRepayPrincipal = calculateRepayPrincipal;
	}
	public String getCalculateRepayPrincipal( ) {
		return this.calculateRepayPrincipal;
	}

	public void setCalculateRepayTotalAmount(String calculateRepayTotalAmount) {
		this.calculateRepayTotalAmount = calculateRepayTotalAmount;
	}
	public String getCalculateRepayTotalAmount( ) {
		return this.calculateRepayTotalAmount;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getExtension( ) {
		return this.extension;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnSubCode(String returnSubCode) {
		this.returnSubCode = returnSubCode;
	}
	public String getReturnSubCode( ) {
		return this.returnSubCode;
	}

	public void setReturnSubMessage(String returnSubMessage) {
		this.returnSubMessage = returnSubMessage;
	}
	public String getReturnSubMessage( ) {
		return this.returnSubMessage;
	}

}
