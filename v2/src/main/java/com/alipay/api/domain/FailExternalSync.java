package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动账同步失败对象
 *
 * @author auto create
 * @since 1.0, 2020-12-14 13:36:31
 */
public class FailExternalSync extends AlipayObject {

	private static final long serialVersionUID = 6664484347123168495L;

	/**
	 * 支付宝账单ID
	 */
	@ApiField("alipay_bill_id")
	private String alipayBillId;

	/**
	 * BILL_IS_PAY 已支付（ISV其他流程发起退款）
BILL_IS_WAITINT_PAY 待支付中（ISV不做处理，等待超时或用户支付后重试）
SYSTEM_ERROR 系统异常，可重试
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 外部账单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAlipayBillId() {
		return this.alipayBillId;
	}
	public void setAlipayBillId(String alipayBillId) {
		this.alipayBillId = alipayBillId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
