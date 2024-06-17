package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸核身结果查询
 *
 * @author auto create
 * @since 1.0, 2024-05-21 11:34:02
 */
public class DatadigitalFincloudGeneralsaasFaceVerificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1217197965778944198L;

	/**
	 * 填入人脸核身初始化阶段获取到的certify_id
	 */
	@ApiField("certify_id")
	private String certifyId;

	/**
	 * 是否需要返回活体结果图片，needAlivePhoto：Y_O （原始图片）、Y_M（虚化，背景马赛克）、N（不返图），默认为N
	 */
	@ApiField("need_alive_photo")
	private String needAlivePhoto;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

	public String getNeedAlivePhoto() {
		return this.needAlivePhoto;
	}
	public void setNeedAlivePhoto(String needAlivePhoto) {
		this.needAlivePhoto = needAlivePhoto;
	}

}
