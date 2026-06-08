package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群包匹配
 *
 * @author auto create
 * @since 1.0, 2026-02-28 11:17:44
 */
public class AlipayCommerceMedicalCrowdMatchedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4778485642124425388L;

	/**
	 * 查询某一应用人群包的渠道码
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝uid，2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息;
	 */
	@ApiField("user_id")
	private String userId;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
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
