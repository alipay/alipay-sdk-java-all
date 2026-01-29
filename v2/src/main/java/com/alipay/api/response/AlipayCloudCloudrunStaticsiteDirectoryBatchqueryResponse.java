package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StaticSiteDirectoryDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.directory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 14:36:44
 */
public class AlipayCloudCloudrunStaticsiteDirectoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4422343274416983871L;

	/** 
	 * 文件夹列表
	 */
	@ApiListField("directory_list")
	@ApiField("static_site_directory_detail")
	private List<StaticSiteDirectoryDetail> directoryList;

	/** 
	 * 分页游标下一页标记
	 */
	@ApiField("next_token")
	private String nextToken;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setDirectoryList(List<StaticSiteDirectoryDetail> directoryList) {
		this.directoryList = directoryList;
	}
	public List<StaticSiteDirectoryDetail> getDirectoryList( ) {
		return this.directoryList;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public String getNextToken( ) {
		return this.nextToken;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

}
