package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.mindv.jobsbyuser.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:58
 */
public class AlipayIserviceMindvJobsbyuserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1318997872625429469L;

	/** 
	 * 用户填写的任务id列表
	 */
	@ApiListField("job_ids")
	@ApiField("number")
	private List<Long> jobIds;

	public void setJobIds(List<Long> jobIds) {
		this.jobIds = jobIds;
	}
	public List<Long> getJobIds( ) {
		return this.jobIds;
	}

}
