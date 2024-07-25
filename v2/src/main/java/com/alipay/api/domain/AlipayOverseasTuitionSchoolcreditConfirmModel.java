package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国际留学汇款-汇款入账通知
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:06:12
 */
public class AlipayOverseasTuitionSchoolcreditConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3465378968796885774L;

	/**
	 * 支付内部交易流水号
	 */
	@ApiField("alipay_payment_id")
	private String alipayPaymentId;

	/**
	 * 汇款入账金额
	 */
	@ApiField("confirm_amount")
	private Money confirmAmount;

	/**
	 * 汇款入账结果
	 */
	@ApiField("confirm_result")
	private TuitionISVResult confirmResult;

	/**
	 * 汇款入账时间
	 */
	@ApiField("confirm_time")
	private Date confirmTime;

	/**
	 * ISV内部账单号
	 */
	@ApiField("isv_payment_id")
	private String isvPaymentId;

	/**
	 * ISV在开放平台入驻签约的PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 业务透传保留字段，json map格式
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 学校在开放平台入驻签约的PID
	 */
	@ApiField("school_pid")
	private String schoolPid;

	public String getAlipayPaymentId() {
		return this.alipayPaymentId;
	}
	public void setAlipayPaymentId(String alipayPaymentId) {
		this.alipayPaymentId = alipayPaymentId;
	}

	public Money getConfirmAmount() {
		return this.confirmAmount;
	}
	public void setConfirmAmount(Money confirmAmount) {
		this.confirmAmount = confirmAmount;
	}

	public TuitionISVResult getConfirmResult() {
		return this.confirmResult;
	}
	public void setConfirmResult(TuitionISVResult confirmResult) {
		this.confirmResult = confirmResult;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getIsvPaymentId() {
		return this.isvPaymentId;
	}
	public void setIsvPaymentId(String isvPaymentId) {
		this.isvPaymentId = isvPaymentId;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

}
