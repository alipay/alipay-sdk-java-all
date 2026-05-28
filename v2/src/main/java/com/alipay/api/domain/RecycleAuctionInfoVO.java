package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收竞拍单信息
 *
 * @author auto create
 * @since 1.0, 2026-03-27 10:50:56
 */
public class RecycleAuctionInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8169934469737221647L;

	/**
	 * 竞拍出价信息
	 */
	@ApiField("auction_bid_info_list")
	private RecycleAuctionBidInfoVO auctionBidInfoList;

	/**
	 * 中标买家信息
	 */
	@ApiField("auction_buyer_info")
	private RecycleAuctionBuyerInfoVO auctionBuyerInfo;

	/**
	 * 竞拍履约信息
	 */
	@ApiField("auction_delivery_info")
	private RecycleAuctionDeliveryInfoVO auctionDeliveryInfo;

	/**
	 * 中标竞拍商的信息
	 */
	@ApiField("auction_merchant_info")
	private RecycleAuctionMerchantInfoVO auctionMerchantInfo;

	/**
	 * 竞拍中标价格，币种：人民币 单位：元
	 */
	@ApiField("auction_price")
	private String auctionPrice;

	/**
	 * 竞拍状态
	 */
	@ApiField("auction_status")
	private String auctionStatus;

	/**
	 * 分账给履约商的金额，币种：人民币  单位：元
	 */
	@ApiField("delivery_amount")
	private String deliveryAmount;

	/**
	 * 向竞价平台抽佣的金额，币种：人民币  单位：元
	 */
	@ApiField("fee_amount")
	private String feeAmount;

	/**
	 * 结算给用户的金额，币种：人民币  单位：元
	 */
	@ApiField("user_amount")
	private String userAmount;

	public RecycleAuctionBidInfoVO getAuctionBidInfoList() {
		return this.auctionBidInfoList;
	}
	public void setAuctionBidInfoList(RecycleAuctionBidInfoVO auctionBidInfoList) {
		this.auctionBidInfoList = auctionBidInfoList;
	}

	public RecycleAuctionBuyerInfoVO getAuctionBuyerInfo() {
		return this.auctionBuyerInfo;
	}
	public void setAuctionBuyerInfo(RecycleAuctionBuyerInfoVO auctionBuyerInfo) {
		this.auctionBuyerInfo = auctionBuyerInfo;
	}

	public RecycleAuctionDeliveryInfoVO getAuctionDeliveryInfo() {
		return this.auctionDeliveryInfo;
	}
	public void setAuctionDeliveryInfo(RecycleAuctionDeliveryInfoVO auctionDeliveryInfo) {
		this.auctionDeliveryInfo = auctionDeliveryInfo;
	}

	public RecycleAuctionMerchantInfoVO getAuctionMerchantInfo() {
		return this.auctionMerchantInfo;
	}
	public void setAuctionMerchantInfo(RecycleAuctionMerchantInfoVO auctionMerchantInfo) {
		this.auctionMerchantInfo = auctionMerchantInfo;
	}

	public String getAuctionPrice() {
		return this.auctionPrice;
	}
	public void setAuctionPrice(String auctionPrice) {
		this.auctionPrice = auctionPrice;
	}

	public String getAuctionStatus() {
		return this.auctionStatus;
	}
	public void setAuctionStatus(String auctionStatus) {
		this.auctionStatus = auctionStatus;
	}

	public String getDeliveryAmount() {
		return this.deliveryAmount;
	}
	public void setDeliveryAmount(String deliveryAmount) {
		this.deliveryAmount = deliveryAmount;
	}

	public String getFeeAmount() {
		return this.feeAmount;
	}
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getUserAmount() {
		return this.userAmount;
	}
	public void setUserAmount(String userAmount) {
		this.userAmount = userAmount;
	}

}
