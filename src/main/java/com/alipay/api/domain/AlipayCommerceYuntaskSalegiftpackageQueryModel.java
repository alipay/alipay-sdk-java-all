package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户可使用券包查询
 *
 * @author auto create
 * @since 1.0, 2022-10-31 19:50:46
 */
public class AlipayCommerceYuntaskSalegiftpackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1292837128538672576L;

	/**
	 * 商家pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 分页页码，默认是1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 页面大小，默认是10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
