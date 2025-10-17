package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付渠道信息
 *
 * @author auto create
 * @since 1.0, 2024-04-18 17:01:00
 */
public class PayChannelInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6615525731915974314L;

	/**
	 * 资产id
例：银行卡绑定支付宝id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * ●SINGLE_CHANNEL_MODE（限定渠道类型）
 SPECIFIED_SORT_CHANNEL_MODE（优先渠道类型）
	 */
	@ApiField("channel_mode")
	private String channelMode;

	/**
	 * 机构id
● CMB
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 支付渠道借贷类型
● DC：借记卡
● CC：贷记卡
	 */
	@ApiField("pay_channel_debit_credit_type")
	private String payChannelDebitCreditType;

	/**
	 * 支付工具类型
● BANKCARD - 银行卡
	 */
	@ApiField("pay_tool_type")
	private String payToolType;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getChannelMode() {
		return this.channelMode;
	}
	public void setChannelMode(String channelMode) {
		this.channelMode = channelMode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getPayChannelDebitCreditType() {
		return this.payChannelDebitCreditType;
	}
	public void setPayChannelDebitCreditType(String payChannelDebitCreditType) {
		this.payChannelDebitCreditType = payChannelDebitCreditType;
	}

	public String getPayToolType() {
		return this.payToolType;
	}
	public void setPayToolType(String payToolType) {
		this.payToolType = payToolType;
	}

}
