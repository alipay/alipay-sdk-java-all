package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenAppServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7349787477871155829L;

	/** 
	 * 驳回理由
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 服务id
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 服务描述xml格式
	 */
	@ApiField("service_xml")
	private String serviceXml;

	/** 
	 * 服务状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 服务模板类型
	 */
	@ApiField("template_type")
	private String templateType;

	/** 
	 * 服务履约类型
	 */
	@ApiField("user_service_delivery_type")
	private String userServiceDeliveryType;

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

	public void setServiceXml(String serviceXml) {
		this.serviceXml = serviceXml;
	}
	public String getServiceXml( ) {
		return this.serviceXml;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getTemplateType( ) {
		return this.templateType;
	}

	public void setUserServiceDeliveryType(String userServiceDeliveryType) {
		this.userServiceDeliveryType = userServiceDeliveryType;
	}
	public String getUserServiceDeliveryType( ) {
		return this.userServiceDeliveryType;
	}

}
