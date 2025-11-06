package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 妈妈商家扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-05-13 16:45:46
 */
public class AlimamaPrincipalExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 6837193736221331477L;

	/**
	 * 商家自定义账户名称
	 */
	@ApiField("principal_define_name")
	private String principalDefineName;

	/**
	 * 二代邮箱
	 */
	@ApiField("second_email")
	private String secondEmail;

	/**
	 * 二代支付宝oid
	 */
	@ApiField("second_oid")
	private String secondOid;

	/**
	 * 风控识别商家关联的支付宝企业账号和资质id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 店铺ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 商家营业执照名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 店铺类型
	 */
	@ApiField("store_type")
	private String storeType;

	public String getPrincipalDefineName() {
		return this.principalDefineName;
	}
	public void setPrincipalDefineName(String principalDefineName) {
		this.principalDefineName = principalDefineName;
	}

	public String getSecondEmail() {
		return this.secondEmail;
	}
	public void setSecondEmail(String secondEmail) {
		this.secondEmail = secondEmail;
	}

	public String getSecondOid() {
		return this.secondOid;
	}
	public void setSecondOid(String secondOid) {
		this.secondOid = secondOid;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreType() {
		return this.storeType;
	}
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

}
