package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户是否签约一码付
 *
 * @author auto create
 * @since 1.0, 2024-11-13 17:02:24
 */
public class AlipayCommerceMedicalAuthorizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6887591294981832696L;

	/**
	 * 用户在IOT设备上刷脸获得的ftoken
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 定点医药机构编码
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgNo() {
		return this.orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
