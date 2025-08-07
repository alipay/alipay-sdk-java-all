package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商品详情
 *
 * @author auto create
 * @since 1.0, 2024-07-17 11:05:50
 */
public class AlipayCloudCloudpromoMallItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2733528388218587376L;

	/**
	 * 渠道商商品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 分销店铺id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

}
