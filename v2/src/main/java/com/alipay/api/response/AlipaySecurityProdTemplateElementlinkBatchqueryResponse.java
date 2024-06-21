package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateElementLinkDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.elementlink.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:52:04
 */
public class AlipaySecurityProdTemplateElementlinkBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1897941571966957397L;

	/** 
	 * 元素列表
	 */
	@ApiListField("element_link_dto_list")
	@ApiField("template_element_link_d_t_o")
	private List<TemplateElementLinkDTO> elementLinkDtoList;

	public void setElementLinkDtoList(List<TemplateElementLinkDTO> elementLinkDtoList) {
		this.elementLinkDtoList = elementLinkDtoList;
	}
	public List<TemplateElementLinkDTO> getElementLinkDtoList( ) {
		return this.elementLinkDtoList;
	}

}
