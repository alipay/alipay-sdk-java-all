package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云子单复杂类型
 *
 * @author auto create
 * @since 1.0, 2024-07-01 14:05:18
 */
public class SingleOrderVO extends AlipayObject {

	private static final long serialVersionUID = 5573559311656583253L;

	/**
	 * 是否可售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 履约信息
	 */
	@ApiListField("delivery_info_list")
	@ApiField("mpc_delivery_info")
	private List<MpcDeliveryInfo> deliveryInfoList;

	/**
	 * 商品sku列表
	 */
	@ApiListField("product_list")
	@ApiField("mpc_product_result")
	private List<MpcProductResult> productList;

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public List<MpcDeliveryInfo> getDeliveryInfoList() {
		return this.deliveryInfoList;
	}
	public void setDeliveryInfoList(List<MpcDeliveryInfo> deliveryInfoList) {
		this.deliveryInfoList = deliveryInfoList;
	}

	public List<MpcProductResult> getProductList() {
		return this.productList;
	}
	public void setProductList(List<MpcProductResult> productList) {
		this.productList = productList;
	}

}
