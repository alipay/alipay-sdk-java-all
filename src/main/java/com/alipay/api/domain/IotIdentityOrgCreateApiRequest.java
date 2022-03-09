package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构人员添加入参
 *
 * @author auto create
 * @since 1.0, 2022-03-02 10:19:27
 */
public class IotIdentityOrgCreateApiRequest extends AlipayObject {

	private static final long serialVersionUID = 3289165751989141194L;

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
