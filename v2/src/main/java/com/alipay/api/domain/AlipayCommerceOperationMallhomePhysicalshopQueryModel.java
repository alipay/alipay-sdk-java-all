package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物理门店批量查询
 *
 * @author auto create
 * @since 1.0, 2025-06-27 19:37:47
 */
public class AlipayCommerceOperationMallhomePhysicalshopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6737494469667163871L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 页码，不能小于1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页每页的数量，在1-100之间
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
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
