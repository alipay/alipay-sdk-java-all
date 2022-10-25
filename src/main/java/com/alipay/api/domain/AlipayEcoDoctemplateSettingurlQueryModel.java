package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取合同模板设置地址（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-03-28 00:09:58
 */
public class AlipayEcoDoctemplateSettingurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8883188671224162668L;

	/**
	 * 合同模板id。通过<a href ="https://opendocs.alipay.com/apis/api_50/alipay.eco.doc.template.create">创建合同模版</a>（alipay.eco.doc.template.create）接口获取。
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
