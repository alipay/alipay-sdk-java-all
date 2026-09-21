package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐官推荐结果发送
 *
 * @author auto create
 * @since 1.0, 2026-08-28 10:27:51
 */
public class AlipayEbppIndustryReferralApplySendModel extends AlipayObject {

	private static final long serialVersionUID = 7775199377914791894L;

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
	 * 合作方唯一请求号，用来做幂等。新接入的合作方必选，已接入过的合作方可选
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 推荐官ID
	 */
	@ApiField("recommender_id")
	private String recommenderId;

	/**
	 * 测试订单标识。不传默认是false，表示非测试订单
	 */
	@ApiField("test_order")
	private Boolean testOrder;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRecommenderId() {
		return this.recommenderId;
	}
	public void setRecommenderId(String recommenderId) {
		this.recommenderId = recommenderId;
	}

	public Boolean getTestOrder() {
		return this.testOrder;
	}
	public void setTestOrder(Boolean testOrder) {
		this.testOrder = testOrder;
	}

}
