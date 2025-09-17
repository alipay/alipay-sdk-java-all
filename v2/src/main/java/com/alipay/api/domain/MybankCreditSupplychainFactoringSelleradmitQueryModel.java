package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保理门店准入查询
 *
 * @author auto create
 * @since 1.0, 2025-04-15 15:20:26
 */
public class MybankCreditSupplychainFactoringSelleradmitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3444731537561218287L;

	/**
	 * 基于社会统一信用代码查询门店是否在黑名单内
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * isv支付宝id
	 */
	@ApiField("buyer_alipay_id")
	private String buyerAlipayId;

	/**
	 * isv支付宝id
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 门店名单类型,该值由网商提供
	 */
	@ApiField("list_type")
	private String listType;

	/**
	 * 销售产品码,该值由网商提供
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 门店支付登录号
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getBuyerAlipayId() {
		return this.buyerAlipayId;
	}
	public void setBuyerAlipayId(String buyerAlipayId) {
		this.buyerAlipayId = buyerAlipayId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getListType() {
		return this.listType;
	}
	public void setListType(String listType) {
		this.listType = listType;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

}
