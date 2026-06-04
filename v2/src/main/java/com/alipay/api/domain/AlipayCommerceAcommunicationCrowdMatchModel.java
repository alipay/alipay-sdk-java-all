package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运营商行业人群匹配
 *
 * @author auto create
 * @since 1.0, 2026-06-03 13:58:29
 */
public class AlipayCommerceAcommunicationCrowdMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4568589262371955553L;

	/**
	 * 运营商行业定义的人群ID，运营商行业给出
	 */
	@ApiListField("crowd_id")
	@ApiField("string")
	private List<String> crowdId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

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

	public List<String> getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(List<String> crowdId) {
		this.crowdId = crowdId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
