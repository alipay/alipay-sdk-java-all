package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MpcSceneQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 18:45:45
 */
public class TechriskInnovateMpcpromoSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1315658428911587473L;

	/** 
	 * 场景信息
	 */
	@ApiField("scene_list")
	private MpcSceneQueryInfo sceneList;

	public void setSceneList(MpcSceneQueryInfo sceneList) {
		this.sceneList = sceneList;
	}
	public MpcSceneQueryInfo getSceneList( ) {
		return this.sceneList;
	}

}
