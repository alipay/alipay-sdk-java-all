package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页器
 *
 * @author auto create
 * @since 1.0, 2021-07-19 15:26:17
 */
public class Paginator extends AlipayObject {

	private static final long serialVersionUID = 4892974164715742432L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录数, 最大值只能是10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总记录数, 作为参数时该值不需要填写, 填写将被忽略
	 */
	@ApiField("total_items")
	private Long totalItems;

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

	public Long getTotalItems() {
		return this.totalItems;
	}
	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}

}
