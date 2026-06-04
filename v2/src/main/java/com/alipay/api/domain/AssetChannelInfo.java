package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益渠道信息
 *
 * @author auto create
 * @since 1.0, 2026-05-15 20:02:48
 */
public class AssetChannelInfo extends AlipayObject {

	private static final long serialVersionUID = 7359375256356653645L;

	/**
	 * 资产类型编码
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 卡类型：DC借记卡，CC贷记卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 银行卡所属的银行渠道,格式为:机构ID^渠道码,例如:ICBC^BIG_AMOUNT_CREDIT_CARTOON，花呗 INST_ALIPAY^PCREDIT_PAY)
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 渠道标识
	 */
	@ApiField("channel_type_code")
	private String channelTypeCode;

	/**
	 * 中国农业银行
	 */
	@ApiField("inst_id")
	private String instId;

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelTypeCode() {
		return this.channelTypeCode;
	}
	public void setChannelTypeCode(String channelTypeCode) {
		this.channelTypeCode = channelTypeCode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
