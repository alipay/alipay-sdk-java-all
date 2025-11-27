package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrganizationJobInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.organization.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-14 14:57:41
 */
public class AlipayEbppIndustryJobOrganizationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1746641669149932673L;

	/** 
	 * null
	 */
	@ApiListField("job_info_list")
	@ApiField("organization_job_info")
	private List<OrganizationJobInfo> jobInfoList;

	/** 
	 * 总岗位数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setJobInfoList(List<OrganizationJobInfo> jobInfoList) {
		this.jobInfoList = jobInfoList;
	}
	public List<OrganizationJobInfo> getJobInfoList( ) {
		return this.jobInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
