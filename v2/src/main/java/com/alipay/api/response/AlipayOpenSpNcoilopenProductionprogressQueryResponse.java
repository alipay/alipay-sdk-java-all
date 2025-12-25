package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SaleOrderOpenApiRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.productionprogress.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:04:44
 */
public class AlipayOpenSpNcoilopenProductionprogressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6229531868263795491L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 当前页具体数据
	 */
	@ApiListField("sale_order_list")
	@ApiField("sale_order_open_api_res")
	private List<SaleOrderOpenApiRes> saleOrderList;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

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

	public void setSaleOrderList(List<SaleOrderOpenApiRes> saleOrderList) {
		this.saleOrderList = saleOrderList;
	}
	public List<SaleOrderOpenApiRes> getSaleOrderList( ) {
		return this.saleOrderList;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
