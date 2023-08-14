package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecruitFailureInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.recruit.enroll.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-27 15:16:52
 */
public class AlipayMarketingCampaignRecruitEnrollCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5464922376483893433L;

	/** 
	 * 创建活动报名请求是否被受理。
使用说明：
a. 当该字段值是false时，说明本次创建活动报名接口调用经业务校验失败，enroll_id 会为null，但 error_info.error_message 不为空，会给出业务校验失败的具体原因；
b. 当该字段值是true时，说明本次创建活动报名接口调用成功，error_info 会为null，但 enroll_id 不为空，请保存enroll_id；
	 */
	@ApiField("accepted")
	private Boolean accepted;

	/** 
	 * 活动报名ID。创建活动报名被受理时（accepted=true）不为null。
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/** 
	 * 创建活动报名失败信息。创建活动报名未被受理时（accepted=false）不为null。
	 */
	@ApiField("failure_info")
	private RecruitFailureInfo failureInfo;

	/** 
	 * 幂等ID。
由商家/ISV 自定义，创建报名时传入的 out_biz_no。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}
	public Boolean getAccepted( ) {
		return this.accepted;
	}

	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}
	public String getEnrollId( ) {
		return this.enrollId;
	}

	public void setFailureInfo(RecruitFailureInfo failureInfo) {
		this.failureInfo = failureInfo;
	}
	public RecruitFailureInfo getFailureInfo( ) {
		return this.failureInfo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
