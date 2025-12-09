package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分布式身份VM签名内容
 *
 * @author auto create
 * @since 1.0, 2025-10-29 11:06:49
 */
public class DidMethodInfo extends AlipayObject {

	private static final long serialVersionUID = 2698789522196741364L;

	/**
	 * 签名来源
	 */
	@ApiField("sign_src")
	private String signSrc;

	/**
	 * vm签名值，用于验证数据的完整性
	 */
	@ApiField("signature")
	private String signature;

	/**
	 * 用户公钥结构
	 */
	@ApiField("vm")
	private String vm;

	public String getSignSrc() {
		return this.signSrc;
	}
	public void setSignSrc(String signSrc) {
		this.signSrc = signSrc;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getVm() {
		return this.vm;
	}
	public void setVm(String vm) {
		this.vm = vm;
	}

}
