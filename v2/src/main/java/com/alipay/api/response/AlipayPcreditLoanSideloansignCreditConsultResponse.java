package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GrantBankCard;
import com.alipay.api.domain.InstitutionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloansign.credit.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-25 15:02:33
 */
public class AlipayPcreditLoanSideloansignCreditConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5615985534151119694L;

	/** 
	 * true - 有签约方案
false - 无签约方案
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 用户支付宝登陆ID(脱敏后的)
	 */
	@ApiField("alipay_desensitize_login_id")
	private String alipayDesensitizeLoginId;

	/** 
	 * 冷静期类型，LONG-长，SHORT-短，NONE-无
	 */
	@ApiField("cool_off_type")
	private String coolOffType;

	/** 
	 * 默认放款卡，只有签支合一才有，可能会空
	 */
	@ApiField("default_bank_card")
	private GrantBankCard defaultBankCard;

	/** 
	 * 扩展信息
	 */
	@ApiField("extension")
	private String extension;

	/** 
	 * 失败原因编码
	 */
	@ApiField("fail_reason_code")
	private String failReasonCode;

	/** 
	 * 失败原因描述
	 */
	@ApiField("fail_reason_message")
	private String failReasonMessage;

	/** 
	 * 授信机构列表
	 */
	@ApiField("fund_supplier")
	private InstitutionVO fundSupplier;

	/** 
	 * 同人账号其他支付宝账号
	 */
	@ApiField("other_alipay_densey_login_id")
	private String otherAlipayDenseyLoginId;

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

	/** 
	 * 限权解绑链接
	 */
	@ApiField("un_limit_url")
	private String unLimitUrl;

	/** 
	 * 用户姓名(脱敏后的)
	 */
	@ApiField("user_desensitize_name")
	private String userDesensitizeName;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setAlipayDesensitizeLoginId(String alipayDesensitizeLoginId) {
		this.alipayDesensitizeLoginId = alipayDesensitizeLoginId;
	}
	public String getAlipayDesensitizeLoginId( ) {
		return this.alipayDesensitizeLoginId;
	}

	public void setCoolOffType(String coolOffType) {
		this.coolOffType = coolOffType;
	}
	public String getCoolOffType( ) {
		return this.coolOffType;
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

	public void setFundSupplier(InstitutionVO fundSupplier) {
		this.fundSupplier = fundSupplier;
	}
	public InstitutionVO getFundSupplier( ) {
		return this.fundSupplier;
	}

	public void setOtherAlipayDenseyLoginId(String otherAlipayDenseyLoginId) {
		this.otherAlipayDenseyLoginId = otherAlipayDenseyLoginId;
	}
	public String getOtherAlipayDenseyLoginId( ) {
		return this.otherAlipayDenseyLoginId;
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

	public void setUserDesensitizeName(String userDesensitizeName) {
		this.userDesensitizeName = userDesensitizeName;
	}
	public String getUserDesensitizeName( ) {
		return this.userDesensitizeName;
	}

}
