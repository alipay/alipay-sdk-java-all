package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.recruit.enroll.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-08 09:57:14
 */
public class AlipayMarketingRecruitEnrollCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2268414773514458914L;

	/** 
	 * 报名ID
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/** 
	 * 外部操作流水号。由商家/ISV 自定义，仅支持字母、数字、下划线且需保证每次操作唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}
	public String getEnrollId( ) {
		return this.enrollId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
