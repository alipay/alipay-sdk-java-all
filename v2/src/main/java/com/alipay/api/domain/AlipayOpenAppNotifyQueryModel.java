package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询开放平台消息通知记录
 *
 * @author auto create
 * @since 1.0, 2021-08-18 17:57:13
 */
public class AlipayOpenAppNotifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4534747447223284791L;

	/**
	 * trade_no+是+查询该交易编号的信息+根据订单信息拿到
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
