package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询场景下内容列表信息
 *
 * @author auto create
 * @since 1.0, 2018-09-13 20:49:08
 */
public class AlipaySocialBaseSceneContentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3458849598872871252L;

	/**
	 * 城市id
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 内容中台提供的运营后台配置场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 返回文章列表的个数，目前最多10条
	 */
	@ApiField("top_size")
	private Long topSize;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public Long getTopSize() {
		return this.topSize;
	}
	public void setTopSize(Long topSize) {
		this.topSize = topSize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
