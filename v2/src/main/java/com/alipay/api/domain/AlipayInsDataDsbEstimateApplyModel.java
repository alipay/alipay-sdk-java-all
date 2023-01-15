package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 定损宝提交车险图像定损请求
 *
 * @author auto create
 * @since 1.0, 2022-11-21 15:16:57
 */
public class AlipayInsDataDsbEstimateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4443369548827731188L;

	/**
	 * 事发地区编码，取值参考提供的统一编码标准文档
	 */
	@ApiField("accident_area_id")
	private String accidentAreaId;

	/**
	 * 车辆属性，json格式
	 */
	@ApiField("car_properties")
	private String carProperties;

	/**
	 * 案件属性，json字符串格式，目前key值有is_night_case(是否夜间案件）、is_human_hurt（是否有人伤）、is_only_outlook_damage（是否纯外观损伤）等
	 */
	@ApiField("case_properties")
	private String caseProperties;

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
	 * 发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 保险公司定损单号，唯一标识一个定损单的id
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/**
	 * 定损请求uuid，唯一标识一次定损请求，用于做幂等控制
	 */
	@ApiField("estimate_request_uuid")
	private String estimateRequestUuid;

	/**
	 * 车架号
	 */
	@ApiField("frame_no")
	private String frameNo;

	/**
	 * 修理厂类型，枚举如下

4S－4S店
GENERAL－综合修理厂
	 */
	@ApiField("garage_type")
	private String garageType;

	/**
	 * 车损图片信息列表
	 */
	@ApiListField("image_list")
	@ApiField("alipay_ins_data_dsb_request_image_info")
	private List<AlipayInsDataDsbRequestImageInfo> imageList;

	/**
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 车型厂牌，理赔车型
	 */
	@ApiField("model_brand")
	private String modelBrand;

	/**
	 * 新车购置价，单位为元。
	 */
	@ApiField("new_car_price")
	private String newCarPrice;

	/**
	 * 维修企业属性，json字符串格式，目前key值有：type(企业类型/等级）、name（企业名称）、address（地址）、code（维修企业编码）等
	 */
	@ApiField("repair_corp_properties")
	private String repairCorpProperties;

	/**
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求发生时的时间戳
	 */
	@ApiField("request_timestamp")
	private String requestTimestamp;

	/**
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

	public String getAccidentAreaId() {
		return this.accidentAreaId;
	}
	public void setAccidentAreaId(String accidentAreaId) {
		this.accidentAreaId = accidentAreaId;
	}

	public String getCarProperties() {
		return this.carProperties;
	}
	public void setCarProperties(String carProperties) {
		this.carProperties = carProperties;
	}

	public String getCaseProperties() {
		return this.caseProperties;
	}
	public void setCaseProperties(String caseProperties) {
		this.caseProperties = caseProperties;
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

	public String getEstimateNo() {
		return this.estimateNo;
	}
	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

	public String getEstimateRequestUuid() {
		return this.estimateRequestUuid;
	}
	public void setEstimateRequestUuid(String estimateRequestUuid) {
		this.estimateRequestUuid = estimateRequestUuid;
	}

	public String getFrameNo() {
		return this.frameNo;
	}
	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public String getGarageType() {
		return this.garageType;
	}
	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

	public List<AlipayInsDataDsbRequestImageInfo> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<AlipayInsDataDsbRequestImageInfo> imageList) {
		this.imageList = imageList;
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

	public String getNewCarPrice() {
		return this.newCarPrice;
	}
	public void setNewCarPrice(String newCarPrice) {
		this.newCarPrice = newCarPrice;
	}

	public String getRepairCorpProperties() {
		return this.repairCorpProperties;
	}
	public void setRepairCorpProperties(String repairCorpProperties) {
		this.repairCorpProperties = repairCorpProperties;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getRequestTimestamp() {
		return this.requestTimestamp;
	}
	public void setRequestTimestamp(String requestTimestamp) {
		this.requestTimestamp = requestTimestamp;
	}

	public String getSurveyNo() {
		return this.surveyNo;
	}
	public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
	}

}
