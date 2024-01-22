package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FundBankCardInfoDTO;
import com.alipay.api.domain.WithholdAgreementInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fund.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:11:45
 */
public class AlipayCommerceFundBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5227142561392571448L;

	/** 
	 * 银行卡信息，用户授权银行卡信息后返回
	 */
	@ApiField("bank_card_info")
	private FundBankCardInfoDTO bankCardInfo;

	/** 
	 * 用户绑卡失败时，该字段会返回错误code，需结合code_msg一起排查问题。
	 */
	@ApiField("bind_error_code")
	private String bindErrorCode;

	/** 
	 * 用户绑卡失败时，具体的错误描述会通过该字段返回。错误解决办法请参考接入文档。
	 */
	@ApiField("bind_error_msg")
	private String bindErrorMsg;

	/** 
	 * 用户证件号，和cert_type联合使用
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 绑卡用户的证件类型：0（身份证）
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 商户维度下唯一标识一个用户信息，用户授权后才会返回。
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 外部绑卡流水号，用来标识一次绑卡行为，商户维度下需确保唯一，绑卡接口时传入。
	 */
	@ApiField("out_bind_no")
	private String outBindNo;

	/** 
	 * 绑卡用户的真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/** 
	 * 用户绑卡状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 蚂蚁统一会员ID。用户完成用户信息授权之后，该字段才会返回
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 代扣签约信息，绑卡成功后才会返回该字段。
	 */
	@ApiField("withhold_agreement_info")
	private WithholdAgreementInfoDTO withholdAgreementInfo;

	public void setBankCardInfo(FundBankCardInfoDTO bankCardInfo) {
		this.bankCardInfo = bankCardInfo;
	}
	public FundBankCardInfoDTO getBankCardInfo( ) {
		return this.bankCardInfo;
	}

	public void setBindErrorCode(String bindErrorCode) {
		this.bindErrorCode = bindErrorCode;
	}
	public String getBindErrorCode( ) {
		return this.bindErrorCode;
	}

	public void setBindErrorMsg(String bindErrorMsg) {
		this.bindErrorMsg = bindErrorMsg;
	}
	public String getBindErrorMsg( ) {
		return this.bindErrorMsg;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutBindNo(String outBindNo) {
		this.outBindNo = outBindNo;
	}
	public String getOutBindNo( ) {
		return this.outBindNo;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRealName( ) {
		return this.realName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setWithholdAgreementInfo(WithholdAgreementInfoDTO withholdAgreementInfo) {
		this.withholdAgreementInfo = withholdAgreementInfo;
	}
	public WithholdAgreementInfoDTO getWithholdAgreementInfo( ) {
		return this.withholdAgreementInfo;
	}

}
