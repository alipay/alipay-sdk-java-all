package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品单信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 10:36:34
 */
public class ItemOrderVO extends AlipayObject {

	private static final long serialVersionUID = 6683626396977446191L;

	/**
	 * 业务扩展信息，比如外部卡码，格式为json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品单ID
	 */
	@ApiField("item_order_no")
	private String itemOrderNo;

	/**
	 * 商品单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemOrderNo() {
		return this.itemOrderNo;
	}
	public void setItemOrderNo(String itemOrderNo) {
		this.itemOrderNo = itemOrderNo;
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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
