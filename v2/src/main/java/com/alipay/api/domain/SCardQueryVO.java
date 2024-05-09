package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 省卡咨询结果
 *
 * @author auto create
 * @since 1.0, 2020-04-14 19:08:03
 */
public class SCardQueryVO extends AlipayObject {

	private static final long serialVersionUID = 7636625992925441734L;

	/**
	 * 背景图
	 */
	@ApiField("back_img")
	private String backImg;

	/**
	 * 权益价值-单位分
	 */
	@ApiField("item_amount")
	private Long itemAmount;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 优惠信息名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 售卖价格-单位分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	public String getBackImg() {
		return this.backImg;
	}
	public void setBackImg(String backImg) {
		this.backImg = backImg;
	}

	public Long getItemAmount() {
		return this.itemAmount;
	}
	public void setItemAmount(Long itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

}
