package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-17 10:22:05
 */
public class KoubeiAdvertCommissionChannelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4865165949866363414L;

	/**
	 * 分页查询的页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 渠道批量查询，分页查询的每页数量
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
