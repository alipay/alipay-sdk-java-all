package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FormTemplateRelationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.formtemplate.relations.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 21:11:40
 */
public class DatadigitalFincloudFinsaasFormtemplateRelationsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6366236256486882892L;

	/** 
	 * form_template_relations + 关联关系查询 + 数据库。
	 */
	@ApiListField("form_template_relations")
	@ApiField("form_template_relation_d_t_o")
	private List<FormTemplateRelationDTO> formTemplateRelations;

	/** 
	 * total + 关联关系查询 + 数据库
	 */
	@ApiField("total")
	private Long total;

	public void setFormTemplateRelations(List<FormTemplateRelationDTO> formTemplateRelations) {
		this.formTemplateRelations = formTemplateRelations;
	}
	public List<FormTemplateRelationDTO> getFormTemplateRelations( ) {
		return this.formTemplateRelations;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
