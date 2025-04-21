package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourcePackage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:40:36
 */
public class AlipayCloudCloudbaseResourcepackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4592961132387929988L;

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
	 * 资源包列表信息
	 */
	@ApiListField("resource_packages")
	@ApiField("resource_package")
	private List<ResourcePackage> resourcePackages;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

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

	public void setResourcePackages(List<ResourcePackage> resourcePackages) {
		this.resourcePackages = resourcePackages;
	}
	public List<ResourcePackage> getResourcePackages( ) {
		return this.resourcePackages;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
