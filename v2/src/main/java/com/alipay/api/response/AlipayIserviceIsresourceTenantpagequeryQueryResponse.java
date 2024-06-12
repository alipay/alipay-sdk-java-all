package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiTenantInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.tenantpagequery.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-10 10:01:30
 */
public class AlipayIserviceIsresourceTenantpagequeryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7566984792715944164L;

	/** 
	 * 相关租户信息
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_tenant_info")
	private List<OpenApiTenantInfo> bizData;

	/** 
	 * 分页数量
	 */
	@ApiField("page_count")
	private Long pageCount;

	/** 
	 * 当前页码
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

	public void setBizData(List<OpenApiTenantInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiTenantInfo> getBizData( ) {
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
