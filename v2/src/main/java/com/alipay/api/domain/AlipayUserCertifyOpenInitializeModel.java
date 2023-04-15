package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝开放认证初始化服务
 *
 * @author auto create
 * @since 1.0, 2023-03-01 14:25:16
 */
public class AlipayUserCertifyOpenInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6422667416615191795L;

	/**
	 * 认证场景码。入参支持的认证场景码和商户签约的认证场景相关，取值如下:
FACE：多因子人脸认证
CERT_PHOTO：多因子证照认证
CERT_PHOTO_FACE ：多因子证照和人脸认证
SMART_FACE：多因子快捷认证
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
	private OpenCertifyIdentityParam identityParam;

	/**
	 * 商户个性化配置
	 */
	@ApiField("merchant_config")
	private OpenCertifyMerchantConfig merchantConfig;

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

	public OpenCertifyIdentityParam getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(OpenCertifyIdentityParam identityParam) {
		this.identityParam = identityParam;
	}

	public OpenCertifyMerchantConfig getMerchantConfig() {
		return this.merchantConfig;
	}
	public void setMerchantConfig(OpenCertifyMerchantConfig merchantConfig) {
		this.merchantConfig = merchantConfig;
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}
	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}

}
