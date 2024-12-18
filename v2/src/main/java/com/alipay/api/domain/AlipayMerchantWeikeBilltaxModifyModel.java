package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微客个税申报更新接口
 *
 * @author auto create
 * @since 1.0, 2019-05-30 11:56:23
 */
public class AlipayMerchantWeikeBilltaxModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3886213425857117736L;

	/**
	 * 实际报税金额，单位元
	 */
	@ApiField("actual_tax")
	private String actualTax;

	/**
	 * 退税支付宝转账流水号
	 */
	@ApiField("alipay_trans_serial_no")
	private String alipayTransSerialNo;

	/**
	 * 申报个税账单的月份，比如在2019年4月申报3月的个税，则创："201903"
	 */
	@ApiField("bill_month")
	private String billMonth;

	/**
	 * 账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单版本号
	 */
	@ApiField("bill_version")
	private Long billVersion;

	/**
	 * 预扣税金额
	 */
	@ApiField("expect_tax")
	private String expectTax;

	/**
	 * 账单更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 当月已退个税金额
	 */
	@ApiField("tax_rebate")
	private String taxRebate;

	/**
	 * 退税支付时间
	 */
	@ApiField("tax_rebate_gmt_pay")
	private Date taxRebateGmtPay;

	/**
	 * 退税转账流水号
	 */
	@ApiField("tax_rebate_serial_no")
	private String taxRebateSerialNo;

	/**
	 * 微客用户编码
	 */
	@ApiField("weike_user_id")
	private Long weikeUserId;

	public String getActualTax() {
		return this.actualTax;
	}
	public void setActualTax(String actualTax) {
		this.actualTax = actualTax;
	}

	public String getAlipayTransSerialNo() {
		return this.alipayTransSerialNo;
	}
	public void setAlipayTransSerialNo(String alipayTransSerialNo) {
		this.alipayTransSerialNo = alipayTransSerialNo;
	}

	public String getBillMonth() {
		return this.billMonth;
	}
	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Long getBillVersion() {
		return this.billVersion;
	}
	public void setBillVersion(Long billVersion) {
		this.billVersion = billVersion;
	}

	public String getExpectTax() {
		return this.expectTax;
	}
	public void setExpectTax(String expectTax) {
		this.expectTax = expectTax;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTaxRebate() {
		return this.taxRebate;
	}
	public void setTaxRebate(String taxRebate) {
		this.taxRebate = taxRebate;
	}

	public Date getTaxRebateGmtPay() {
		return this.taxRebateGmtPay;
	}
	public void setTaxRebateGmtPay(Date taxRebateGmtPay) {
		this.taxRebateGmtPay = taxRebateGmtPay;
	}

	public String getTaxRebateSerialNo() {
		return this.taxRebateSerialNo;
	}
	public void setTaxRebateSerialNo(String taxRebateSerialNo) {
		this.taxRebateSerialNo = taxRebateSerialNo;
	}

	public Long getWeikeUserId() {
		return this.weikeUserId;
	}
	public void setWeikeUserId(Long weikeUserId) {
		this.weikeUserId = weikeUserId;
	}

}
