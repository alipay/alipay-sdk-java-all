package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AttributeVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.delivery.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 14:51:51
 */
public class AlipayOpenAppDeliveryTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5699723146134732881L;

	/** 
	 * 属性信息
	 */
	@ApiField("attrs")
	private AttributeVO attrs;

	/** 
	 * 履约类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/** 
	 * 履约模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public void setAttrs(AttributeVO attrs) {
		this.attrs = attrs;
	}
	public AttributeVO getAttrs( ) {
		return this.attrs;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getDeliveryType( ) {
		return this.deliveryType;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
