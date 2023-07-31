package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用一脸通行用户入库信息
 *
 * @author auto create
 * @since 1.0, 2021-05-13 10:35:06
 */
public class StandardFacePutInfo extends AlipayObject {

	private static final long serialVersionUID = 2644945564678158817L;

	/**
	 * 入库失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 人脸用户ID
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 入库结果，SUCCESS： 入库成功 ; FAIL ：入库失败，可重试; ERROR：  入库失败，不可重试
	 */
	@ApiField("result")
	private String result;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
