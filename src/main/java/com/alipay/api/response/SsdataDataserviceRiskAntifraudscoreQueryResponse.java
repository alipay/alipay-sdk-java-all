package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.antifraudscore.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataDataserviceRiskAntifraudscoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2315622422894454943L;

	/** 
	 * 蚁盾对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 申请欺诈评分，分数范围是[0,100]的整数,分数越高信息越真实
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 用户唯一请求id
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
