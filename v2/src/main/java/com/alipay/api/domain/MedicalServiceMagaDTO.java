package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗服务Maga投放DTO
 *
 * @author auto create
 * @since 1.0, 2024-09-30 10:13:03
 */
public class MedicalServiceMagaDTO extends AlipayObject {

	private static final long serialVersionUID = 2767243457892343175L;

	/**
	 * 数据区块列表
	 */
	@ApiListField("template_list")
	@ApiField("medical_service_maga_template_d_t_o")
	private List<MedicalServiceMagaTemplateDTO> templateList;

	public List<MedicalServiceMagaTemplateDTO> getTemplateList() {
		return this.templateList;
	}
	public void setTemplateList(List<MedicalServiceMagaTemplateDTO> templateList) {
		this.templateList = templateList;
	}

}
