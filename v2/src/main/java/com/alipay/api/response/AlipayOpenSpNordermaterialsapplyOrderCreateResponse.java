package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-13 11:02:11
 */
public class AlipayOpenSpNordermaterialsapplyOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6528773582351199578L;

	/** 
	 * 申请单ID，后续接口需要依赖该单号
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 申请单使用的物料模版对应的物料类型
	 */
	@ApiField("materials_template_type")
	private String materialsTemplateType;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setMaterialsTemplateType(String materialsTemplateType) {
		this.materialsTemplateType = materialsTemplateType;
	}
	public String getMaterialsTemplateType( ) {
		return this.materialsTemplateType;
	}

}
