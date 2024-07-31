package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.antifinfraud.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class SsdataDataserviceRiskAntifinfraudQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6636899767393841988L;

	/** 
	 * 风险解释，即本次风险评分中TOP 3，信息代码、风险因子代码、风险因子名、风险描述。详情请参考
	 */
	@ApiField("infocode")
	private String infocode;

	/** 
	 * 基于传入的介质参数，计算得到的金融欺诈风险分，范围[0,100],分数越高风险程度越高
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
