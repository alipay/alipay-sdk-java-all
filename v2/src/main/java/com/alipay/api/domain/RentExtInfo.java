package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁单扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-03-18 16:05:55
 */
public class RentExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2728739699746981987L;

	/**
	 * 买家扩展信息
	 */
	@ApiField("buyer_ext_info")
	private RentBuyerExtInfo buyerExtInfo;

	/**
	 * 物流扩展信息
	 */
	@ApiField("delivery_ext_info")
	private RentDeliveryExtInfo deliveryExtInfo;

	/**
	 * 融资扩展信息
	 */
	@ApiListField("financing_ext_info")
	@ApiField("rent_financing_ext_info")
	private List<RentFinancingExtInfo> financingExtInfo;

	/**
	 * 商品扩展信息
	 */
	@ApiField("item_ext_info")
	private RentItemExtInfo itemExtInfo;

	/**
	 * 订单扩展信息
	 */
	@ApiField("order_ext_info")
	private RentOrderExtInfo orderExtInfo;

	public RentBuyerExtInfo getBuyerExtInfo() {
		return this.buyerExtInfo;
	}
	public void setBuyerExtInfo(RentBuyerExtInfo buyerExtInfo) {
		this.buyerExtInfo = buyerExtInfo;
	}

	public RentDeliveryExtInfo getDeliveryExtInfo() {
		return this.deliveryExtInfo;
	}
	public void setDeliveryExtInfo(RentDeliveryExtInfo deliveryExtInfo) {
		this.deliveryExtInfo = deliveryExtInfo;
	}

	public List<RentFinancingExtInfo> getFinancingExtInfo() {
		return this.financingExtInfo;
	}
	public void setFinancingExtInfo(List<RentFinancingExtInfo> financingExtInfo) {
		this.financingExtInfo = financingExtInfo;
	}

	public RentItemExtInfo getItemExtInfo() {
		return this.itemExtInfo;
	}
	public void setItemExtInfo(RentItemExtInfo itemExtInfo) {
		this.itemExtInfo = itemExtInfo;
	}

	public RentOrderExtInfo getOrderExtInfo() {
		return this.orderExtInfo;
	}
	public void setOrderExtInfo(RentOrderExtInfo orderExtInfo) {
		this.orderExtInfo = orderExtInfo;
	}

}
