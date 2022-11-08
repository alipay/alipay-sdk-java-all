package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.esg.score.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-23 15:16:44
 */
public class ZhimaCreditEpEsgScoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7411367583846755784L;

	/** 
	 * 企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * ESG评价分，1-100
	 */
	@ApiField("esg_score")
	private String esgScore;

	/** 
	 * 评价时间
	 */
	@ApiField("evaluate_time")
	private Date evaluateTime;

	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}
	public String getEpCertNo( ) {
		return this.epCertNo;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}
	public String getEpName( ) {
		return this.epName;
	}

	public void setEsgScore(String esgScore) {
		this.esgScore = esgScore;
	}
	public String getEsgScore( ) {
		return this.esgScore;
	}

	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}
	public Date getEvaluateTime( ) {
		return this.evaluateTime;
	}

}
