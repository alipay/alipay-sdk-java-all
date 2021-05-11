package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交车险图像定损请求
 *
 * @author auto create
 * @since 1.0, 2017-07-28 15:30:17
 */
public class AlipayInsDataAutodamageEstimateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4789736189294794824L;

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
	 * 车损图片信息列表
	 */
	@ApiListField("image_list")
	@ApiField("alipay_ins_data_autodamage_request_image_info")
	private List<AlipayInsDataAutodamageRequestImageInfo> imageList;

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
	 * 车险报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求发生时的时间戳
	 */
	@ApiField("request_timestamp")
	private Long requestTimestamp;

	/**
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

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

	public List<AlipayInsDataAutodamageRequestImageInfo> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<AlipayInsDataAutodamageRequestImageInfo> imageList) {
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

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public Long getRequestTimestamp() {
		return this.requestTimestamp;
	}
	public void setRequestTimestamp(Long requestTimestamp) {
		this.requestTimestamp = requestTimestamp;
	}

	public String getSurveyNo() {
		return this.surveyNo;
	}
	public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
	}

}
