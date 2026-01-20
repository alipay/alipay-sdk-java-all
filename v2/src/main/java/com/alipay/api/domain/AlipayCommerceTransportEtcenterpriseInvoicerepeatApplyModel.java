package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 重新开票
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:05
 */
public class AlipayCommerceTransportEtcenterpriseInvoicerepeatApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8692714775987645274L;

	/**
	 * 虚拟运单编码
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 企业id
	 */
	@ApiField("corp_id")
	private String corpId;

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

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
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
