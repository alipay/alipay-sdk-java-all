package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.antifraudintegration.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 16:05:48
 */
public class SsdataDataserviceRiskAntifraudintegrationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5476578328762397832L;

	/** 
	 * 蚁盾对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 欺诈关注清单是否命中，yes标识命中，no标识未命中
	 */
	@ApiField("hit")
	private String hit;

	/** 
	 * 欺诈关注清单的RiskCode列表，对应的描述见产品文档
	 */
	@ApiField("risk_code")
	private String riskCode;

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

	/** 
	 * <a href="https://doc.open.alipay.com/docs/doc.htm?treeId=272&articleId=105917&docType=1">验证code列表</a>
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getHit( ) {
		return this.hit;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getRiskCode( ) {
		return this.riskCode;
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

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	public String getVerifyCode( ) {
		return this.verifyCode;
	}

}
