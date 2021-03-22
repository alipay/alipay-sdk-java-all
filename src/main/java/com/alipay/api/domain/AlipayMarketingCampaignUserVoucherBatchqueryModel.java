package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝根据用户id查询券信息
 *
 * @author auto create
 * @since 1.0, 2020-11-26 15:06:13
 */
public class AlipayMarketingCampaignUserVoucherBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1546958314518229524L;

	/**
	 * 分页查询的当前页号,从1开始
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 分页查询的单页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
