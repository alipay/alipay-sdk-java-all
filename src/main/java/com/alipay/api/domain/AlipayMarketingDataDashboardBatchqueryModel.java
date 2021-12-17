package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询云数据实验室仪表盘列表
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:32
 */
public class AlipayMarketingDataDashboardBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4677865289311793564L;

	/**
	 * 当前页码
	 */
	@ApiField("page")
	private String page;

	/**
	 * 每页最大条数，最大每页30条
	 */
	@ApiField("size")
	private String size;

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
