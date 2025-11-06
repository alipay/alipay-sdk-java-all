package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租方指定资方或制定分账计划
 *
 * @author auto create
 * @since 1.0, 2025-10-10 17:32:39
 */
public class AlipayCommerceRentOrderSellerPublishModel extends AlipayObject {

	private static final long serialVersionUID = 3666585813465112395L;

	/**
	 * 买家支付宝用户ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝OPENID
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 资方appid，可选，如果需要向非资商关系中的appid发送通知消息，可传递本参数
	 */
	@ApiField("invest_app_id")
	private String investAppId;

	/**
	 * 资方pid，2088开头
	 */
	@ApiField("invest_id")
	private String investId;

	/**
	 * 不传值时默认为create
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 交易组件订单Id，取值：租赁下单接口返回的orderId
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * null
	 */
	@ApiListField("royalty_publish_detail")
	@ApiField("royalty_publish_detail_info")
	private List<RoyaltyPublishDetailInfo> royaltyPublishDetail;

	/**
	 * 二级商户信息	
	 */
	@ApiField("sub_merchant")
	private RentSubMerchant subMerchant;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getInvestAppId() {
		return this.investAppId;
	}
	public void setInvestAppId(String investAppId) {
		this.investAppId = investAppId;
	}

	public String getInvestId() {
		return this.investId;
	}
	public void setInvestId(String investId) {
		this.investId = investId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<RoyaltyPublishDetailInfo> getRoyaltyPublishDetail() {
		return this.royaltyPublishDetail;
	}
	public void setRoyaltyPublishDetail(List<RoyaltyPublishDetailInfo> royaltyPublishDetail) {
		this.royaltyPublishDetail = royaltyPublishDetail;
	}

	public RentSubMerchant getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(RentSubMerchant subMerchant) {
		this.subMerchant = subMerchant;
	}

}
