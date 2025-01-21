package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠券或者商品信息
 *
 * @author auto create
 * @since 1.0, 2018-11-20 14:59:29
 */
public class ItemBo extends AlipayObject {

	private static final long serialVersionUID = 3837229958426563716L;

	/**
	 * json 字符串表示额外信息
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * logo链接
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 原价
	 */
	@ApiField("origin_price")
	private Long originPrice;

	/**
	 * 现价
	 */
	@ApiField("price")
	private Long price;

	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(Long originPrice) {
		this.originPrice = originPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

}
