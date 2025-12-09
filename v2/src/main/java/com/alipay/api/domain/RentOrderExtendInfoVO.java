package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单拓展信息
 *
 * @author auto create
 * @since 1.0, 2025-12-05 16:29:41
 */
public class RentOrderExtendInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2666222527481873475L;

	/**
	 * 定义参考 <a href="https://opendocs.alipay.com/mini/0dfcde" target="_blank">公域场景标识</a>
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 芝麻租赁频道联营订单标
	 */
	@ApiField("union_rent_tag")
	private String unionRentTag;

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getUnionRentTag() {
		return this.unionRentTag;
	}
	public void setUnionRentTag(String unionRentTag) {
		this.unionRentTag = unionRentTag;
	}

}
