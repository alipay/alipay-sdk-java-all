package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.daily.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 13:52:17
 */
public class AlipayEbppIndustryJobDailySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4749271935391762338L;

	/** 
	 * 支付宝侧岗位唯一标识，请求正常处理的情况下，此参数必传。
	 */
	@ApiField("job_id")
	private String jobId;

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobId( ) {
		return this.jobId;
	}

}
