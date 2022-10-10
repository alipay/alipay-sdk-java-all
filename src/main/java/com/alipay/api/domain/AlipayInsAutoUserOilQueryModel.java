package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户爱攒油信息
 *
 * @author auto create
 * @since 1.0, 2019-07-04 17:22:32
 */
public class AlipayInsAutoUserOilQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6794345893715238476L;

	/**
	 * 车险开发分配，source+scene_type决定了返回的内容
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
