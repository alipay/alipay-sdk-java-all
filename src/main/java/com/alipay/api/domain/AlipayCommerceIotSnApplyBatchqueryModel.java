package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询历史sn生成操作
 *
 * @author auto create
 * @since 1.0, 2019-11-26 14:32:09
 */
public class AlipayCommerceIotSnApplyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2216286484893636275L;

	/**
	 * 每页数量，最多100
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 分页搜索偏移值
	 */
	@ApiField("offset")
	private Long offset;

	public Long getLimit() {
		return this.limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getOffset() {
		return this.offset;
	}
	public void setOffset(Long offset) {
		this.offset = offset;
	}

}
