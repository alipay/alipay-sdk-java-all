package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Version;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.version.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-01 10:21:48
 */
public class AlipayCloudCloudbaseFunctionVersionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1623144776993166383L;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 数据总数
	 */
	@ApiField("total")
	private String total;

	/** 
	 * 云函数版本信息列表
	 */
	@ApiListField("versions")
	@ApiField("version")
	private List<Version> versions;

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}
	public List<Version> getVersions( ) {
		return this.versions;
	}

}
