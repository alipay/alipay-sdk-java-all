package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回支付宝uid对应的vid信息
 *
 * @author auto create
 * @since 1.0, 2022-08-12 11:33:17
 */
public class IotIdentityOrgUserVidInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 3699471769489118138L;

	/**
	 * 支付宝账号uid
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 刷脸成功的vid
	 */
	@ApiField("vid")
	private String vid;

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
