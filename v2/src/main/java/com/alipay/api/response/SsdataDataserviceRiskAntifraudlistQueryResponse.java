package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.antifraudlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-05 15:50:01
 */
public class SsdataDataserviceRiskAntifraudlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8392599194427232627L;

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

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
