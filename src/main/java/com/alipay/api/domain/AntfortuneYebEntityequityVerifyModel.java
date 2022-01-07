package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实物权益核销回调
 *
 * @author auto create
 * @since 1.0, 2021-11-12 10:53:31
 */
public class AntfortuneYebEntityequityVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3319247517255792546L;

	/**
	 * 阿里云回调接口应用ID, appid这个名称是阿里云定义的
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 阿里云回调接口信息，info这个名称是阿里云定义的
	 */
	@ApiField("info")
	private LinkMallCallBackInfo info;

	/**
	 * 阿里云回调接口信息签名，signature这个名称是阿里云定义的
	 */
	@ApiField("signature")
	private String signature;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public LinkMallCallBackInfo getInfo() {
		return this.info;
	}
	public void setInfo(LinkMallCallBackInfo info) {
		this.info = info;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

}
