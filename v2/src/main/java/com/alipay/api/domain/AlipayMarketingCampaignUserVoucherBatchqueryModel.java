package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝根据用户id查询券信息
 *
 * @author auto create
 * @since 1.0, 2025-05-12 19:37:13
 */
public class AlipayMarketingCampaignUserVoucherBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7238438896267818265L;

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

	/**
	 * 券状态： 可用(ENABLED)，已核销(即完全使用，USED)，已过期(EXPIRED)，不可用(DISABLED)
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

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

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}
