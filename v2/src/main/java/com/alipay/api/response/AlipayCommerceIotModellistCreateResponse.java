package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.modellist.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:12
 */
public class AlipayCommerceIotModellistCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6366983391772157117L;

	/** 
	 * 重复的型号id列表，当所请求创建的型号已经存在时，则将已存在的型号id列表通过该字段返回
	 */
	@ApiListField("duplicated_model_ids")
	@ApiField("string")
	private List<String> duplicatedModelIds;

	public void setDuplicatedModelIds(List<String> duplicatedModelIds) {
		this.duplicatedModelIds = duplicatedModelIds;
	}
	public List<String> getDuplicatedModelIds( ) {
		return this.duplicatedModelIds;
	}

}
