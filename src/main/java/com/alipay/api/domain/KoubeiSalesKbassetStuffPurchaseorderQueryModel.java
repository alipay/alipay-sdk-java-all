package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料采购单获取接口
 *
 * @author auto create
 * @since 1.0, 2018-09-25 11:41:40
 */
public class KoubeiSalesKbassetStuffPurchaseorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3337787141565949525L;

	/**
	 * 每页大小：最小1，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
