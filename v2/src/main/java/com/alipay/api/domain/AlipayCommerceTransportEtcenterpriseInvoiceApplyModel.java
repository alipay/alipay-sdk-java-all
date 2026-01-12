package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申请开票
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:07
 */
public class AlipayCommerceTransportEtcenterpriseInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1487578515993656887L;

	/**
	 * 虚拟运单编码,一次性最多开十张
	 */
	@ApiListField("apply_ids")
	@ApiField("string")
	private List<String> applyIds;

	/**
	 * 支付宝企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 发票接收邮箱
	 */
	@ApiField("invoice_mail")
	private String invoiceMail;

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

	public List<String> getApplyIds() {
		return this.applyIds;
	}
	public void setApplyIds(List<String> applyIds) {
		this.applyIds = applyIds;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getInvoiceMail() {
		return this.invoiceMail;
	}
	public void setInvoiceMail(String invoiceMail) {
		this.invoiceMail = invoiceMail;
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
