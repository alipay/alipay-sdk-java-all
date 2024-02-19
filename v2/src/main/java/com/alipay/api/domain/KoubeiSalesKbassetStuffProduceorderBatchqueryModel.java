package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页获取口碑物料生产单
 *
 * @author auto create
 * @since 1.0, 2022-12-26 16:20:09
 */
public class KoubeiSalesKbassetStuffProduceorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6786691779372632756L;

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
