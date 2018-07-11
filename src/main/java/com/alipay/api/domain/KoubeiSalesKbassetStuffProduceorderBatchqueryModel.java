package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页获取口碑物料生产单
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:39:44
 */
public class KoubeiSalesKbassetStuffProduceorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8324982667472651293L;

	/**
	 * 每页容量：最小1，最大100
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
