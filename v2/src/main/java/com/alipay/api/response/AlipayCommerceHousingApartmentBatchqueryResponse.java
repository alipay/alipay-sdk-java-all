package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApartmentModelDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.apartment.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-04 13:47:26
 */
public class AlipayCommerceHousingApartmentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5231311693632715159L;

	/** 
	 * 返回结果
	 */
	@ApiField("list")
	private ApartmentModelDTO list;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	public void setList(ApartmentModelDTO list) {
		this.list = list;
	}
	public ApartmentModelDTO getList( ) {
		return this.list;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
