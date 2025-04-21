package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApartmentHouseModelDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.apartment.rental.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:12:26
 */
public class AlipayCommerceHousingApartmentRentalBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2812225358547122925L;

	/** 
	 * 返回结果
	 */
	@ApiField("list")
	private ApartmentHouseModelDTO list;

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

	public void setList(ApartmentHouseModelDTO list) {
		this.list = list;
	}
	public ApartmentHouseModelDTO getList( ) {
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
