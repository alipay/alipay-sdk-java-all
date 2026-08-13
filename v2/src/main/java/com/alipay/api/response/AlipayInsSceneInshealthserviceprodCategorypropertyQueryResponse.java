package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExternalCateProperty;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inshealthserviceprod.categoryproperty.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:44
 */
public class AlipayInsSceneInshealthserviceprodCategorypropertyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5823195942649431246L;

	/** 
	 * 属性列表
	 */
	@ApiListField("properties")
	@ApiField("external_cate_property")
	private List<ExternalCateProperty> properties;

	public void setProperties(List<ExternalCateProperty> properties) {
		this.properties = properties;
	}
	public List<ExternalCateProperty> getProperties( ) {
		return this.properties;
	}

}
