package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资方授信审批结果同步
 *
 * @author auto create
 * @since 1.0, 2024-09-14 11:01:18
 */
public class AlipayCommerceEcCreditWithdrawSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7872381728382236175L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_pay_no")
	private String alipayPayNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * bank_bill_no: 银行转账单号, 取款成功时填写
withdraw_serial_no: 资方内部取款单号, 取款成功时填写
	 */
	@ApiField("ext_info")
	private BankOrderInfo extInfo;

	/**
	 * 银行返回的审核失败原因描述，情况状态为APPROVE_FAIL时必填
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 商户请款申请单号，银行幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 请款状态，枚举
审核通过：APPROVE_PASS
审核失败：APPROVE_FAIL
取款成功: WITHDRAW_SUCCESS
	 */
	@ApiField("result")
	private String result;

	public String getAlipayPayNo() {
		return this.alipayPayNo;
	}
	public void setAlipayPayNo(String alipayPayNo) {
		this.alipayPayNo = alipayPayNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public BankOrderInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(BankOrderInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
