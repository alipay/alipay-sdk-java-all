package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询历史sn生成操作
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:51:34
 */
public class AlipayCommerceIotSnApplyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6221211919354366329L;

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

	/**
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

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

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
