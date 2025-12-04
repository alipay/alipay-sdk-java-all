package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.solutionprod.merchantupgrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 21:42:42
 */
public class AlipayTradeSolutionprodMerchantupgradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8134638892262977711L;

	/** 
	 * 升级操作时的支付宝登录号（脱敏）
	 */
	@ApiField("binding_logon_id")
	private String bindingLogonId;

	/** 
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 个人用户升级申请单号，个人用户升级申请后由支付宝生成返回
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部请求流水号，调用alipay.trade.solutionprod.merchantupgrade.apply接口时由商户传入
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 升级的smid
	 */
	@ApiField("smid")
	private String smid;

	/** 
	 * INIT:已申请用户还未确认 、ROCESSING：升级中 、SUCCESS:升级成功 、RETYR:当前升级失败，根据错误原因进行排查，解决后可用原单进行重试
	 */
	@ApiField("status")
	private String status;

	public void setBindingLogonId(String bindingLogonId) {
		this.bindingLogonId = bindingLogonId;
	}
	public String getBindingLogonId( ) {
		return this.bindingLogonId;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
