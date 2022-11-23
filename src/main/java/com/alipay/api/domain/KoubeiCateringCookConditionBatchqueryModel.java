package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据商户店铺批量查询菜谱
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:39:39
 */
public class KoubeiCateringCookConditionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3498173216317726914L;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 查询页码，表示第几页
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小，表示每页查询数量，不超过50
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 口碑店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
