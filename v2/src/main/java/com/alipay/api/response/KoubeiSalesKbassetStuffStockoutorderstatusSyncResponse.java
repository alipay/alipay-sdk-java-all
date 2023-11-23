package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.stockoutorderstatus.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:14:13
 */
public class KoubeiSalesKbassetStuffStockoutorderstatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2379336575656393315L;

	/** 
	 * erp单号
	 */
	@ApiField("erp_order")
	private String erpOrder;

	/** 
	 * 报错码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 报错描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/** 
	 * 调用结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setErpOrder(String erpOrder) {
		this.erpOrder = erpOrder;
	}
	public String getErpOrder( ) {
		return this.erpOrder;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getErrorDesc( ) {
		return this.errorDesc;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
