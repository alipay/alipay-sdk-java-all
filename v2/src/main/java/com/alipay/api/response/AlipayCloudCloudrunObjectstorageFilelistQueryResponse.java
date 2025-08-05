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
 * @since 1.0, 2023-08-30 19:36:42
 */
public class AlipayCloudCloudrunObjectstorageFilelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6429686343147927921L;

	/** 
	 * 分页游标下一页标记，文件列表游标索引，next_token为文件分页参数，在本接口的响应中获取，传入next_token以获取下一页数据，若next_token为空代表当前已到页尾，没有下一页
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
