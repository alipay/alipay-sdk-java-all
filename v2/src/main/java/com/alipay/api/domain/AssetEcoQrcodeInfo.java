package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态码信息详情
 *
 * @author auto create
 * @since 1.0, 2024-11-04 19:32:20
 */
public class AssetEcoQrcodeInfo extends AlipayObject {

	private static final long serialVersionUID = 4318398969451127767L;

	/**
	 * 该参数是支付宝物料通码平台的码类型，由业务提供
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 用于生态发空码时的幂等号字段，相同的幂等则发相同的空码
	 */
	@ApiField("idempotent_num")
	private String idempotentNum;

	/**
	 * 提供给生态ISV的码值信息
	 */
	@ApiField("qrcode")
	private String qrcode;

	/**
	 * 提供给生态isv服务商的生态码值图片链接
	 */
	@ApiField("qrcode_img_url")
	private String qrcodeImgUrl;

	/**
	 * 提供给生态isv的码值链接url
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getIdempotentNum() {
		return this.idempotentNum;
	}
	public void setIdempotentNum(String idempotentNum) {
		this.idempotentNum = idempotentNum;
	}

	public String getQrcode() {
		return this.qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public String getQrcodeImgUrl() {
		return this.qrcodeImgUrl;
	}
	public void setQrcodeImgUrl(String qrcodeImgUrl) {
		this.qrcodeImgUrl = qrcodeImgUrl;
	}

	public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

}
