package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作废票
 *
 * @author auto create
 * @since 1.0, 2023-11-27 10:28:39
 */
public class AlipayMarketingVoucherDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6361743376922457426L;

	/**
	 * 支付宝用户的openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部唯一业务号，用于做幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
