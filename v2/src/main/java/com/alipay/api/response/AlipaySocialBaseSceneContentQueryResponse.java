package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneContent;
import com.alipay.api.domain.SceneDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.scene.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseSceneContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8847849248847253331L;

	/** 
	 * 内容中台场景页文章信息
	 */
	@ApiListField("scene_content")
	@ApiField("scene_content")
	private List<SceneContent> sceneContent;

	/** 
	 * 场景详情信息
	 */
	@ApiField("scene_detail")
	private SceneDetail sceneDetail;

	/** 
	 * 更多文章跳转链接
	 */
	@ApiField("scheme")
	private String scheme;

	public void setSceneContent(List<SceneContent> sceneContent) {
		this.sceneContent = sceneContent;
	}
	public List<SceneContent> getSceneContent( ) {
		return this.sceneContent;
	}

	public void setSceneDetail(SceneDetail sceneDetail) {
		this.sceneDetail = sceneDetail;
	}
	public SceneDetail getSceneDetail( ) {
		return this.sceneDetail;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getScheme( ) {
		return this.scheme;
	}

}
