package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷授信方案咨询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:37:20
 */
public class AlipayPcreditLoanSideloansignCreditConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6267757212145414839L;

	/**
	 * 支付宝用户id，客户在支付宝的身份证
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * SIMPLE_CREDIT，极简授信
	 */
	@ApiField("credit_type")
	private String creditType;

	/**
	 * 外部渠道客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 待补充
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品码, 信贷产品码销售外标 加 渠道编码组成，固定为: SL_PD_SALE_CODE-TAOTIAN
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCreditType() {
		return this.creditType;
	}
	public void setCreditType(String creditType) {
		this.creditType = creditType;
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
