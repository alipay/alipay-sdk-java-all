package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销订单发货
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:51
 */
public class AlipayCommerceRentDistorderSendModel extends AlipayObject {

	private static final long serialVersionUID = 6413988263979458189L;

	/**
	 * 分销订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

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
	 * 快递公司编码
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 分销渠道
	 */
	@ApiField("distribution_channel")
	private String distributionChannel;

	/**
	 * 发货人地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/**
	 * 行政区划编码
最小行政单位code，若是地区级别，则为地区级别的id；否则为城市级别的id(long型，6位)
	 */
	@ApiField("sender_district_code")
	private String senderDistrictCode;

	/**
	 * 张三
	 */
	@ApiField("sender_name")
	private String senderName;

	/**
	 * 发货人手机号
	 */
	@ApiField("sender_phone")
	private String senderPhone;

	/**
	 * 快递单号
	 */
	@ApiField("waybill_id")
	private String waybillId;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
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

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getDistributionChannel() {
		return this.distributionChannel;
	}
	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public String getSenderAddress() {
		return this.senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderDistrictCode() {
		return this.senderDistrictCode;
	}
	public void setSenderDistrictCode(String senderDistrictCode) {
		this.senderDistrictCode = senderDistrictCode;
	}

	public String getSenderName() {
		return this.senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderPhone() {
		return this.senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getWaybillId() {
		return this.waybillId;
	}
	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}
