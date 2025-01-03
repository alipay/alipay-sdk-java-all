package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BenefitActionResponseComponents;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehownerbase.benefit.take response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 16:37:06
 */
public class AlipayCommerceTransportVehownerbaseBenefitTakeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7658623575972692385L;

	/** 
	 * 权益发放组件集
	 */
	@ApiField("components")
	private BenefitActionResponseComponents components;

	/** 
	 * 当前日期
	 */
	@ApiField("current_date")
	private Date currentDate;

	/** 
	 * 方案标识
	 */
	@ApiField("operation_param_identity")
	private String operationParamIdentity;

	public void setComponents(BenefitActionResponseComponents components) {
		this.components = components;
	}
	public BenefitActionResponseComponents getComponents( ) {
		return this.components;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	public Date getCurrentDate( ) {
		return this.currentDate;
	}

	public void setOperationParamIdentity(String operationParamIdentity) {
		this.operationParamIdentity = operationParamIdentity;
	}
	public String getOperationParamIdentity( ) {
		return this.operationParamIdentity;
	}

}
