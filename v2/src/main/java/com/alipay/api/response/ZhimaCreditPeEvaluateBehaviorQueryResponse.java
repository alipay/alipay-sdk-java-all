package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.evaluate.behavior.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 14:42:51
 */
public class ZhimaCreditPeEvaluateBehaviorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3869359321863187155L;

	/** 
	 * 用户订单拉起受理台咨询时间
	 */
	@ApiField("evaluate_time")
	private Date evaluateTime;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 信用服务service_id； 芝麻侧通过商户PID生成的一个信用服务的id
	 */
	@ApiField("service_id")
	private String serviceId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}
	public Date getEvaluateTime( ) {
		return this.evaluateTime;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceId( ) {
		return this.serviceId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
