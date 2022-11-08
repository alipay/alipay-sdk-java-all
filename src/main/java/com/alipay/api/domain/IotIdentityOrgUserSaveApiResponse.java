package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回结果
 *
 * @author auto create
 * @since 1.0, 2022-03-16 20:09:34
 */
public class IotIdentityOrgUserSaveApiResponse extends AlipayObject {

	private static final long serialVersionUID = 2767895515599118638L;

	/**
	 * 人脸id
	 */
	@ApiField("face_id")
	private String faceId;

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

}
