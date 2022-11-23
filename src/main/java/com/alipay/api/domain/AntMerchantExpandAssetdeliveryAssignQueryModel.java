package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取配送指令
 *
 * @author auto create
 * @since 1.0, 2021-08-09 17:43:31
 */
public class AntMerchantExpandAssetdeliveryAssignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8516678464761467442L;

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
