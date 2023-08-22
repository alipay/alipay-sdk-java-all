package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MpcSceneQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 14:36:58
 */
public class TechriskInnovateMpcpromoSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6592448774792639876L;

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
