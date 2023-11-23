package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.userpagequery.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:16:42
 */
public class AlipayIserviceIsresourceUserpagequeryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2225623725539956451L;

	/** 
	 * 查询的用户信息列表
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_user_info")
	private List<OpenApiUserInfo> bizData;

	/** 
	 * 页总数
	 */
	@ApiField("page_count")
	private Long pageCount;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setBizData(List<OpenApiUserInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiUserInfo> getBizData( ) {
		return this.bizData;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}
	public Long getPageCount( ) {
		return this.pageCount;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
