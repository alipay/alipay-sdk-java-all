package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询解除授权的用户
 *
 * @author auto create
 * @since 1.0, 2023-11-24 12:01:51
 */
public class AlipayUserDeloauthDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6394628835138242211L;

	/**
	 * 商家查询日期为：date时，产生的解除授权记录
	 */
	@ApiField("date")
	private String date;

	/**
	 * 分页查询的记录数，单次查询的记录数上限
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 分页查询的偏移量，表示查询的起始位置是自(offset - 1)*limit，传入的offset必须大于0
	 */
	@ApiField("offset")
	private Long offset;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
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
