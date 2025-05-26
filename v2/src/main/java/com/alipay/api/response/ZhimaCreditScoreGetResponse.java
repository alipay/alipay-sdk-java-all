package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:08
 */
public class ZhimaCreditScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8115524687949263819L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用户的芝麻分。分值范围[350,950]。如果用户数据不足，无法评分时，返回字符串"N/A"。
	 */
	@ApiField("zm_score")
	private String zmScore;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
