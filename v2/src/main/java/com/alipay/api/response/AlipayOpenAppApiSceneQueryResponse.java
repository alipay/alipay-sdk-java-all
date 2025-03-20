package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AuthFieldSceneDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.api.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-14 10:47:09
 */
public class AlipayOpenAppApiSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7542493569198248748L;

	/** 
	 * 接口信息字段应用场景
	 */
	@ApiListField("auth_field_scene")
	@ApiField("auth_field_scene_d_t_o")
	private List<AuthFieldSceneDTO> authFieldScene;

	public void setAuthFieldScene(List<AuthFieldSceneDTO> authFieldScene) {
		this.authFieldScene = authFieldScene;
	}
	public List<AuthFieldSceneDTO> getAuthFieldScene( ) {
		return this.authFieldScene;
	}

}
