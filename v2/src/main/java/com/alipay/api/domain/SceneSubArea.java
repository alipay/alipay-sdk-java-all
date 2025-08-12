package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景子区域
 *
 * @author auto create
 * @since 1.0, 2023-07-25 17:45:36
 */
public class SceneSubArea extends AlipayObject {

	private static final long serialVersionUID = 4253894955359328376L;

	/**
	 * 区域id
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 区域名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 该子区域内部的推荐点位id
	 */
	@ApiField("recommend_spot_id")
	private String recommendSpotId;

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRecommendSpotId() {
		return this.recommendSpotId;
	}
	public void setRecommendSpotId(String recommendSpotId) {
		this.recommendSpotId = recommendSpotId;
	}

}
