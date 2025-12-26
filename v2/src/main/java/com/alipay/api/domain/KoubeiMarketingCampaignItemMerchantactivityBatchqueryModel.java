package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询商品代金券列表
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:10:53
 */
public class KoubeiMarketingCampaignItemMerchantactivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1713224227662547233L;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页显示内容数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 活动状态
	 */
	@ApiField("status")
	private String status;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
