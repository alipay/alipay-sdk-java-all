package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AdvanceOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.scanpurchase.userpreorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:34:14
 */
public class KoubeiMallScanpurchaseUserpreorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4321824464985169886L;

	/** 
	 * 预订单信息
	 */
	@ApiField("advance_order")
	private AdvanceOrder advanceOrder;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 商圈是否开通会员系统
	 */
	@ApiField("mall_has_card")
	private Boolean mallHasCard;

	/** 
	 * 用户是否开通会员卡
	 */
	@ApiField("open_card")
	private Boolean openCard;

	/** 
	 * 开通会员卡地址
	 */
	@ApiField("open_card_url")
	private String openCardUrl;

	/** 
	 * 口碑交易订单ID。只有在用户真实下单才会有。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单状态，包含：（初始化：INIT，待付款：WAIT_PAY,  付款成功：PAID，关闭状态：CLOSE）
	 */
	@ApiField("status")
	private String status;

	public void setAdvanceOrder(AdvanceOrder advanceOrder) {
		this.advanceOrder = advanceOrder;
	}
	public AdvanceOrder getAdvanceOrder( ) {
		return this.advanceOrder;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setMallHasCard(Boolean mallHasCard) {
		this.mallHasCard = mallHasCard;
	}
	public Boolean getMallHasCard( ) {
		return this.mallHasCard;
	}

	public void setOpenCard(Boolean openCard) {
		this.openCard = openCard;
	}
	public Boolean getOpenCard( ) {
		return this.openCard;
	}

	public void setOpenCardUrl(String openCardUrl) {
		this.openCardUrl = openCardUrl;
	}
	public String getOpenCardUrl( ) {
		return this.openCardUrl;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
