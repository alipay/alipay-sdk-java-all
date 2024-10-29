package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步定损/核损结果到蚂蚁
 *
 * @author auto create
 * @since 1.0, 2017-07-28 15:30:22
 */
public class AlipayInsDataAutodamageEstimateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6121886863297679788L;

	/**
	 * 业务类型，2表示机构核损，3表示机构定损
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 车险商业险保单号
	 */
	@ApiField("commercial_policy_no")
	private String commercialPolicyNo;

	/**
	 * 交强险保单号
	 */
	@ApiField("compulsory_policy_no")
	private String compulsoryPolicyNo;

	/**
	 * 汽车发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 核损详情对象列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_autodamage_estimate_confirm_model")
	private List<InsDataAutodamageEstimateConfirmModel> estimateDetailList;

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
	 * 车型厂牌
	 */
	@ApiField("model_brand")
	private String modelBrand;

	/**
	 * 维修企业名称
	 */
	@ApiField("repair_corp_name")
	private String repairCorpName;

	/**
	 * 维修企业类型
	 */
	@ApiField("repair_corp_type")
	private String repairCorpType;

	/**
	 * 车险报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

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

	public String getCommercialPolicyNo() {
		return this.commercialPolicyNo;
	}
	public void setCommercialPolicyNo(String commercialPolicyNo) {
		this.commercialPolicyNo = commercialPolicyNo;
	}

	public String getCompulsoryPolicyNo() {
		return this.compulsoryPolicyNo;
	}
	public void setCompulsoryPolicyNo(String compulsoryPolicyNo) {
		this.compulsoryPolicyNo = compulsoryPolicyNo;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public List<InsDataAutodamageEstimateConfirmModel> getEstimateDetailList() {
		return this.estimateDetailList;
	}
	public void setEstimateDetailList(List<InsDataAutodamageEstimateConfirmModel> estimateDetailList) {
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

	public String getModelBrand() {
		return this.modelBrand;
	}
	public void setModelBrand(String modelBrand) {
		this.modelBrand = modelBrand;
	}

	public String getRepairCorpName() {
		return this.repairCorpName;
	}
	public void setRepairCorpName(String repairCorpName) {
		this.repairCorpName = repairCorpName;
	}

	public String getRepairCorpType() {
		return this.repairCorpType;
	}
	public void setRepairCorpType(String repairCorpType) {
		this.repairCorpType = repairCorpType;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getSurveyNo() {
		return this.surveyNo;
	}
	public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
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
