package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 脱机交易黑名单列表
 *
 * @author auto create
 * @since 1.0, 2016-07-01 22:05:43
 */
public class AlipayCommerceTransportOfflinepayUserblacklistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4496158337351664369L;

	/**
	 * 用户黑名单分页ID，1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 脱机交易用户黑名单分页页大小，最大页大小不超过1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
