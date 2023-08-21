package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FaasCloudDomains;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.domain.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-17 21:05:53
 */
public class AlipayCloudCloudbaseHttpaccessDomainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1533217345812857971L;

	/** 
	 * 域信息列表
	 */
	@ApiListField("cloud_domains")
	@ApiField("faas_cloud_domains")
	private List<FaasCloudDomains> cloudDomains;

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

	public void setCloudDomains(List<FaasCloudDomains> cloudDomains) {
		this.cloudDomains = cloudDomains;
	}
	public List<FaasCloudDomains> getCloudDomains( ) {
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
