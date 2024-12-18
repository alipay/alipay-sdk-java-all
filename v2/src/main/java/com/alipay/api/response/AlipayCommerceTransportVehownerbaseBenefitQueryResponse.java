package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BenefitQueryResponseComponents;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehownerbase.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 10:07:10
 */
public class AlipayCommerceTransportVehownerbaseBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7873536884667189571L;

	/** 
	 * 权益召回组件集
	 */
	@ApiField("components")
	private BenefitQueryResponseComponents components;

	/** 
	 * 当前日期
	 */
	@ApiField("current_date")
	private Date currentDate;

	/** 
	 * 方案标识
	 */
	@ApiField("operation_param_identify")
	private String operationParamIdentify;

	public void setComponents(BenefitQueryResponseComponents components) {
		this.components = components;
	}
	public BenefitQueryResponseComponents getComponents( ) {
		return this.components;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	public Date getCurrentDate( ) {
		return this.currentDate;
	}

	public void setOperationParamIdentify(String operationParamIdentify) {
		this.operationParamIdentify = operationParamIdentify;
	}
	public String getOperationParamIdentify( ) {
		return this.operationParamIdentify;
	}

}
