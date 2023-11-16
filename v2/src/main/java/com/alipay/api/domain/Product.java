package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息集合，JSON格式,注意，该参数将覆盖原有已经设置的数据,即如想除去某一商品，去除后重新设置该字段值。
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:51:27
 */
public class Product extends AlipayObject {

	private static final long serialVersionUID = 8596353168495644644L;

	/**
	 * 油品编号。（可设置的油品编号名称：89#，92#，95#，98#，101#，10#，5#，0#，-10#，-20#，-35#，-50#）。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 油品价格（元/升），加油站列表页展示给用户。保留小数点后两位，单位元
	 */
	@ApiField("price")
	private String price;

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

}
