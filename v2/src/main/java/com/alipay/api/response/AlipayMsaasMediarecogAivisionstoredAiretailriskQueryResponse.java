package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aivisionstored.airetailrisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-31 15:07:45
 */
public class AlipayMsaasMediarecogAivisionstoredAiretailriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1843245745889444395L;

	/** 
	 * 风险说明
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 订单是否有风险
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/** 
	 * null
	 */
	@ApiListField("pics")
	@ApiField("string")
	private List<String> pics;

	/** 
	 * 风险上报时间
	 */
	@ApiField("report_time")
	private Date reportTime;

	/** 
	 * 风险类型
	 */
	@ApiField("risk_type")
	private String riskType;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}
	public Boolean getHasRisk( ) {
		return this.hasRisk;
	}

	public void setPics(List<String> pics) {
		this.pics = pics;
	}
	public List<String> getPics( ) {
		return this.pics;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}
	public Date getReportTime( ) {
		return this.reportTime;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}
	public String getRiskType( ) {
		return this.riskType;
	}

}
