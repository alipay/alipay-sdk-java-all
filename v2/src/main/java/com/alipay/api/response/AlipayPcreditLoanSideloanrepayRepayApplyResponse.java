package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanrepay.repay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 17:47:24
 */
public class AlipayPcreditLoanSideloanrepayRepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1218763656166738429L;

	/** 
	 * 扩展参数，预留字段，JSONString格式
	 */
	@ApiField("extension")
	private String extension;

	/** 
	 * 蚂蚁还款受理单号，蚂蚁侧生成
	 */
	@ApiField("institution_repayment_no")
	private String institutionRepaymentNo;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 收银台唤起参数
	 */
	@ApiField("payment_params")
	private String paymentParams;

	/** 
	 * 表示请求处理状态。 SUCCESS - 成功 NEED_RETRY -需要重试 FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * returnCode为FAIL或者NEED_RETRY状态下，返回具体错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 可以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getExtension( ) {
		return this.extension;
	}

	public void setInstitutionRepaymentNo(String institutionRepaymentNo) {
		this.institutionRepaymentNo = institutionRepaymentNo;
	}
	public String getInstitutionRepaymentNo( ) {
		return this.institutionRepaymentNo;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPaymentParams(String paymentParams) {
		this.paymentParams = paymentParams;
	}
	public String getPaymentParams( ) {
		return this.paymentParams;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnSubCode(String returnSubCode) {
		this.returnSubCode = returnSubCode;
	}
	public String getReturnSubCode( ) {
		return this.returnSubCode;
	}

	public void setReturnSubMessage(String returnSubMessage) {
		this.returnSubMessage = returnSubMessage;
	}
	public String getReturnSubMessage( ) {
		return this.returnSubMessage;
	}

}
