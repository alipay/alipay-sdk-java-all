package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收品牌查询
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:32
 */
public class AlipayCommerceRecycleBrandQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8113293727126526534L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 产品类目code
	 */
	@ApiField("product_category_code")
	private String productCategoryCode;

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

	public String getProductCategoryCode() {
		return this.productCategoryCode;
	}
	public void setProductCategoryCode(String productCategoryCode) {
		this.productCategoryCode = productCategoryCode;
	}

}
