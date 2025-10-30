package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.render.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 10:35:56
 */
public class AlipayFundTransRenderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3721665455388211827L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 跳转的编码
	 */
	@ApiField("initialize_code")
	private String initializeCode;

	/** 
	 * 跳转的编码类型
	 */
	@ApiField("initialize_code_type")
	private String initializeCodeType;

	/** 
	 * 指定的资金订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setInitializeCode(String initializeCode) {
		this.initializeCode = initializeCode;
	}
	public String getInitializeCode( ) {
		return this.initializeCode;
	}

	public void setInitializeCodeType(String initializeCodeType) {
		this.initializeCodeType = initializeCodeType;
	}
	public String getInitializeCodeType( ) {
		return this.initializeCodeType;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
