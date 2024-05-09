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
 * @since 1.0, 2024-03-22 16:57:04
 */
public class AlipayOpenAppApiSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3334551172995193475L;

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
