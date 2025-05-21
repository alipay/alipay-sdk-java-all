package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamecenter.payment.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-01 16:42:26
 */
public class AlipayUserGamecenterPaymentQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 1772977189861628183L;

	/** 
	 * 开发者在下单的时候传入的cp_extra字段
	 */
	@ApiField("cp_extra")
	private String cpExtra;

	/** 
	 * CP开发者查询到这几种状态的处理逻辑:
success: 订单成功, 正常推进道具发放流程
closed: 订单已关闭, 推进开发者本地订单状态等流程refunded: 订单已退款, 推进开发者本地订单状态等流程
processing: 中间状态, 需要开发者持续轮询, 直到获得明确状态
	 */
	@ApiField("status")
	private String status;

	public void setCpExtra(String cpExtra) {
		this.cpExtra = cpExtra;
	}
	public String getCpExtra( ) {
		return this.cpExtra;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
