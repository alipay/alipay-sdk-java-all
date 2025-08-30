package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 量表自测列表查询
 *
 * @author auto create
 * @since 1.0, 2025-02-17 15:47:07
 */
public class AlipayCommerceMedicalHealthGaugeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5545336451779983348L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页查询中的页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 可选，默认5
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
