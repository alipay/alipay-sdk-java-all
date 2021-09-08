package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分组列表查询
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:11:23
 */
public class AlipayCommerceIotGroupBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3856795371423824217L;

	/**
	 * 业务类型-代表不同的业务场景 distribution表示服务分发
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 每页数量
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 分页搜索偏移值
	 */
	@ApiField("offset")
	private Long offset;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

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
