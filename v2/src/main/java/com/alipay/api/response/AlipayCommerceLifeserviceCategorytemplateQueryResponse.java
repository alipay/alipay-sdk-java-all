package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AxfItemAttrTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.categorytemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 15:22:42
 */
public class AlipayCommerceLifeserviceCategorytemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6583772169535694568L;

	/** 
	 * null
	 */
	@ApiListField("attr_template")
	@ApiField("axf_item_attr_template")
	private List<AxfItemAttrTemplate> attrTemplate;

	public void setAttrTemplate(List<AxfItemAttrTemplate> attrTemplate) {
		this.attrTemplate = attrTemplate;
	}
	public List<AxfItemAttrTemplate> getAttrTemplate( ) {
		return this.attrTemplate;
	}

}
