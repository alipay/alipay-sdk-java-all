package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云智能营销授权店铺商品查询
 *
 * @author auto create
 * @since 1.0, 2023-09-21 23:23:52
 */
public class TechriskInnovateMpcpromoItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4227165373992756136L;

	/**
	 * 被授权小程序的appId
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 店铺code
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAuthAppId() {
		return this.authAppId;
	}
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
