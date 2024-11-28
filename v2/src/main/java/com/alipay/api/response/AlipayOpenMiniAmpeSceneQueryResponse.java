package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmpeSceneResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 17:42:03
 */
public class AlipayOpenMiniAmpeSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3184372455729145216L;

	/** 
	 * 场景信息列表
	 */
	@ApiListField("scene_info_list")
	@ApiField("ampe_scene_response")
	private List<AmpeSceneResponse> sceneInfoList;

	public void setSceneInfoList(List<AmpeSceneResponse> sceneInfoList) {
		this.sceneInfoList = sceneInfoList;
	}
	public List<AmpeSceneResponse> getSceneInfoList( ) {
		return this.sceneInfoList;
	}

}
