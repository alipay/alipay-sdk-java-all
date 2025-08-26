package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道查询接口
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:12
 */
public class KoubeiAdvertCommissionChannelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4613184699514457842L;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 每页数量
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
