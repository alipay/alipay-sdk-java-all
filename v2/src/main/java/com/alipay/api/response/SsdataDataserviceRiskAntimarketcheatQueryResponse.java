package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.antimarketcheat.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class SsdataDataserviceRiskAntimarketcheatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1827475184614328187L;

	/** 
	 * 风险解释，从垃圾注册、虚假交易、名单库、身份冒用和不良记录等5个方面描述作弊风险
	 */
	@ApiField("infocode")
	private String infocode;

	/** 
	 * 基于传入手机号或身份证号，计算得到的作弊风险值，范围[0,100],分数越高风险程度越高
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 用户唯一请求ID
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setInfocode(String infocode) {
		this.infocode = infocode;
	}
	public String getInfocode( ) {
		return this.infocode;
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
