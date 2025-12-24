package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubRentRiskResult;
import com.alipay.api.domain.SubRentRiskItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.traas.cloudrisk.rentrisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 11:02:27
 */
public class AlipayCloudTraasCloudriskRentriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2755288563254733786L;

	/** 
	 * 风险咨询事件ID
	 */
	@ApiField("record_id")
	private String recordId;

	/** 
	 * 风险等级中文描述
	 */
	@ApiField("risk_desc")
	private String riskDesc;

	/** 
	 * 综合风险
	 */
	@ApiField("risk_name")
	private String riskName;

	/** 
	 * 综合风险的风险等级
	 */
	@ApiField("risk_rank")
	private String riskRank;

	/** 
	 * 子风险项
	 */
	@ApiField("sub_rent_risk_result")
	private SubRentRiskResult subRentRiskResult;

	/** 
	 * 子风险结果列表
	 */
	@ApiListField("sub_risk_result_list")
	@ApiField("sub_rent_risk_item")
	private List<SubRentRiskItem> subRiskResultList;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}
	public String getRiskDesc( ) {
		return this.riskDesc;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getRiskName( ) {
		return this.riskName;
	}

	public void setRiskRank(String riskRank) {
		this.riskRank = riskRank;
	}
	public String getRiskRank( ) {
		return this.riskRank;
	}

	public void setSubRentRiskResult(SubRentRiskResult subRentRiskResult) {
		this.subRentRiskResult = subRentRiskResult;
	}
	public SubRentRiskResult getSubRentRiskResult( ) {
		return this.subRentRiskResult;
	}

	public void setSubRiskResultList(List<SubRentRiskItem> subRiskResultList) {
		this.subRiskResultList = subRiskResultList;
	}
	public List<SubRentRiskItem> getSubRiskResultList( ) {
		return this.subRiskResultList;
	}

}
