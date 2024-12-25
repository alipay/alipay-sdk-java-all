package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云智能营销商城订单渲染
 *
 * @author auto create
 * @since 1.0, 2023-12-21 15:38:35
 */
public class TechriskInnovateMpcpromoOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1714284253953112598L;

	/**
	 * 由调用方定义的用户，可以使用用户名或者商户自定义用户id
	 */
	@ApiField("buyer")
	private String buyer;

	/**
	 * 商家商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 购买数量
	 */
	@ApiField("quantity")
	private Long quantity;

	public String getBuyer() {
		return this.buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
