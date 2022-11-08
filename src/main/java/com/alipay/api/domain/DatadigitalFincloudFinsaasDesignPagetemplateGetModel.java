package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据id进行设计页面模版查询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:57:33
 */
public class DatadigitalFincloudFinsaasDesignPagetemplateGetModel extends AlipayObject {

	private static final long serialVersionUID = 1831136357126819813L;

	/**
	 * 数据库id
	 */
	@ApiField("template_id")
	private Long templateId;

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
