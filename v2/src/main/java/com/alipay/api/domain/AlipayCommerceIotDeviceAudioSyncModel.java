package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot设备到账语音触达接口
 *
 * @author auto create
 * @since 1.0, 2021-01-13 19:17:33
 */
public class AlipayCommerceIotDeviceAudioSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3118852612119189258L;

	/**
	 * 设备的唯一标识,设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 交易流水号. 在以下情况下必填: 1. 如果需要调用alipay.commerce.iot.device.broadcast.query接口,查询设备是否播报,则trade_id必填; 2. 如果是交易播报则交易流水号必填,也就是说voice_content里面包含money参数的,则trade_id必填
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 仅在使用内置到账语音进行播报的时候需要传入. 表示交易类型. 可选值: 
ALIPAY_TRADE 支付宝交易
WX_TRADE 微信交易
OTHER 其他交易途径
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 播报内容，由str，money和audio组成. 如：
audio:S4668BUGQbSOwwmg2GjmbQAAACMAAQED => 欢迎光临
audio:Qf-1zBDbTB-mq2U4FzoGiwAAACMAAQED|money:32.5 => 企迈收款32.5元
audio:zKcE111AByT2fz8pLL1zMBE1C234AfmX|str:T001|audio:AQ1e213e1nYYII1MMN2dfPO3466AAAB2 => 扫呗T001桌扫码点餐，请及时处理
money:32.5 => 根据trade_type,使用对应的内置语音播报交易到账
	 */
	@ApiField("voice_content")
	private String voiceContent;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getVoiceContent() {
		return this.voiceContent;
	}
	public void setVoiceContent(String voiceContent) {
		this.voiceContent = voiceContent;
	}

}
