package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实体查询分页信息
 *
 * @author auto create
 * @since 1.0, 2025-07-14 20:50:54
 */
public class EntityPagination extends AlipayObject {

	private static final long serialVersionUID = 2783874481719769288L;

	/**
	 * 当前页码
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总数量，表示可返回的实体总数是多少个
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
