package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.box.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-15 19:30:24
 */
public class AlipayOpenSearchBoxModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7192767247764352584L;

	/** 
	 * 搜索直达模块配置id
	 */
	@ApiField("module_id")
	private String moduleId;

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleId( ) {
		return this.moduleId;
	}

}
