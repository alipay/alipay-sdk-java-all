package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意查询分页信息
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:41:28
 */
public class PageInfo extends AlipayObject {

	private static final long serialVersionUID = 3593462149121617121L;

	/**
	 * 分页查询当前页
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 分页查询单页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 创意总数
	 */
	@ApiField("total")
	private Long total;

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
