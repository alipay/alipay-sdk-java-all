package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.lpr.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:20:01
 */
public class MybankCreditSceneprodLprQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8434829572951846997L;

	/** 
	 * 贷款利率基于LPR基准利率数据。
贷款利率为年利率为16.2%，LPR基准利率为3.85%，则为浮动利率上浮12.35%
	 */
	@ApiField("float_rate")
	private String floatRate;

	/** 
	 * 贷款利率给予LPR基准利率浮动情况。
1为上浮，0为持平，-1为下降
	 */
	@ApiField("loan_dir")
	private String loanDir;

	/** 
	 * 期数。
1年或者5年
	 */
	@ApiField("loan_tenor")
	private String loanTenor;

	/** 
	 * LPR基准利率。转换为百分比即为3.85%
	 */
	@ApiField("lpr_basic_rate")
	private String lprBasicRate;

	/** 
	 * LPR基准利率时间。时间格式为：yyyyMMdd。
	 */
	@ApiField("lpr_date_str")
	private String lprDateStr;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setFloatRate(String floatRate) {
		this.floatRate = floatRate;
	}
	public String getFloatRate( ) {
		return this.floatRate;
	}

	public void setLoanDir(String loanDir) {
		this.loanDir = loanDir;
	}
	public String getLoanDir( ) {
		return this.loanDir;
	}

	public void setLoanTenor(String loanTenor) {
		this.loanTenor = loanTenor;
	}
	public String getLoanTenor( ) {
		return this.loanTenor;
	}

	public void setLprBasicRate(String lprBasicRate) {
		this.lprBasicRate = lprBasicRate;
	}
	public String getLprBasicRate( ) {
		return this.lprBasicRate;
	}

	public void setLprDateStr(String lprDateStr) {
		this.lprDateStr = lprDateStr;
	}
	public String getLprDateStr( ) {
		return this.lprDateStr;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
