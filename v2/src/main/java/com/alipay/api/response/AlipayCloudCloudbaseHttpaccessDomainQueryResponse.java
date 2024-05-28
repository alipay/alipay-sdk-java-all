package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CloudDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.domain.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 11:21:42
 */
public class AlipayCloudCloudbaseHttpaccessDomainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3581619432679592481L;

	/** 
	 * 域信息列表
	 */
	@ApiListField("cloud_domains")
	@ApiField("cloud_domain")
	private List<CloudDomain> cloudDomains;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setCloudDomains(List<CloudDomain> cloudDomains) {
		this.cloudDomains = cloudDomains;
	}
	public List<CloudDomain> getCloudDomains( ) {
		return this.cloudDomains;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
