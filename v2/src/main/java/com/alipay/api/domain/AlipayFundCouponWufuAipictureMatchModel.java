package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ai年画匹配性判定
 *
 * @author auto create
 * @since 1.0, 2023-01-05 16:11:50
 */
public class AlipayFundCouponWufuAipictureMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4264132694759774954L;

	/**
	 * 图片ID
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 蚂蚁开放ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
