package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡简单item信息
 *
 * @author auto create
 * @since 1.0, 2022-09-29 16:37:02
 */
public class TimeCardSimpleItemInfo extends AlipayObject {

	private static final long serialVersionUID = 3891356279268726212L;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 次卡商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 原价
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 现价
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 次数
	 */
	@ApiField("times")
	private Long times;

	/**
	 * 次卡标题
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getTimes() {
		return this.times;
	}
	public void setTimes(Long times) {
		this.times = times;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
