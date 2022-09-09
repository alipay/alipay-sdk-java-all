package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.agentcreate.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-27 16:13:25
 */
public class AlipayOpenPublicLifeAgentcreateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3555614365799295165L;

	/** 
	 * 只有审核通过，且商户在支付宝发送的授权邮件中确认授权，此时生活号才会正式创建，查询才会返回该值
	 */
	@ApiField("life_app_id")
	private String lifeAppId;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 支付宝商户入驻申请单状态，申请单状态包括：暂存、审核中、待商户确认、成功、失败。
说明：暂存是审核前的中间状态，如出现暂存状态请再次提交代创建生活号申请。
	 */
	@ApiField("order_status_biz_desc")
	private String orderStatusBizDesc;

	/** 
	 * 由开发者创建的外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 只有审核失败才会返回该值
	 */
	@ApiField("refused_reason")
	private String refusedReason;

	public void setLifeAppId(String lifeAppId) {
		this.lifeAppId = lifeAppId;
	}
	public String getLifeAppId( ) {
		return this.lifeAppId;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setOrderStatusBizDesc(String orderStatusBizDesc) {
		this.orderStatusBizDesc = orderStatusBizDesc;
	}
	public String getOrderStatusBizDesc( ) {
		return this.orderStatusBizDesc;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRefusedReason(String refusedReason) {
		this.refusedReason = refusedReason;
	}
	public String getRefusedReason( ) {
		return this.refusedReason;
	}

}
