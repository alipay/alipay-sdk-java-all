package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮商户修改认证信息
 *
 * @author auto create
 * @since 1.0, 2026-02-27 14:02:43
 */
public class AlipayCommerceOperationTagClaimModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2484684265595737618L;

	/**
	 * 商户新支付宝账号，一般是手机号或邮箱
	 */
	@ApiField("new_alipay_account")
	private String newAlipayAccount;

	/**
	 * 商户原支付宝账号，一般是手机号或邮箱
	 */
	@ApiField("old_alipay_account")
	private String oldAlipayAccount;

	/**
	 * 商户在支付宝认证的门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 商户在支付宝认证的门店ID的类型
	 */
	@ApiField("store_id_type")
	private String storeIdType;

	public String getNewAlipayAccount() {
		return this.newAlipayAccount;
	}
	public void setNewAlipayAccount(String newAlipayAccount) {
		this.newAlipayAccount = newAlipayAccount;
	}

	public String getOldAlipayAccount() {
		return this.oldAlipayAccount;
	}
	public void setOldAlipayAccount(String oldAlipayAccount) {
		this.oldAlipayAccount = oldAlipayAccount;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreIdType() {
		return this.storeIdType;
	}
	public void setStoreIdType(String storeIdType) {
		this.storeIdType = storeIdType;
	}

}
