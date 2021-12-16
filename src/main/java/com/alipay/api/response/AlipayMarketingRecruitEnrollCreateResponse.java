package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.recruit.enroll.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:55:35
 */
public class AlipayMarketingRecruitEnrollCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2235995336111566183L;

	/** 
	 * 报名ID
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/** 
	 * 外部业务号
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
