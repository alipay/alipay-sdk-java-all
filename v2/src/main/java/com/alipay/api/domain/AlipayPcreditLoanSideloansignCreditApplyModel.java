package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷授信申请提交
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:12
 */
public class AlipayPcreditLoanSideloansignCreditApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2171135647167975549L;

	/**
	 * 支付宝用户id，客户在支付宝的身份证
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 授信申请编号，唯一单号，业务幂等键
	 */
	@ApiField("credit_apply_no")
	private String creditApplyNo;

	/**
	 * 淘宝会员id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 当前淘宝提供的接口文档里面设定的扩展信息
承载在咨询阶段返回的需要透传回传给蚂蚁的信息
合并取协议曝光的返回结果contractSignCacheKey
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 授信申请机构
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

	/**
	 * 大安全核身id
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCreditApplyNo() {
		return this.creditApplyNo;
	}
	public void setCreditApplyNo(String creditApplyNo) {
		this.creditApplyNo = creditApplyNo;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
