package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销订单修改
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:50
 */
public class AlipayCommerceRentDistorderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5291675492249746898L;

	/**
	 * 分销订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 买家地址修改申请
	 */
	@ApiField("buyer_address_modify_apply_info")
	private DistributionProcessBuyerAddressModifyApplyDTO buyerAddressModifyApplyInfo;

	/**
	 * 渠道买家ID
	 */
	@ApiField("channel_buyer_id")
	private String channelBuyerId;

	/**
	 * 渠道订单号
	 */
	@ApiField("channel_order_id")
	private String channelOrderId;

	/**
	 * 分销渠道
	 */
	@ApiField("distribution_channel")
	private String distributionChannel;

	/**
	 * 修改信息类型
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 价格和租期修改信息
	 */
	@ApiField("price_and_period_info")
	private DistributionOrderPriceAndPeriodDTO priceAndPeriodInfo;

	/**
	 * 订单归还地址
	 */
	@ApiField("return_address_info")
	private DistributionOrderReturnAddressDTO returnAddressInfo;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public DistributionProcessBuyerAddressModifyApplyDTO getBuyerAddressModifyApplyInfo() {
		return this.buyerAddressModifyApplyInfo;
	}
	public void setBuyerAddressModifyApplyInfo(DistributionProcessBuyerAddressModifyApplyDTO buyerAddressModifyApplyInfo) {
		this.buyerAddressModifyApplyInfo = buyerAddressModifyApplyInfo;
	}

	public String getChannelBuyerId() {
		return this.channelBuyerId;
	}
	public void setChannelBuyerId(String channelBuyerId) {
		this.channelBuyerId = channelBuyerId;
	}

	public String getChannelOrderId() {
		return this.channelOrderId;
	}
	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}

	public String getDistributionChannel() {
		return this.distributionChannel;
	}
	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public DistributionOrderPriceAndPeriodDTO getPriceAndPeriodInfo() {
		return this.priceAndPeriodInfo;
	}
	public void setPriceAndPeriodInfo(DistributionOrderPriceAndPeriodDTO priceAndPeriodInfo) {
		this.priceAndPeriodInfo = priceAndPeriodInfo;
	}

	public DistributionOrderReturnAddressDTO getReturnAddressInfo() {
		return this.returnAddressInfo;
	}
	public void setReturnAddressInfo(DistributionOrderReturnAddressDTO returnAddressInfo) {
		this.returnAddressInfo = returnAddressInfo;
	}

}
