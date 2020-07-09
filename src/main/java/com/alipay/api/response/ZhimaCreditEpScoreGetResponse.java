package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditEpScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3193514454847775641L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 企业评分的打分时间，格式为yyyyMMdd
	 */
	@ApiField("eval_date")
	private String evalDate;

	/** 
	 * 该企业无企业信用评分的原因。枚举值： STATUS_UNNORMAL（企业状态异常）；NOT_JURIDICAL_ENTITY（非法人实体）；USER_CLOSED（用户已经关闭）；CAN_NOT_GET_INFO（无法查询到信息）
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 被查询企业的芝麻信用评分，分值在[1000,2000]之间。如果无分则返回N/A。
	 */
	@ApiField("zm_score")
	private String zmScore;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setEvalDate(String evalDate) {
		this.evalDate = evalDate;
	}
	public String getEvalDate( ) {
		return this.evalDate;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
