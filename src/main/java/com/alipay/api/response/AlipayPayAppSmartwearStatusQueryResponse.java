package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.smartwear.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-27 10:30:22
 */
public class AlipayPayAppSmartwearStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3561857724863344491L;

	/** 
	 * 设备型号
	 */
	@ApiField("device_model")
	private String deviceModel;

	/** 
	 * 支持的产品类型
	 */
	@ApiField("product_type")
	private String productType;

	/** 
	 * 使用的安全方案
	 */
	@ApiField("security_solution")
	private String securitySolution;

	/** 
	 * 该设备的状态
	 */
	@ApiField("status")
	private String status;

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}
	public String getDeviceModel( ) {
		return this.deviceModel;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductType( ) {
		return this.productType;
	}

	public void setSecuritySolution(String securitySolution) {
		this.securitySolution = securitySolution;
	}
	public String getSecuritySolution( ) {
		return this.securitySolution;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
