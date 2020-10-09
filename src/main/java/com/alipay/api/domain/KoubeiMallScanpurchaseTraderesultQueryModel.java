package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易结果页查询
 *
 * @author auto create
 * @since 1.0, 2019-01-23 20:29:25
 */
public class KoubeiMallScanpurchaseTraderesultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2747484113594629879L;

	/**
	 * 说明渠道，口碑app为 APP,  口碑tab 为TAB. 默认是TAB
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 买家用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
