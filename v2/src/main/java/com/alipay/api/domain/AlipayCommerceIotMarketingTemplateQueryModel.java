package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商模版查询接口
 *
 * @author auto create
 * @since 1.0, 2026-03-23 15:42:17
 */
public class AlipayCommerceIotMarketingTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4148525743376939786L;

	/**
	 * 模版id集合，用于查询模版信息
	 */
	@ApiListField("template_ids")
	@ApiField("string")
	private List<String> templateIds;

	public List<String> getTemplateIds() {
		return this.templateIds;
	}
	public void setTemplateIds(List<String> templateIds) {
		this.templateIds = templateIds;
	}

}
