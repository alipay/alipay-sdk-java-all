package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝跨境业务海关边民信息录入接口
 *
 * @author auto create
 * @since 1.0, 2023-05-23 14:59:16
 */
public class AlipayFincoreComplianceCustomsInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4145335316134766939L;

	/**
	 * 地区编码
塔城：TACHENG

	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 边民的真实姓名
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 边民证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型：
IDENTITY_CARD：身份证；
PASSPORT：护照；
OFFICER_CARD：军官证；
SOLDIER_CARD：士兵证；
HOKOU：户口本

	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商户唯一识别ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 海关创建订单后生成的唯一单号，支付中需要传递该订单号做核验。最小长度不低于8位。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户在支付宝签约后获得的唯一身份ID，2088开头的16位数字。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 门店唯一识别ID
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
