package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代签协议获取
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:39
 */
public class AlipayPcreditLoanSideloansignAgreementPullModel extends AlipayObject {

	private static final long serialVersionUID = 4877235563414486275L;

	/**
	 * 信贷业务场景类型Code
	 */
	@ApiField("agreement_type")
	private String agreementType;

	/**
	 * 支付宝用户id，客户在支付宝的身份证
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 传入拉取代签协议列表前, 扩展信息透传相关业务场景的咨询结果信息
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 授信机构Id
	 */
	@ApiField("fund_supplier_code")
	private String fundSupplierCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁借贷款产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFundSupplierCode() {
		return this.fundSupplierCode;
	}
	public void setFundSupplierCode(String fundSupplierCode) {
		this.fundSupplierCode = fundSupplierCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
