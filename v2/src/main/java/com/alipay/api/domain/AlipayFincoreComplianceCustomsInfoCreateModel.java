package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝跨境业务海关边民信息录入接口
 *
 * @author auto create
 * @since 1.0, 2023-03-31 13:44:23
 */
public class AlipayFincoreComplianceCustomsInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2241476234566274477L;

	/**
	 * 地区编号
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * buyer_name+不唯一+海关推送边民信息+无+海关传入+供海关调用
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * cert_no+不唯一+海关推送边民信息+无+海关传入+证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * cert_type+不唯一+海关推送边民信息+IDENTITY_CARD+海关传入+供海关调用
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * merchant_id + 否 + 边民信息录入 + 无 + 海关传入 + 海关边民信息录入
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * merchant_order_no+唯一+海关推送边民信息+无+海关传入+供海关调用
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * store_id + 否 + 边民信息录入 + 无 + 海关传入 + 海关边民信息录入
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
