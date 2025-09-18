package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷合并还款计划查询
 *
 * @author auto create
 * @since 1.0, 2025-04-25 15:45:05
 */
public class AlipayPcreditLoanSideloanrepayPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5892526491562384687L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扩展信息，透传信息，预留
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

	/**
	 * 是否返回分期信息。true:接口会返回分期信息；false:接口不返回分期信息。
	 */
	@ApiField("query_installment")
	private Boolean queryInstallment;

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

	public Boolean getQueryInstallment() {
		return this.queryInstallment;
	}
	public void setQueryInstallment(Boolean queryInstallment) {
		this.queryInstallment = queryInstallment;
	}

}
