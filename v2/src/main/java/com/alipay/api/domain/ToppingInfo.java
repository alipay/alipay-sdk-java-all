package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可选加料的信息
 *
 * @author auto create
 * @since 1.0, 2024-12-31 16:41:30
 */
public class ToppingInfo extends AlipayObject {

	private static final long serialVersionUID = 6595667349745625878L;

	/**
	 * 加料数量，单位为份
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 加料名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 加料价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 加料类型编码，商品列表查询接口中，返回了可选加料列表，该字段取可选加料列表中指定加料类型的code字段值
	 */
	@ApiField("type")
	private String type;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
