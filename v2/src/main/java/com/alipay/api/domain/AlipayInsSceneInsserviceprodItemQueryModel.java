package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家商品查询
 *
 * @author auto create
 * @since 1.0, 2023-06-09 18:04:14
 */
public class AlipayInsSceneInsserviceprodItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6715979693343315212L;

	/**
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
