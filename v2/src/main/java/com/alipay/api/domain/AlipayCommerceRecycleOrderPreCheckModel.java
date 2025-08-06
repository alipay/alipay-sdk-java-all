package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收交易预咨询
 *
 * @author auto create
 * @since 1.0, 2025-04-11 17:30:35
 */
public class AlipayCommerceRecycleOrderPreCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7132454388347314422L;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单的卖家id。
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerOpenId() {
		return this.sellerOpenId;
	}
	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}

}
