package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量充值信息
 *
 * @author auto create
 * @since 1.0, 2020-06-12 17:11:36
 */
public class NetFlowDeviceOfferInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 5153174129448991288L;

	/**
	 * 物联网卡卡状态
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 流量到期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 流量充值记录信息
	 */
	@ApiField("net_flow_offer_info_list")
	private NetFlowOfferInfo netFlowOfferInfoList;

	/**
	 * 充值金额描述
	 */
	@ApiField("offer_amount")
	private String offerAmount;

	/**
	 * 充值商品地址
	 */
	@ApiField("offer_url")
	private String offerUrl;

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public NetFlowOfferInfo getNetFlowOfferInfoList() {
		return this.netFlowOfferInfoList;
	}
	public void setNetFlowOfferInfoList(NetFlowOfferInfo netFlowOfferInfoList) {
		this.netFlowOfferInfoList = netFlowOfferInfoList;
	}

	public String getOfferAmount() {
		return this.offerAmount;
	}
	public void setOfferAmount(String offerAmount) {
		this.offerAmount = offerAmount;
	}

	public String getOfferUrl() {
		return this.offerUrl;
	}
	public void setOfferUrl(String offerUrl) {
		this.offerUrl = offerUrl;
	}

}
