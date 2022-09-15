package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单笔物业费交易关联账单详情
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:32:18
 */
public class AlipayEcoCplifePayResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7545789615984749354L;

	/**
	 * 查询令牌，部分模式下用户缴物业费成功后由支付宝通过异步通知给到开发者系统，和trade_no二者传其一即可。
	 */
	@ApiField("query_token")
	private String queryToken;

	/**
	 * 用户完成物业缴费后由支付宝异步通知的支付宝交易号，和查询token参数二者传其一即可。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getQueryToken() {
		return this.queryToken;
	}
	public void setQueryToken(String queryToken) {
		this.queryToken = queryToken;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
