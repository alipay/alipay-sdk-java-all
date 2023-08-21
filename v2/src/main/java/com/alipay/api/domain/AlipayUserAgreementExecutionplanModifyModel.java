package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期性扣款协议执行计划修改接口
 *
 * @author auto create
 * @since 1.0, 2022-11-17 17:25:59
 */
public class AlipayUserAgreementExecutionplanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1174357631897419288L;

	/**
	 * 周期性扣款产品，授权免密支付协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 商户下一次扣款时间
	 */
	@ApiField("deduct_time")
	private Date deductTime;

	/**
	 * 具体修改原因
	 */
	@ApiField("memo")
	private String memo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Date getDeductTime() {
		return this.deductTime;
	}
	public void setDeductTime(Date deductTime) {
		this.deductTime = deductTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
