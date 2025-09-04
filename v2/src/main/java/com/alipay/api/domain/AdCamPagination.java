package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页信息返回对象
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:53
 */
public class AdCamPagination extends AlipayObject {

	private static final long serialVersionUID = 5837569445846515229L;

	/**
	 * 当前页
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 单页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 数据总量。单位：条数
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
