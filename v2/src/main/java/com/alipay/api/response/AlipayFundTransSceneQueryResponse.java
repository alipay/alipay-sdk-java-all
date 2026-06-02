package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneApplyRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-13 11:02:45
 */
public class AlipayFundTransSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4211799547824817475L;

	/** 
	 * 场景信息列表
	 */
	@ApiListField("scene_info_list")
	@ApiField("scene_apply_record")
	private List<SceneApplyRecord> sceneInfoList;

	public void setSceneInfoList(List<SceneApplyRecord> sceneInfoList) {
		this.sceneInfoList = sceneInfoList;
	}
	public List<SceneApplyRecord> getSceneInfoList( ) {
		return this.sceneInfoList;
	}

}
