package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送商家门店分页查询
 *
 * @author auto create
 * @since 1.0, 2022-09-14 20:30:24
 */
public class AlipayOpenInstantdeliveryMerchantshopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3371667973482858837L;

	/**
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页数量, 最大50。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商家门店编码。
	 */
	@ApiField("shop_no")
	private String shopNo;

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

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

}
