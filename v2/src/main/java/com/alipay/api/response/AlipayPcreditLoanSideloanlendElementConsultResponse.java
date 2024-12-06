package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GrantBankCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanlend.element.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:10
 */
public class AlipayPcreditLoanSideloanlendElementConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1581172283375676128L;

	/** 
	 * TRUE：支用准入，FALSE：支用不准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 用户默认放款卡，可能为空
	 */
	@ApiField("default_bank_card")
	private GrantBankCard defaultBankCard;

	/** 
	 * 业务扩展信息
	 */
	@ApiField("extension")
	private String extension;

	/** 
	 * admit=false时必填，返回不准入拒绝码
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 当admit=false时必选，返回拒绝原因
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/** 
	 * 支持的还款方式及还款期次列表，JSONString, Map<String,RepaymentMethodAndTerm>
	 */
	@ApiField("repayment_method_and_term_map")
	private String repaymentMethodAndTermMap;

	/** 
	 * 表示请求处理状态。可选值：
SUCCESS - 成功
NEED_RETRY - 需要重试
FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * 二级错误码，返回具体业务错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 二级错误码，可以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	/** 
	 * 当用户命中安全的限权，且允许用户操作解限时此值不为空，用户可跳转链接操作解限
	 */
	@ApiField("un_limit_url")
	private String unLimitUrl;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setDefaultBankCard(GrantBankCard defaultBankCard) {
		this.defaultBankCard = defaultBankCard;
	}
	public GrantBankCard getDefaultBankCard( ) {
		return this.defaultBankCard;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getExtension( ) {
		return this.extension;
	}

	public void setFailReasonCode(String failReasonCode) {
		this.failReasonCode = failReasonCode;
	}
	public String getFailReasonCode( ) {
		return this.failReasonCode;
	}

	public void setFailReasonMessage(String failReasonMessage) {
		this.failReasonMessage = failReasonMessage;
	}
	public String getFailReasonMessage( ) {
		return this.failReasonMessage;
	}

	public void setRepaymentMethodAndTermMap(String repaymentMethodAndTermMap) {
		this.repaymentMethodAndTermMap = repaymentMethodAndTermMap;
	}
	public String getRepaymentMethodAndTermMap( ) {
		return this.repaymentMethodAndTermMap;
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

	public void setUnLimitUrl(String unLimitUrl) {
		this.unLimitUrl = unLimitUrl;
	}
	public String getUnLimitUrl( ) {
		return this.unLimitUrl;
	}

}
