package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮商户添加认证的点餐线圈
 *
 * @author auto create
 * @since 1.0, 2026-05-06 15:17:49
 */
public class AlipayCommerceOperationTagClaimAddModel extends AlipayObject {

	private static final long serialVersionUID = 4258655784595977419L;

	/**
	 * 商户支付宝账号，一般是手机号或邮箱
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * null
	 */
	@ApiListField("qrcode_list")
	@ApiField("string")
	private List<String> qrcodeList;

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

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public List<String> getQrcodeList() {
		return this.qrcodeList;
	}
	public void setQrcodeList(List<String> qrcodeList) {
		this.qrcodeList = qrcodeList;
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
