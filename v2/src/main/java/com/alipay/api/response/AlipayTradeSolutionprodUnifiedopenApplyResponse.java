package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.solutionprod.unifiedopen.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-05 19:11:43
 */
public class AlipayTradeSolutionprodUnifiedopenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6283483632178442166L;

	/** 
	 * 用于直接跳转至用户聚合开通页面
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/** 
	 * 聚合开通申请单号
	 */
	@ApiField("uniopen_order_id")
	private String uniopenOrderId;

	/** 
	 * 当状态为PROCESSING/SUCCESS/FAIL时可通过查询接口alipay.merchant.ctoc.unifiedopen.query获取最新开通子项开通信息。

INIT：获取返回的jump_url跳转至支付宝端进行用户确认、
PROCESSING：已存聚合申请，正在开通中、SUCCESS：已存聚合申请开通成功，FAIL:开通失败（包括部分失败）
	 */
	@ApiField("uniopen_status")
	private String uniopenStatus;

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

	public void setUniopenOrderId(String uniopenOrderId) {
		this.uniopenOrderId = uniopenOrderId;
	}
	public String getUniopenOrderId( ) {
		return this.uniopenOrderId;
	}

	public void setUniopenStatus(String uniopenStatus) {
		this.uniopenStatus = uniopenStatus;
	}
	public String getUniopenStatus( ) {
		return this.uniopenStatus;
	}

}
