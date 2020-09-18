package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票据助手通过通知回查新增票据
 *
 * @author auto create
 * @since 1.0, 2020-08-14 17:01:20
 */
public class AlipayFundTransInvoiceFromisvnotifyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5531834834216418391L;

	/**
	 * 所属地区，用于区分不同地区票据应用
	 */
	@ApiField("area")
	private String area;

	/**
	 * 票据代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 票据号码
	 */
	@ApiField("invoice_number")
	private String invoiceNumber;

	/**
	 * 默认0，是否是历史数据同步。历史数据不发蚂蚁森林能量 0 非历史数据 1 是历史数据
	 */
	@ApiField("is_old_data_sync")
	private String isOldDataSync;

	/**
	 * 当user_id不传值时payer_id_type必须传值，含义为用户身份标识类型 1 身份证
	 */
	@ApiField("payer_id_type")
	private String payerIdType;

	/**
	 * 当user_id为空时，payer_id_value必须传值，内容为与payer_id_type对应的标识值，如身份证号130xxx
	 */
	@ApiField("payer_id_value")
	private String payerIdValue;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getIsOldDataSync() {
		return this.isOldDataSync;
	}
	public void setIsOldDataSync(String isOldDataSync) {
		this.isOldDataSync = isOldDataSync;
	}

	public String getPayerIdType() {
		return this.payerIdType;
	}
	public void setPayerIdType(String payerIdType) {
		this.payerIdType = payerIdType;
	}

	public String getPayerIdValue() {
		return this.payerIdValue;
	}
	public void setPayerIdValue(String payerIdValue) {
		this.payerIdValue = payerIdValue;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
