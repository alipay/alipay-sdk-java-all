package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-06 11:17:20
 */
public class AlipayOpenSpNordermaterialsapplyOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7172187931769187765L;

	/** 
	 * 申请单ID，后续接口需要依赖该单号
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 物料模版归属的业务场景编码，同时也是申请单的所属
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

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

	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}
	public String getBizSceneCode( ) {
		return this.bizSceneCode;
	}

	public void setMaterialsTemplateType(String materialsTemplateType) {
		this.materialsTemplateType = materialsTemplateType;
	}
	public String getMaterialsTemplateType( ) {
		return this.materialsTemplateType;
	}

}
