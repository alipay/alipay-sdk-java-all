package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MpcSceneQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-31 16:32:02
 */
public class TechriskInnovateMpcpromoSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6816922335895679542L;

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
