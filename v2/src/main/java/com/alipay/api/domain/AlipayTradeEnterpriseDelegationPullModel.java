package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业代理支付签约信息列表查询
 *
 * @author auto create
 * @since 1.0, 2026-05-22 14:02:50
 */
public class AlipayTradeEnterpriseDelegationPullModel extends AlipayObject {

	private static final long serialVersionUID = 5768217776895774789L;

	/**
	 * 分页参数，行数，限制多少条数据返回
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 查询多少页以后的数据
	 */
	@ApiField("offset")
	private Long offset;

	/**
	 * 授权状态，1 正常 2 取消
	 */
	@ApiField("status")
	private String status;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
