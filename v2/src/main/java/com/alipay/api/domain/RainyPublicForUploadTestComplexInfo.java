package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 20260820用于架构升级的-公有复杂类型；
 *
 * @author auto create
 * @since 1.0, 2026-08-21 16:36:31
 */
public class RainyPublicForUploadTestComplexInfo extends AlipayObject {

	private static final long serialVersionUID = 2343217378571867552L;

	/**
	 * 复杂类型嵌套
	 */
	@ApiField("demo")
	private RainyPraviteTestForUploadComplexInfo demo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public RainyPraviteTestForUploadComplexInfo getDemo() {
		return this.demo;
	}
	public void setDemo(RainyPraviteTestForUploadComplexInfo demo) {
		this.demo = demo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
