package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微客结算账单更新接口
 *
 * @author auto create
 * @since 1.0, 2019-05-30 11:56:30
 */
public class AlipayMerchantWeikeBillModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1718289375641398345L;

	/**
	 * 当月实发劳务费，单位元
	 */
	@ApiField("actual_service_charge")
	private String actualServiceCharge;

	/**
	 * 本次劳务费发放的支付宝转账流水号
	 */
	@ApiField("alipay_trans_serial_no")
	private String alipayTransSerialNo;

	/**
	 * 修改的账单月份，比如2019年4月1号修改3月的账单，则传201903
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
	 * 本次实际发放劳务费金额，单位元
	 */
	@ApiField("current_actual_service_charge")
	private String currentActualServiceCharge;

	/**
	 * 本次应放劳务费金额，单位元
	 */
	@ApiField("current_expect_service_charge")
	private String currentExpectServiceCharge;

	/**
	 * 本次发放劳务费的用户任务编号总笔数
	 */
	@ApiField("current_user_task_count")
	private Long currentUserTaskCount;

	/**
	 * 当月应发劳务费金额，单位元
	 */
	@ApiField("expect_service_charge")
	private String expectServiceCharge;

	/**
	 * 预扣个税金额，单位元
	 */
	@ApiField("expect_tax")
	private String expectTax;

	/**
	 * 账单更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 支付时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 包含税费的已发放劳务费
	 */
	@ApiField("paid_charge_tax_include")
	private String paidChargeTaxInclude;

	/**
	 * 已发放的劳务费金额，单位元
	 */
	@ApiField("paid_service_charge")
	private String paidServiceCharge;

	/**
	 * 劳务发放流水号
	 */
	@ApiField("service_charge_serial_no")
	private String serviceChargeSerialNo;

	/**
	 * 待发放劳务费金额，单位元
	 */
	@ApiField("to_pay_service_charge")
	private String toPayServiceCharge;

	/**
	 * 微客用户编码
	 */
	@ApiField("weike_user_id")
	private Long weikeUserId;

	public String getActualServiceCharge() {
		return this.actualServiceCharge;
	}
	public void setActualServiceCharge(String actualServiceCharge) {
		this.actualServiceCharge = actualServiceCharge;
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

	public String getCurrentActualServiceCharge() {
		return this.currentActualServiceCharge;
	}
	public void setCurrentActualServiceCharge(String currentActualServiceCharge) {
		this.currentActualServiceCharge = currentActualServiceCharge;
	}

	public String getCurrentExpectServiceCharge() {
		return this.currentExpectServiceCharge;
	}
	public void setCurrentExpectServiceCharge(String currentExpectServiceCharge) {
		this.currentExpectServiceCharge = currentExpectServiceCharge;
	}

	public Long getCurrentUserTaskCount() {
		return this.currentUserTaskCount;
	}
	public void setCurrentUserTaskCount(Long currentUserTaskCount) {
		this.currentUserTaskCount = currentUserTaskCount;
	}

	public String getExpectServiceCharge() {
		return this.expectServiceCharge;
	}
	public void setExpectServiceCharge(String expectServiceCharge) {
		this.expectServiceCharge = expectServiceCharge;
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

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPaidChargeTaxInclude() {
		return this.paidChargeTaxInclude;
	}
	public void setPaidChargeTaxInclude(String paidChargeTaxInclude) {
		this.paidChargeTaxInclude = paidChargeTaxInclude;
	}

	public String getPaidServiceCharge() {
		return this.paidServiceCharge;
	}
	public void setPaidServiceCharge(String paidServiceCharge) {
		this.paidServiceCharge = paidServiceCharge;
	}

	public String getServiceChargeSerialNo() {
		return this.serviceChargeSerialNo;
	}
	public void setServiceChargeSerialNo(String serviceChargeSerialNo) {
		this.serviceChargeSerialNo = serviceChargeSerialNo;
	}

	public String getToPayServiceCharge() {
		return this.toPayServiceCharge;
	}
	public void setToPayServiceCharge(String toPayServiceCharge) {
		this.toPayServiceCharge = toPayServiceCharge;
	}

	public Long getWeikeUserId() {
		return this.weikeUserId;
	}
	public void setWeikeUserId(Long weikeUserId) {
		this.weikeUserId = weikeUserId;
	}

}
