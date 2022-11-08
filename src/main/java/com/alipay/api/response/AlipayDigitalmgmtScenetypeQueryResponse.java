package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SceneTypeListResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.scenetype.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-30 14:41:50
 */
public class AlipayDigitalmgmtScenetypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6172651829838992277L;

	/** 
	 * 场景类型信息列表
	 */
	@ApiField("scene_type_list_result")
	private SceneTypeListResult sceneTypeListResult;

	public void setSceneTypeListResult(SceneTypeListResult sceneTypeListResult) {
		this.sceneTypeListResult = sceneTypeListResult;
	}
	public SceneTypeListResult getSceneTypeListResult( ) {
		return this.sceneTypeListResult;
	}

}
