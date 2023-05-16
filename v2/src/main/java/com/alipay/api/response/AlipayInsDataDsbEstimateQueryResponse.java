package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsDataDsbEstimateResultDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.dsb.estimate.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:02:48
 */
public class AlipayInsDataDsbEstimateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1638186961187716879L;

	/** 
	 * 定损结果置信度，小数，取值范围为0到1
	 */
	@ApiField("confidence")
	private String confidence;

	/** 
	 * 核损详情对象列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_dsb_estimate_result_detail")
	private List<InsDataDsbEstimateResultDetail> estimateDetailList;

	/** 
	 * 定损单号
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/** 
	 * 车架号
	 */
	@ApiField("frame_no")
	private String frameNo;

	/** 
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/** 
	 * 维修企业属性，json字符串格式，目前key值有：type(企业类型/等级）、name（企业名称）、address（地址）、code（维修企业编码）等
	 */
	@ApiField("repair_corp_properties")
	private String repairCorpProperties;

	/** 
	 * 车损总金额，单位：元
	 */
	@ApiField("total_damage_amount")
	private String totalDamageAmount;

	/** 
	 * 残值扣除总金额，单位：元
	 */
	@ApiField("total_remain_value")
	private String totalRemainValue;

	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}
	public String getConfidence( ) {
		return this.confidence;
	}

	public void setEstimateDetailList(List<InsDataDsbEstimateResultDetail> estimateDetailList) {
		this.estimateDetailList = estimateDetailList;
	}
	public List<InsDataDsbEstimateResultDetail> getEstimateDetailList( ) {
		return this.estimateDetailList;
	}

	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}
	public String getEstimateNo( ) {
		return this.estimateNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}
	public String getFrameNo( ) {
		return this.frameNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo( ) {
		return this.licenseNo;
	}

	public void setRepairCorpProperties(String repairCorpProperties) {
		this.repairCorpProperties = repairCorpProperties;
	}
	public String getRepairCorpProperties( ) {
		return this.repairCorpProperties;
	}

	public void setTotalDamageAmount(String totalDamageAmount) {
		this.totalDamageAmount = totalDamageAmount;
	}
	public String getTotalDamageAmount( ) {
		return this.totalDamageAmount;
	}

	public void setTotalRemainValue(String totalRemainValue) {
		this.totalRemainValue = totalRemainValue;
	}
	public String getTotalRemainValue( ) {
		return this.totalRemainValue;
	}

}
