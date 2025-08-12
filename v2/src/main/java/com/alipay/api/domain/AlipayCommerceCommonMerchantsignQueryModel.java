package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户签约状态查询
 *
 * @author auto create
 * @since 1.0, 2023-12-12 16:10:51
 */
public class AlipayCommerceCommonMerchantsignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2633543361518296865L;

	/**
	 * 授权场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 签约商户pid
	 */
	@ApiField("sign_pid")
	private String signPid;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSignPid() {
		return this.signPid;
	}
	public void setSignPid(String signPid) {
		this.signPid = signPid;
	}

}
