package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商品推荐的个性化结果
 *
 * @author auto create
 * @since 1.0, 2023-03-23 16:52:02
 */
public class TechriskInnovateMpcpromoItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4881989564684858587L;

	/**
	 * 当前appid下的推荐场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 商户定义的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
