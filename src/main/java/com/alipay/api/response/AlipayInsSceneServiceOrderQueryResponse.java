package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.service.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-28 10:06:17
 */
public class AlipayInsSceneServiceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1389831911335678419L;

	/** 
	 * 交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 服务止期
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/** 
	 * 服务起期
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}
	public String getEffectEndTime( ) {
		return this.effectEndTime;
	}

	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}
	public Date getEffectStartTime( ) {
		return this.effectStartTime;
	}

}
