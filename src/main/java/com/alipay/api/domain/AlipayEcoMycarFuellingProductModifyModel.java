package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加油站门店商品营销信息设置接口
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:51:27
 */
public class AlipayEcoMycarFuellingProductModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2323757288728438732L;

	/**
	 * 外部门店编号系统唯一，该值添加后不可修改，与字段shop_id不能同时为空
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 商品信息集合，JSON格式,注意，该参数将覆盖原有已经设置的数据,即如想除去某一商品，去除后重新设置该字段值。
	 */
	@ApiListField("product")
	@ApiField("product")
	private List<Product> product;

	/**
	 * 促销信息集合，JSON格式
	 */
	@ApiListField("sale")
	@ApiField("sale")
	private List<Sale> sale;

	/**
	 * 车主平台内部门店编号，系统唯一,与字段out_shop_id不能同时为空
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public List<Product> getProduct() {
		return this.product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public List<Sale> getSale() {
		return this.sale;
	}
	public void setSale(List<Sale> sale) {
		this.sale = sale;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
