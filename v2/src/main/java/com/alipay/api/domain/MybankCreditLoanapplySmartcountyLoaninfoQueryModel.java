package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝用户网商贷信息-智慧县域小程序专用
 *
 * @author auto create
 * @since 1.0, 2023-08-10 10:23:47
 */
public class MybankCreditLoanapplySmartcountyLoaninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2896798998997477323L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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
