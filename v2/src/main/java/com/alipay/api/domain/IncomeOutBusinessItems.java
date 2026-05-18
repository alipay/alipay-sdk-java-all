package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收益消息中的服务项信息
 *
 * @author auto create
 * @since 1.0, 2026-04-20 17:03:54
 */
public class IncomeOutBusinessItems extends AlipayObject {

	private static final long serialVersionUID = 2656274487695869188L;

	/**
	 * 服务项名称
	 */
	@ApiField("out_business_name")
	private String outBusinessName;

	/**
	 * 服务项id
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 服务项实收价格，单位：分
	 */
	@ApiField("out_business_sale_price")
	private String outBusinessSalePrice;

	/**
	 * 外部自定义号：履约单id
	 */
	@ApiField("out_custom_no")
	private String outCustomNo;

	/**
	 * 结算单据号
	 */
	@ApiField("out_settle_no")
	private String outSettleNo;

	/**
	 * 结算金额，单位：分
	 */
	@ApiField("settle_price")
	private String settlePrice;

	/**
	 * 结算时间
	 */
	@ApiField("settle_time")
	private String settleTime;

	/**
	 * 结算对象id，门店上的服务提供者id，团队id
	 */
	@ApiField("to_subject_id")
	private String toSubjectId;

	/**
	 * 结算对象类型，门店上的服务提供者类型
	 */
	@ApiField("to_subject_type")
	private String toSubjectType;

	public String getOutBusinessName() {
		return this.outBusinessName;
	}
	public void setOutBusinessName(String outBusinessName) {
		this.outBusinessName = outBusinessName;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getOutBusinessSalePrice() {
		return this.outBusinessSalePrice;
	}
	public void setOutBusinessSalePrice(String outBusinessSalePrice) {
		this.outBusinessSalePrice = outBusinessSalePrice;
	}

	public String getOutCustomNo() {
		return this.outCustomNo;
	}
	public void setOutCustomNo(String outCustomNo) {
		this.outCustomNo = outCustomNo;
	}

	public String getOutSettleNo() {
		return this.outSettleNo;
	}
	public void setOutSettleNo(String outSettleNo) {
		this.outSettleNo = outSettleNo;
	}

	public String getSettlePrice() {
		return this.settlePrice;
	}
	public void setSettlePrice(String settlePrice) {
		this.settlePrice = settlePrice;
	}

	public String getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(String settleTime) {
		this.settleTime = settleTime;
	}

	public String getToSubjectId() {
		return this.toSubjectId;
	}
	public void setToSubjectId(String toSubjectId) {
		this.toSubjectId = toSubjectId;
	}

	public String getToSubjectType() {
		return this.toSubjectType;
	}
	public void setToSubjectType(String toSubjectType) {
		this.toSubjectType = toSubjectType;
	}

}
