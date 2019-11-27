package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税单详情
 *
 * @author auto create
 * @since 1.0, 2019-04-01 11:21:02
 */
public class TaxRefundDetail extends AlipayObject {

	private static final long serialVersionUID = 3429848787772687523L;

	/**
	 * 退税单创建时间，格式 : yyyy-MM-dd HH:mm:ss，北京时间24小时制，时区东八区
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 退税失败时间，只有status为F时才有值，时间格式：YYYY-MM-DD HH:MM:SS，北京时间24小时制，时区东八区
	 */
	@ApiField("fail_time")
	private Date failTime;

	/**
	 * 退税机构业务流水号，唯一，由退税机构生成，只能包含英字母、数字，长度不能小于3且不能大于64
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 护照号，退税客人的护照号
	 */
	@ApiField("passport_no")
	private String passportNo;

	/**
	 * 退税状态，S 表示退税成功；F表示退税失败；I 表示受理中；
	 */
	@ApiField("status")
	private String status;

	/**
	 * 退税成功时间，只有status为S时才有值，时间格式：YYYY-MM-DD HH:MM:SS，北京时间24小时制，时区东八区
	 */
	@ApiField("success_time")
	private Date successTime;

	/**
	 * 支付宝的退税序列号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 退税金额，退税公司退税金额，币种由tax_refund_currency指定，精确到币种最小单位，如tax_refund_currency为EUR，币种最小单位为欧分，100欧元，则tax_refund_amount传入10000.
	 */
	@ApiField("tax_refund_amount")
	private String taxRefundAmount;

	/**
	 * 退税公司退税币种，一般指外币，ISO标准退税国家alpha-3币种代码
	 */
	@ApiField("tax_refund_currency")
	private String taxRefundCurrency;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getFailTime() {
		return this.failTime;
	}
	public void setFailTime(Date failTime) {
		this.failTime = failTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPassportNo() {
		return this.passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getSuccessTime() {
		return this.successTime;
	}
	public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxRefundAmount() {
		return this.taxRefundAmount;
	}
	public void setTaxRefundAmount(String taxRefundAmount) {
		this.taxRefundAmount = taxRefundAmount;
	}

	public String getTaxRefundCurrency() {
		return this.taxRefundCurrency;
	}
	public void setTaxRefundCurrency(String taxRefundCurrency) {
		this.taxRefundCurrency = taxRefundCurrency;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
