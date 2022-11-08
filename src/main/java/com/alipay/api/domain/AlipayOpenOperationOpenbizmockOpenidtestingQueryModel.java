package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网关测试接口——openid升级测试
 *
 * @author auto create
 * @since 1.0, 2022-09-25 11:54:08
 */
public class AlipayOpenOperationOpenbizmockOpenidtestingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6297575848482283928L;

	/**
	 * adadsad
	 */
	@ApiField("extra_json")
	private String extraJson;

	/**
	 * xxx
	 */
	@ApiField("extra_json_1")
	private String extraJson1;

	/**
	 * uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * ceshi
	 */
	@ApiField("test")
	private OpenidComplex test;

	/**
	 * 测试循环嵌套含有json数组和对象
	 */
	@ApiField("test_json")
	private String testJson;

	/**
	 * 1
	 */
	@ApiField("test_wrong")
	private String testWrong;

	/**
	 * xxx
	 */
	@ApiField("user_detail")
	private UserDetail userDetail;

	/**
	 * uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtraJson() {
		return this.extraJson;
	}
	public void setExtraJson(String extraJson) {
		this.extraJson = extraJson;
	}

	public String getExtraJson1() {
		return this.extraJson1;
	}
	public void setExtraJson1(String extraJson1) {
		this.extraJson1 = extraJson1;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public OpenidComplex getTest() {
		return this.test;
	}
	public void setTest(OpenidComplex test) {
		this.test = test;
	}

	public String getTestJson() {
		return this.testJson;
	}
	public void setTestJson(String testJson) {
		this.testJson = testJson;
	}

	public String getTestWrong() {
		return this.testWrong;
	}
	public void setTestWrong(String testWrong) {
		this.testWrong = testWrong;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
