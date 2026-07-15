package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐官推荐结果发送
 *
 * @author auto create
 * @since 1.0, 2026-06-26 16:09:37
 */
public class AlipayEbppIndustryReferralApplySendModel extends AlipayObject {

	private static final long serialVersionUID = 2493366578316214933L;

	/**
	 * 候选人姓名
	 */
	@ApiField("candidate_name")
	private String candidateName;

	/**
	 * 候选人手机号
	 */
	@ApiField("candidate_phone")
	private String candidatePhone;

	/**
	 * 城市编码，精确到区县六位匹配
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 岗位ID
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 推荐官ID
	 */
	@ApiField("recommender_id")
	private String recommenderId;

	public String getCandidateName() {
		return this.candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidatePhone() {
		return this.candidatePhone;
	}
	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getRecommenderId() {
		return this.recommenderId;
	}
	public void setRecommenderId(String recommenderId) {
		this.recommenderId = recommenderId;
	}

}
