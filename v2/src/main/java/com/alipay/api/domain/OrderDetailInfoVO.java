package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单详细数据
 *
 * @author auto create
 * @since 1.0, 2023-07-18 11:23:18
 */
public class OrderDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3369957964828416947L;

	/**
	 * 商品列表
	 */
	@ApiListField("item_infos")
	@ApiField("order_item_info_v_o")
	private List<OrderItemInfoVO> itemInfos;

	/**
	 * 支付信息
	 */
	@ApiField("pay_info")
	private PayInfoVO payInfo;

	/**
	 * 价格信息
	 */
	@ApiField("price_info")
	private PriceInfoVO priceInfo;

	public List<OrderItemInfoVO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<OrderItemInfoVO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public PayInfoVO getPayInfo() {
		return this.payInfo;
	}
	public void setPayInfo(PayInfoVO payInfo) {
		this.payInfo = payInfo;
	}

	public PriceInfoVO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(PriceInfoVO priceInfo) {
		this.priceInfo = priceInfo;
	}

}
