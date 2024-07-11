package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:00
 */
public class ItemDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2524373246814866315L;

	/**
	 * 商品扩展信息，目前只有单品补贴金额
	 */
	@ApiField("ext_info")
	private PromoItemExtInfo extInfo;

	/**
	 * 商家侧商品ID，是商户侧商品的唯一标识，由商家自定义，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部skuid
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品的单价（元）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	public PromoItemExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(PromoItemExtInfo extInfo) {
		this.extInfo = extInfo;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
