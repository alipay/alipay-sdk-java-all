package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约合同模板查询详情服务
 *
 * @author auto create
 * @since 1.0, 2023-06-19 15:49:25
 */
public class AlipayFinancialnetAuthEcsignTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4477678567475548321L;

	/**
	 * 合同模板ID，如果存在则为唯一值，由系统生成，在保存成功后会返回该值。
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
