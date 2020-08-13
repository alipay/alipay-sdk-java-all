package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用内容商品查询
 *
 * @author auto create
 * @since 1.0, 2020-07-27 09:39:40
 */
public class AlipayOpenAppAppcontentItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3374316236735182232L;

	/**
	 * 当前页码；大于0
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页查询数量；可选值：1到20
	 */
	@ApiField("page_size")
	private Long pageSize;

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
