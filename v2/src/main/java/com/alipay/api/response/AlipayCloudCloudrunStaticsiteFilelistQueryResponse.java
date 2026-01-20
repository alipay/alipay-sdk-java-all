package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StaticSiteFile;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.filelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 14:36:44
 */
public class AlipayCloudCloudrunStaticsiteFilelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3181381252368232733L;

	/** 
	 * 分页游标
	 */
	@ApiField("next_token")
	private String nextToken;

	/** 
	 * 文件列表
	 */
	@ApiField("object_list")
	private StaticSiteFile objectList;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public String getNextToken( ) {
		return this.nextToken;
	}

	public void setObjectList(StaticSiteFile objectList) {
		this.objectList = objectList;
	}
	public StaticSiteFile getObjectList( ) {
		return this.objectList;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

}
