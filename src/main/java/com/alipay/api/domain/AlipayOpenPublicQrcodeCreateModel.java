package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * createQrCodeProcessor
 *
 * @author auto create
 * @since 1.0, 2020-06-30 21:48:38
 */
public class AlipayOpenPublicQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1847177634925362113L;

	/**
	 * 服务窗创建带参二维码接口，开发者自定义信息
	 */
	@ApiField("code_info")
	private CodeInfo codeInfo;

	/**
	 * 二维码类型，目前只支持两种类型：
TEMP：临时的（默认）；
PERM：永久的
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 临时码过期时间，以秒为单位，最大不超过1800秒；
永久码置空
	 */
	@ApiField("expire_second")
	private String expireSecond;

	/**
	 * 二维码中间是否显示服务窗logo，Y：显示；N：不显示（默认）
	 */
	@ApiField("show_logo")
	private String showLogo;

	public CodeInfo getCodeInfo() {
		return this.codeInfo;
	}
	public void setCodeInfo(CodeInfo codeInfo) {
		this.codeInfo = codeInfo;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getExpireSecond() {
		return this.expireSecond;
	}
	public void setExpireSecond(String expireSecond) {
		this.expireSecond = expireSecond;
	}

	public String getShowLogo() {
		return this.showLogo;
	}
	public void setShowLogo(String showLogo) {
		this.showLogo = showLogo;
	}

}
