package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发布分账计划模型
 *
 * @author auto create
 * @since 1.0, 2024-09-02 11:18:45
 */
public class AlipayCommerceRentRoyaltyInvestPublishModel extends AlipayObject {

	private static final long serialVersionUID = 6427275334549674949L;

	/**
	 * 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息; 其中buyer_id与buyer_open_id不能同时为空
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 资方appId
	 */
	@ApiField("invest_app_id")
	private String investAppId;

	/**
	 * 资方pid，2088开头
	 */
	@ApiField("invest_id")
	private String investId;

	/**
	 * 交易组件的业务订单Id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 分账计划信息
	 */
	@ApiListField("royalty_publish_detail")
	@ApiField("rent_royalty_publish_detail_request")
	private List<RentRoyaltyPublishDetailRequest> royaltyPublishDetail;

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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<RentRoyaltyPublishDetailRequest> getRoyaltyPublishDetail() {
		return this.royaltyPublishDetail;
	}
	public void setRoyaltyPublishDetail(List<RentRoyaltyPublishDetailRequest> royaltyPublishDetail) {
		this.royaltyPublishDetail = royaltyPublishDetail;
	}

}
