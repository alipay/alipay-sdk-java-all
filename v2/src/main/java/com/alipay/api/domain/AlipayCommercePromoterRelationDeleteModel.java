package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导购员关系解绑
 *
 * @author auto create
 * @since 1.0, 2022-12-07 15:02:49
 */
public class AlipayCommercePromoterRelationDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1437817125841287533L;

	/**
	 * 商家id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 导购员id
	 */
	@ApiField("promoter_id")
	private String promoterId;

	/**
	 * 导购员id
	 */
	@ApiField("promoter_open_id")
	private String promoterOpenId;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getPromoterId() {
		return this.promoterId;
	}
	public void setPromoterId(String promoterId) {
		this.promoterId = promoterId;
	}

	public String getPromoterOpenId() {
		return this.promoterOpenId;
	}
	public void setPromoterOpenId(String promoterOpenId) {
		this.promoterOpenId = promoterOpenId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
