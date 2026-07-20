package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询渠道的抽佣分成比例的请求模型
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:06:51
 */
public class ChannelRateQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 6641169586596658934L;

	/**
	 * 账期，格式yyyy-MM
	 */
	@ApiField("bill_period")
	private String billPeriod;

	/**
	 * 渠道code，可使用anttech.oceanbase.channel.list.query接口查询多有的渠道code
	 */
	@ApiField("sell_channel_code")
	private String sellChannelCode;

	public String getBillPeriod() {
		return this.billPeriod;
	}
	public void setBillPeriod(String billPeriod) {
		this.billPeriod = billPeriod;
	}

	public String getSellChannelCode() {
		return this.sellChannelCode;
	}
	public void setSellChannelCode(String sellChannelCode) {
		this.sellChannelCode = sellChannelCode;
	}

}
