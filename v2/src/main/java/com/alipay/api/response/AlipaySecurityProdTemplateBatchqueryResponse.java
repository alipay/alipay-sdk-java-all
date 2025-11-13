package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:52:06
 */
public class AlipaySecurityProdTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2868971994119824594L;

	/** 
	 * 模版对象列表
	 */
	@ApiListField("template_dto_list")
	@ApiField("template_d_t_o")
	private List<TemplateDTO> templateDtoList;

	public void setTemplateDtoList(List<TemplateDTO> templateDtoList) {
		this.templateDtoList = templateDtoList;
	}
	public List<TemplateDTO> getTemplateDtoList( ) {
		return this.templateDtoList;
	}

}
