package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户级抽佣分成比例请求模型
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:06:59
 */
public class ChannelUserRateQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 3674997698612357461L;

	/**
	 * 账期，格式yyyy-MM
	 */
	@ApiField("bill_period")
	private String billPeriod;

	/**
	 * 用户uid
	 */
	@ApiField("passport_id")
	private String passportId;

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

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getSellChannelCode() {
		return this.sellChannelCode;
	}
	public void setSellChannelCode(String sellChannelCode) {
		this.sellChannelCode = sellChannelCode;
	}

}
