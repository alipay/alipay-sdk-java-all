package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.property.businessproperty.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:30:36
 */
public class AlipayDataDataservicePropertyBusinesspropertyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4364944542622247321L;

	/** 
	 * 业务画像标签id
	 */
	@ApiField("business_property_id")
	private String businessPropertyId;

	public void setBusinessPropertyId(String businessPropertyId) {
		this.businessPropertyId = businessPropertyId;
	}
	public String getBusinessPropertyId( ) {
		return this.businessPropertyId;
	}

}
