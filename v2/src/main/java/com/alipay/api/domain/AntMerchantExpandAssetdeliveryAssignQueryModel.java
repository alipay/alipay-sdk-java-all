package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取配送指令
 *
 * @author auto create
 * @since 1.0, 2025-07-24 17:27:21
 */
public class AntMerchantExpandAssetdeliveryAssignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8823934929184787512L;

	/**
	 * 每次拉取最大记录数量，可选值为[1,200] ;
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
