package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意查询条件
 *
 * @author auto create
 * @since 1.0, 2023-05-18 11:46:19
 */
public class DspCreativeQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 5241793731742633423L;

	/**
	 * 创意id
	 */
	@ApiField("creative_id")
	private String creativeId;

	/**
	 * 模版id，和样式关联
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(String creativeId) {
		this.creativeId = creativeId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
