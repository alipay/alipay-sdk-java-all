package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试openapi路由
 *
 * @author auto create
 * @since 1.0, 2022-10-10 18:44:14
 */
public class AlipayOpenOperationOpenbizmockRzoneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4181852584256644545L;

	/**
	 * 测试专用
	 */
	@ApiField("test_json")
	private String testJson;

	/**
	 * 测试专用
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 测试专用
	 */
	@ApiField("uid_openid")
	private String uidOpenid;

	public String getTestJson() {
		return this.testJson;
	}
	public void setTestJson(String testJson) {
		this.testJson = testJson;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUidOpenid() {
		return this.uidOpenid;
	}
	public void setUidOpenid(String uidOpenid) {
		this.uidOpenid = uidOpenid;
	}

}
