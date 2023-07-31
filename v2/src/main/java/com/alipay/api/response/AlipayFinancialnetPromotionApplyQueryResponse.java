package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.promotion.apply.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:36:58
 */
public class AlipayFinancialnetPromotionApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1759881518757669915L;

	/** 
	 * 网商申请单号
	 */
	@ApiField("loan_order_no")
	private String loanOrderNo;

	/** 
	 * 签约订单编号
	 */
	@ApiField("sign_order_no")
	private String signOrderNo;

	/** 
	 * 蚂蚁traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setLoanOrderNo(String loanOrderNo) {
		this.loanOrderNo = loanOrderNo;
	}
	public String getLoanOrderNo( ) {
		return this.loanOrderNo;
	}

	public void setSignOrderNo(String signOrderNo) {
		this.signOrderNo = signOrderNo;
	}
	public String getSignOrderNo( ) {
		return this.signOrderNo;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
