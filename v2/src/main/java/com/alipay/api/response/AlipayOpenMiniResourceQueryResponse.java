package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryMiniResourceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.resource.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:54:13
 */
public class AlipayOpenMiniResourceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3834694368649744586L;

	/** 
	 * 数据结果 如果为空, 网关会不透出这个字段
	 */
	@ApiListField("data_list")
	@ApiField("query_mini_resource_response")
	private List<QueryMiniResourceResponse> dataList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 数据总量
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<QueryMiniResourceResponse> dataList) {
		this.dataList = dataList;
	}
	public List<QueryMiniResourceResponse> getDataList( ) {
		return this.dataList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
