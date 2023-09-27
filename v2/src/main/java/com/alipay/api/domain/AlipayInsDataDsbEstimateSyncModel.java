package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步机构定损/核损结果
 *
 * @author auto create
 * @since 1.0, 2022-11-21 15:16:38
 */
public class AlipayInsDataDsbEstimateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8635522713315945247L;

	/**
	 * 业务类型：assessment（定损），evaluation（核损）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 定损/核损详情对象列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_dsb_estimate_result_detail")
	private List<InsDataDsbEstimateResultDetail> estimateDetailList;

	/**
	 * 保险公司定损单号，唯一标识一个定损单的id
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

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<InsDataDsbEstimateResultDetail> getEstimateDetailList() {
		return this.estimateDetailList;
	}
	public void setEstimateDetailList(List<InsDataDsbEstimateResultDetail> estimateDetailList) {
		this.estimateDetailList = estimateDetailList;
	}

	public String getEstimateNo() {
		return this.estimateNo;
	}
	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

	public String getFrameNo() {
		return this.frameNo;
	}
	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getRepairCorpProperties() {
		return this.repairCorpProperties;
	}
	public void setRepairCorpProperties(String repairCorpProperties) {
		this.repairCorpProperties = repairCorpProperties;
	}

	public String getTotalDamageAmount() {
		return this.totalDamageAmount;
	}
	public void setTotalDamageAmount(String totalDamageAmount) {
		this.totalDamageAmount = totalDamageAmount;
	}

	public String getTotalRemainValue() {
		return this.totalRemainValue;
	}
	public void setTotalRemainValue(String totalRemainValue) {
		this.totalRemainValue = totalRemainValue;
	}

}
