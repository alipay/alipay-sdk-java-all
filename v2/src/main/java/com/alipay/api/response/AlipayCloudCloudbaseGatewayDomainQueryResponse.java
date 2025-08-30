package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CloudGateway;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.gateway.domain.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 20:57:36
 */
public class AlipayCloudCloudbaseGatewayDomainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8174611593367657886L;

	/** 
	 * 域信息列表
	 */
	@ApiListField("cloud_domains")
	@ApiField("cloud_gateway")
	private List<CloudGateway> cloudDomains;

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

	public void setCloudDomains(List<CloudGateway> cloudDomains) {
		this.cloudDomains = cloudDomains;
	}
	public List<CloudGateway> getCloudDomains( ) {
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
