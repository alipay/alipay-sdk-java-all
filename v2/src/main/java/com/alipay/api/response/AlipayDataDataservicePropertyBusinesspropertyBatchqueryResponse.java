package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessPropertyDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.property.businessproperty.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:37:45
 */
public class AlipayDataDataservicePropertyBusinesspropertyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7151414486462483468L;

	/** 
	 * 业务画像标签元信息列表
	 */
	@ApiListField("business_propertys")
	@ApiField("business_property_d_t_o")
	private List<BusinessPropertyDTO> businessPropertys;

	public void setBusinessPropertys(List<BusinessPropertyDTO> businessPropertys) {
		this.businessPropertys = businessPropertys;
	}
	public List<BusinessPropertyDTO> getBusinessPropertys( ) {
		return this.businessPropertys;
	}

}
