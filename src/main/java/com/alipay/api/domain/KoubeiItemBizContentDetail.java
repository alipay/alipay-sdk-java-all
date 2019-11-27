package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商品详情信息
 *
 * @author auto create
 * @since 1.0, 2017-07-17 19:03:35
 */
public class KoubeiItemBizContentDetail extends AlipayObject {

	private static final long serialVersionUID = 3269329316189222583L;

	/**
	 * 项目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 规格
	 */
	@ApiField("spec")
	private String spec;

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

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSpec() {
		return this.spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}

}
