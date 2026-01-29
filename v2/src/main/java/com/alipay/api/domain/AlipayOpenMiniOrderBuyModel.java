package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易购买接口
 *
 * @author auto create
 * @since 1.0, 2026-01-05 10:29:45
 */
public class AlipayOpenMiniOrderBuyModel extends AlipayObject {

	private static final long serialVersionUID = 5135917275893448131L;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝登录账号。 buyer_logon_id和buyer_id两者传其一，和buyer_id不能同时为空，建议通过buyer_id来传递买家信息。
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 购物车订单列表
	 */
	@ApiListField("mini_order_create_requests")
	@ApiField("order_buy_d_t_o")
	private List<OrderBuyDTO> miniOrderCreateRequests;

	/**
	 * 交易购买号，唯一标识当前用户的此次购买行为
	 */
	@ApiField("order_buy_no")
	private String orderBuyNo;

	/**
	 * 订单优惠信息
	 */
	@ApiField("promo_detail_info")
	private PromoDetailInfoDTO promoDetailInfo;

	/**
	 * 追踪ID，公域分发场景必传，会影响主播归因、分享员归因等；通过调用 my.checkBeforeAddOrder 接口返回
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 订单相对超时时间。从交易创建时间开始计算。 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。 默认值为3h。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerLogonId() {
		return this.buyerLogonId;
	}
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public List<OrderBuyDTO> getMiniOrderCreateRequests() {
		return this.miniOrderCreateRequests;
	}
	public void setMiniOrderCreateRequests(List<OrderBuyDTO> miniOrderCreateRequests) {
		this.miniOrderCreateRequests = miniOrderCreateRequests;
	}

	public String getOrderBuyNo() {
		return this.orderBuyNo;
	}
	public void setOrderBuyNo(String orderBuyNo) {
		this.orderBuyNo = orderBuyNo;
	}

	public PromoDetailInfoDTO getPromoDetailInfo() {
		return this.promoDetailInfo;
	}
	public void setPromoDetailInfo(PromoDetailInfoDTO promoDetailInfo) {
		this.promoDetailInfo = promoDetailInfo;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
