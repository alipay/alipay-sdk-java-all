package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OssDirectoryDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.directory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 14:59:16
 */
public class AlipayCloudCloudrunObjectstorageDirectoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1266147913599157182L;

	/** 
	 * 文件夹列表
	 */
	@ApiListField("directory_list")
	@ApiField("oss_directory_detail")
	private List<OssDirectoryDetail> directoryList;

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

	public void setDirectoryList(List<OssDirectoryDetail> directoryList) {
		this.directoryList = directoryList;
	}
	public List<OssDirectoryDetail> getDirectoryList( ) {
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
