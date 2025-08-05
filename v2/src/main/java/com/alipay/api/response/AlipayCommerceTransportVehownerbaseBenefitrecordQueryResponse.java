package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BenefitRecordQueryResponseComponents;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehownerbase.benefitrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 16:37:06
 */
public class AlipayCommerceTransportVehownerbaseBenefitrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8566341984288532497L;

	/** 
	 * 权益流水查询组件
	 */
	@ApiField("components")
	private BenefitRecordQueryResponseComponents components;

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

	public void setComponents(BenefitRecordQueryResponseComponents components) {
		this.components = components;
	}
	public BenefitRecordQueryResponseComponents getComponents( ) {
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
