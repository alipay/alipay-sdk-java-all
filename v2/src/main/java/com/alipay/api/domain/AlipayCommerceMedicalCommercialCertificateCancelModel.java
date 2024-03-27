package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业商业化会员卡兑换凭证取消接口
 *
 * @author auto create
 * @since 1.0, 2024-03-13 10:03:39
 */
public class AlipayCommerceMedicalCommercialCertificateCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6745838589574512556L;

	/**
	 * 用户openid，唯一映射用户userid，用于唯一标识用户
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户兑换开通凭证的唯一业务流水号
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户兑换凭证时登录或指定的手机号码
	 */
	@ApiField("user_mobile")
	private String userMobile;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

}
