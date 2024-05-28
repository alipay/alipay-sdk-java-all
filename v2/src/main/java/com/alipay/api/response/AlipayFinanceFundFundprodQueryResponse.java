package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.fundprod.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:52:38
 */
public class AlipayFinanceFundFundprodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3646695121373593698L;

	/** 
	 * 成立日期，格式为YYYYMMDD
	 */
	@ApiField("establishment_date")
	private String establishmentDate;

	/** 
	 * 基金代码
	 */
	@ApiField("fund_code")
	private String fundCode;

	/** 
	 * 基金全称
	 */
	@ApiField("fund_name")
	private String fundName;

	/** 
	 * 基金简称
	 */
	@ApiField("fund_name_abbr")
	private String fundNameAbbr;

	/** 
	 * 基金单位净值，含4位小数
	 */
	@ApiField("net_value")
	private String netValue;

	/** 
	 * 净值日期
	 */
	@ApiField("net_value_date")
	private String netValueDate;

	/** 
	 * 七日年化收益率，含5位小数，可以为负
	 */
	@ApiField("profit_seven_days")
	private String profitSevenDays;

	/** 
	 * 万份收益，含5位小数，可以为负
	 */
	@ApiField("profit_ten_thousand")
	private String profitTenThousand;

	/** 
	 * 风险等级，分五级：L-低风险; ML-中低风险; M-中风险; MH-中高风险; H-高风险
	 */
	@ApiField("risk_evaluation")
	private String riskEvaluation;

	public void setEstablishmentDate(String establishmentDate) {
		this.establishmentDate = establishmentDate;
	}
	public String getEstablishmentDate( ) {
		return this.establishmentDate;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getFundCode( ) {
		return this.fundCode;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getFundName( ) {
		return this.fundName;
	}

	public void setFundNameAbbr(String fundNameAbbr) {
		this.fundNameAbbr = fundNameAbbr;
	}
	public String getFundNameAbbr( ) {
		return this.fundNameAbbr;
	}

	public void setNetValue(String netValue) {
		this.netValue = netValue;
	}
	public String getNetValue( ) {
		return this.netValue;
	}

	public void setNetValueDate(String netValueDate) {
		this.netValueDate = netValueDate;
	}
	public String getNetValueDate( ) {
		return this.netValueDate;
	}

	public void setProfitSevenDays(String profitSevenDays) {
		this.profitSevenDays = profitSevenDays;
	}
	public String getProfitSevenDays( ) {
		return this.profitSevenDays;
	}

	public void setProfitTenThousand(String profitTenThousand) {
		this.profitTenThousand = profitTenThousand;
	}
	public String getProfitTenThousand( ) {
		return this.profitTenThousand;
	}

	public void setRiskEvaluation(String riskEvaluation) {
		this.riskEvaluation = riskEvaluation;
	}
	public String getRiskEvaluation( ) {
		return this.riskEvaluation;
	}

}
