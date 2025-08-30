package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定损宝业务定损单张图片信息
 *
 * @author auto create
 * @since 1.0, 2020-05-09 11:22:35
 */
public class DsbImageInfo extends AlipayObject {

	private static final long serialVersionUID = 8115693786979746332L;

	/**
	 * 定损图片的afts id
	 */
	@ApiField("afts_id")
	private String aftsId;

	/**
	 * 图片名称
	 */
	@ApiField("image_name")
	private String imageName;

	/**
	 * 拍摄时间
	 */
	@ApiField("shoot_time")
	private String shootTime;

	public String getAftsId() {
		return this.aftsId;
	}
	public void setAftsId(String aftsId) {
		this.aftsId = aftsId;
	}

	public String getImageName() {
		return this.imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getShootTime() {
		return this.shootTime;
	}
	public void setShootTime(String shootTime) {
		this.shootTime = shootTime;
	}

}
