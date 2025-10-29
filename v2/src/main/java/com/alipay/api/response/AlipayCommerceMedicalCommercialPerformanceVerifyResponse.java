package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.performance.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-25 16:17:36
 */
public class AlipayCommerceMedicalCommercialPerformanceVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3819752194256811197L;

	/** 
	 * biz_order_id用于标识支付宝侧唯一业务单的id，在商户核销用户商品时返回给商户。
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/** 
	 * out_biz_no为外部唯一业务号，在用户核销商品时外部机构生成并调用核销接口，该字段用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * out_product_id为商户侧的商品id，用户商户侧唯一标记一个商户商品id。
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/** 
	 * verify_result表示核销状态，返回当前商品核销成功（SUCCESS）还是失败（FAIL）
	 */
	@ApiField("verify_result")
	private String verifyResult;

	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}
	public String getBizOrderId( ) {
		return this.bizOrderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}
	public String getOutProductId( ) {
		return this.outProductId;
	}

	public void setVerifyResult(String verifyResult) {
		this.verifyResult = verifyResult;
	}
	public String getVerifyResult( ) {
		return this.verifyResult;
	}

}
