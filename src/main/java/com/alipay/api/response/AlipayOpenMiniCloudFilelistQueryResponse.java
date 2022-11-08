package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FileBaseInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.filelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-14 14:31:51
 */
public class AlipayOpenMiniCloudFilelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3859597894231486998L;

	/** 
	 * 文件列表
	 */
	@ApiListField("file_base_info_response_list")
	@ApiField("file_base_info_response")
	private List<FileBaseInfoResponse> fileBaseInfoResponseList;

	/** 
	 * 文件列表游标索引
	 */
	@ApiField("next_token")
	private String nextToken;

	/** 
	 * 本次查询返回的列表长度
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setFileBaseInfoResponseList(List<FileBaseInfoResponse> fileBaseInfoResponseList) {
		this.fileBaseInfoResponseList = fileBaseInfoResponseList;
	}
	public List<FileBaseInfoResponse> getFileBaseInfoResponseList( ) {
		return this.fileBaseInfoResponseList;
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
