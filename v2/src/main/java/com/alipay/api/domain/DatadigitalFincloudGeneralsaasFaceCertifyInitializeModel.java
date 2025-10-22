package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸核身服务初始化
 *
 * @author auto create
 * @since 1.0, 2024-08-28 20:14:16
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1352933428873731895L;

	/**
	 * H5人脸核身场景码。入参支持的场景码。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 自定义人脸比对图片的base64编码格式的string字符串
	 */
	@ApiField("face_contrast_picture")
	private String faceContrastPicture;

	/**
	 * 需要验证的身份信息
	 */
	@ApiField("identity_param")
	private OpenCertifyIdentifyInfo identityParam;

	/**
	 * 商户个性化配置信息
	 */
	@ApiField("merchant_config")
	private OpenCertifyMerchantConfigs merchantConfig;

	/**
	 * 商户请求的唯一标识，商户要保证其唯一性，值为32位长度的字母数字组合。建议：前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
	 */
	@ApiField("outer_order_no")
	private String outerOrderNo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getFaceContrastPicture() {
		return this.faceContrastPicture;
	}
	public void setFaceContrastPicture(String faceContrastPicture) {
		this.faceContrastPicture = faceContrastPicture;
	}

	public OpenCertifyIdentifyInfo getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(OpenCertifyIdentifyInfo identityParam) {
		this.identityParam = identityParam;
	}

	public OpenCertifyMerchantConfigs getMerchantConfig() {
		return this.merchantConfig;
	}
	public void setMerchantConfig(OpenCertifyMerchantConfigs merchantConfig) {
		this.merchantConfig = merchantConfig;
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}
	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}

}
