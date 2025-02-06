package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.recruit.job.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-17 16:17:23
 */
public class AlipayEbppIndustryRecruitJobSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4596673276223296778L;

	/** 
	 * 支付宝就业频道岗位id
	 */
	@ApiField("job_id")
	private String jobId;

	/** 
	 * 快招岗位id
	 */
	@ApiField("recruit_job_id")
	private String recruitJobId;

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobId( ) {
		return this.jobId;
	}

	public void setRecruitJobId(String recruitJobId) {
		this.recruitJobId = recruitJobId;
	}
	public String getRecruitJobId( ) {
		return this.recruitJobId;
	}

}
