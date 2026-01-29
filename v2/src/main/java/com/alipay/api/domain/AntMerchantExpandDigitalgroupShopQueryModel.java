package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化门店渠道门店查询
 *
 * @author auto create
 * @since 1.0, 2025-10-10 14:19:11
 */
public class AntMerchantExpandDigitalgroupShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5868643713899966181L;

	/**
	 * AMAP("AMAP", "AMAP", "高德", "高德")
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 高德渠道门店，和数字化门店ID必须要传1个
	 */
	@ApiField("channel_shop_id")
	private String channelShopId;

	/**
	 * 数字话门店ID，和渠道门店2个必须要填写1个，以数字化门店为主查
	 */
	@ApiField("digital_poi_id")
	private String digitalPoiId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelShopId() {
		return this.channelShopId;
	}
	public void setChannelShopId(String channelShopId) {
		this.channelShopId = channelShopId;
	}

	public String getDigitalPoiId() {
		return this.digitalPoiId;
	}
	public void setDigitalPoiId(String digitalPoiId) {
		this.digitalPoiId = digitalPoiId;
	}

}
