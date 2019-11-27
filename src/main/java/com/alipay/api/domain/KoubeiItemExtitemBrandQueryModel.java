package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌查询接口
 *
 * @author auto create
 * @since 1.0, 2017-08-30 10:54:27
 */
public class KoubeiItemExtitemBrandQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1855868245235695484L;

	/**
	 * 当前页码。
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小。最大50条，超过限制默认50
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
