package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云智能租赁风控结果
 *
 * @author auto create
 * @since 1.0, 2024-05-31 17:04:22
 */
public class RentRiskResult extends AlipayObject {

	private static final long serialVersionUID = 8757755793489197419L;

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
	 * 风险名称
	 */
	@ApiField("risk_name")
	private String riskName;

	/**
	 * 风险等级
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

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRiskDesc() {
		return this.riskDesc;
	}
	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}

	public String getRiskName() {
		return this.riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public String getRiskRank() {
		return this.riskRank;
	}
	public void setRiskRank(String riskRank) {
		this.riskRank = riskRank;
	}

	public SubRentRiskResult getSubRentRiskResult() {
		return this.subRentRiskResult;
	}
	public void setSubRentRiskResult(SubRentRiskResult subRentRiskResult) {
		this.subRentRiskResult = subRentRiskResult;
	}

	public List<SubRentRiskItem> getSubRiskResultList() {
		return this.subRiskResultList;
	}
	public void setSubRiskResultList(List<SubRentRiskItem> subRiskResultList) {
		this.subRiskResultList = subRiskResultList;
	}

}
