package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询圈选商品
 *
 * @author auto create
 * @since 1.0, 2024-07-10 18:06:33
 */
public class AlipayCloudCloudpromoMallItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7169349191941432375L;

	/**
	 * 类目id，按照类目维度圈选商品
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 页号
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 分销店铺id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

}
