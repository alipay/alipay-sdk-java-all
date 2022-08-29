package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.creditlife.risk.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:49
 */
public class ZhimaMerchantCreditlifeRiskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5891873475555545729L;

	/** 
	 * 用户在商端的身份标识，如果在接口的入参中存在该参数，芝麻网关会自动转化
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 较差、中等、良好、优秀、极好5个级别
	 */
	@ApiField("zm_grade")
	private String zmGrade;

	/** 
	 * 风控结果
	 */
	@ApiField("zm_risk")
	private String zmRisk;

	/** 
	 * 芝麻分
	 */
	@ApiField("zm_score")
	private String zmScore;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setZmGrade(String zmGrade) {
		this.zmGrade = zmGrade;
	}
	public String getZmGrade( ) {
		return this.zmGrade;
	}

	public void setZmRisk(String zmRisk) {
		this.zmRisk = zmRisk;
	}
	public String getZmRisk( ) {
		return this.zmRisk;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
