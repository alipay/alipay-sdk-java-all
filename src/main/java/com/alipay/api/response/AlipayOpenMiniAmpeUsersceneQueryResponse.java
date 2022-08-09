package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmpeSceneResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.userscene.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-22 17:41:33
 */
public class AlipayOpenMiniAmpeUsersceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4732971216431792454L;

	/** 
	 * 用户未选择的场景列表
	 */
	@ApiField("disable_scene_info_list")
	private AmpeSceneResponse disableSceneInfoList;

	/** 
	 * 用户已经选择的场景列表
	 */
	@ApiListField("enable_scene_info_list")
	@ApiField("ampe_scene_response")
	private List<AmpeSceneResponse> enableSceneInfoList;

	public void setDisableSceneInfoList(AmpeSceneResponse disableSceneInfoList) {
		this.disableSceneInfoList = disableSceneInfoList;
	}
	public AmpeSceneResponse getDisableSceneInfoList( ) {
		return this.disableSceneInfoList;
	}

	public void setEnableSceneInfoList(List<AmpeSceneResponse> enableSceneInfoList) {
		this.enableSceneInfoList = enableSceneInfoList;
	}
	public List<AmpeSceneResponse> getEnableSceneInfoList( ) {
		return this.enableSceneInfoList;
	}

}
