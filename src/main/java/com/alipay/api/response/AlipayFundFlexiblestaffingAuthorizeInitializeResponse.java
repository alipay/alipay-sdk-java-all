package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.authorize.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-09 14:06:39
 */
public class AlipayFundFlexiblestaffingAuthorizeInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1414143319885333296L;

	/** 
	 * 灵工授权场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 授权编码值，根据输入的code_type决定具体内容，比如code_type为SHORT_URL时，返回https短链
	 */
	@ApiField("initialize_code")
	private String initializeCode;

	/** 
	 * 授权编码类型，有限枚举：1. SHORT_URL
	 */
	@ApiField("initialize_code_type")
	private String initializeCodeType;

	/** 
	 * 外部业务号，和接口输入的外部单号保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 灵工授权产品码
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

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
