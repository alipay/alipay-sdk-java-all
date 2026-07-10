package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReferralJobInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.referral.job.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-26 16:09:45
 */
public class AlipayEbppIndustryReferralJobBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2348126534112948726L;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * null
	 */
	@ApiListField("job_list")
	@ApiField("referral_job_info")
	private List<ReferralJobInfo> jobList;

	/** 
	 * 符合条件的岗位总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setJobList(List<ReferralJobInfo> jobList) {
		this.jobList = jobList;
	}
	public List<ReferralJobInfo> getJobList( ) {
		return this.jobList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
