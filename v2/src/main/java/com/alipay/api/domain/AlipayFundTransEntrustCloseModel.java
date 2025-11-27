package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托支付订单关闭接口
 *
 * @author auto create
 * @since 1.0, 2022-04-01 13:44:42
 */
public class AlipayFundTransEntrustCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5662183577588532852L;

	/**
	 * CREDIT_SALE_REPAY
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 该笔委托支付在支付宝系统内部的单据ID（委托支付打款场景必传）
	 */
	@ApiField("entrust_order_id")
	private String entrustOrderId;

	/**
	 * 业务产品码，委托支付传ENTRUSTED_PAYMENT_COLLECTION
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEntrustOrderId() {
		return this.entrustOrderId;
	}
	public void setEntrustOrderId(String entrustOrderId) {
		this.entrustOrderId = entrustOrderId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
