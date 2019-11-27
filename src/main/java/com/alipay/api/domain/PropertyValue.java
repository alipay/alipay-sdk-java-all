package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务的属性值信息，根据属性名可以存在多个属性名
 *
 * @author auto create
 * @since 1.0, 2016-12-21 15:35:15
 */
public class PropertyValue extends AlipayObject {

	private static final long serialVersionUID = 5452417915316497262L;

	/**
	 * 属性值的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 该属性的价格，单位元，如果是一维价格直接使用字符串，比如：“30.5”，如果是多维，比如同一个属性不同地区价格不同的情况，比如
{
  “-1”: “30”, //表示默认价
 “杭州code”：“50”，
 “北京code”: “60”
}
	 */
	@ApiField("price")
	private String price;

	/**
	 * 价格维度类型，可选值[string,json]，不填默认string，表示price的类型为是一维价格，如果是json默认是多维价格
	 */
	@ApiField("price_dim_type")
	private String priceDimType;

	/**
	 * 可以用数量具象时需要填写，比如日常保洁中，服务时长属性中包括：2小时、3小时，那么需要使用quantity来表示2、3这些数字，小时使用unit的PER_HOUR
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 级联的子属性index值
	 */
	@ApiField("sub_prop_index")
	private Long subPropIndex;

	/**
	 * 服务库存单位，包括：PER_TIME（每次）、PER_GE（每个）、PER_FU（每幅）、PER_PIECE（每份）、PER_DAN（每单）、PER_HOUR（每小时)
	 */
	@ApiField("unit")
	private String unit;

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

	public String getPriceDimType() {
		return this.priceDimType;
	}
	public void setPriceDimType(String priceDimType) {
		this.priceDimType = priceDimType;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getSubPropIndex() {
		return this.subPropIndex;
	}
	public void setSubPropIndex(Long subPropIndex) {
		this.subPropIndex = subPropIndex;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
