package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公寓房源批量查询
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:12:26
 */
public class AlipayCommerceHousingApartmentRentalBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4874122243364261967L;

	/**
	 * 公寓id
	 */
	@ApiField("apartment_id")
	private String apartmentId;

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

	public String getApartmentId() {
		return this.apartmentId;
	}
	public void setApartmentId(String apartmentId) {
		this.apartmentId = apartmentId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
