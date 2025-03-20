package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenQueryPoimBaseResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.addresssearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 09:52:04
 */
public class AntMerchantExpandAddresssearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2725212413563456247L;

	/** 
	 * 经纬度,名称和地址以及省市区信息,是一个集合List
	 */
	@ApiListField("data")
	@ApiField("open_query_poim_base_response")
	private List<OpenQueryPoimBaseResponse> data;

	/** 
	 * 当前页码，默认第一页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 表示返回记录总页面数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 表示返回记录数总记录
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setData(List<OpenQueryPoimBaseResponse> data) {
		this.data = data;
	}
	public List<OpenQueryPoimBaseResponse> getData( ) {
		return this.data;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
