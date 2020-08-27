package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸支付图片上传接口
 *
 * @author auto create
 * @since 1.0, 2017-03-04 12:55:28
 */
public class AlipaySecurityProdFacepayUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8449393453826623833L;

	/**
	 * 用户输入的邀请码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * Base64编码的人脸图片
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getFaceImage() {
		return this.faceImage;
	}
	public void setFaceImage(String faceImage) {
		this.faceImage = faceImage;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
