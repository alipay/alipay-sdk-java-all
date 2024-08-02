package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单详细数据
 *
 * @author auto create
 * @since 1.0, 2024-05-30 16:06:18
 */
public class OrderDetailInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2634881743353357926L;

	/**
	 * 拼团信息
	 */
	@ApiField("group_buy_info")
	private GroupBuyInfo groupBuyInfo;

	/**
	 * 商品列表
	 */
	@ApiListField("item_infos")
	@ApiField("order_item_info_v_o")
	private List<OrderItemInfoVO> itemInfos;

	/**
	 * 订单标签对象
	 */
	@ApiField("order_tag_info")
	private OrderTagInfo orderTagInfo;

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

	/**
	 * 优惠申领信息
	 */
	@ApiField("promo_apply_info")
	private PromoApplyInfoVO promoApplyInfo;

	public GroupBuyInfo getGroupBuyInfo() {
		return this.groupBuyInfo;
	}
	public void setGroupBuyInfo(GroupBuyInfo groupBuyInfo) {
		this.groupBuyInfo = groupBuyInfo;
	}

	public List<OrderItemInfoVO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<OrderItemInfoVO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public OrderTagInfo getOrderTagInfo() {
		return this.orderTagInfo;
	}
	public void setOrderTagInfo(OrderTagInfo orderTagInfo) {
		this.orderTagInfo = orderTagInfo;
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

	public PromoApplyInfoVO getPromoApplyInfo() {
		return this.promoApplyInfo;
	}
	public void setPromoApplyInfo(PromoApplyInfoVO promoApplyInfo) {
		this.promoApplyInfo = promoApplyInfo;
	}

}
