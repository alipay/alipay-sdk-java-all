package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OssObjectDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.filelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-28 10:16:56
 */
public class AlipayCloudCloudrunObjectstorageFilelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2417582374175431129L;

	/** 
	 * 分页游标下一页标记
	 */
	@ApiField("next_token")
	private String nextToken;

	/** 
	 * 文件列表
	 */
	@ApiListField("object_list")
	@ApiField("oss_object_detail")
	private List<OssObjectDetail> objectList;

	/** 
	 * 单页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public String getNextToken( ) {
		return this.nextToken;
	}

	public void setObjectList(List<OssObjectDetail> objectList) {
		this.objectList = objectList;
	}
	public List<OssObjectDetail> getObjectList( ) {
		return this.objectList;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

}
