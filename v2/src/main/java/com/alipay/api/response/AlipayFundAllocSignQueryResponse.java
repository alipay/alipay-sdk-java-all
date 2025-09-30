package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AgreementLimitMerchant;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.alloc.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:12:38
 */
public class AlipayFundAllocSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3588876981829655279L;

	/** 
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 抽佣比例上限
	 */
	@ApiField("alloc_upper_limit")
	private String allocUpperLimit;

	/** 
	 * 授权协议的失效时间
	 */
	@ApiField("invalid_time")
	private Date invalidTime;

	/** 
	 * 授权主体uid
	 */
	@ApiField("principal_id")
	private String principalId;

	/** 
	 * 授权主体 openId
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/** 
	 * 协议状态：
 SUCESS -成功
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 支持的交易商户列表,包含
1. 商户类型：PID - 直联商户，SMID - 间联商户
2. 商户ID
	 */
	@ApiListField("support_merchant_list")
	@ApiField("agreement_limit_merchant")
	private List<AgreementLimitMerchant> supportMerchantList;

	/** 
	 * 协议签约时间
	 */
	@ApiField("valid_strat_time")
	private Date validStratTime;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAllocUpperLimit(String allocUpperLimit) {
		this.allocUpperLimit = allocUpperLimit;
	}
	public String getAllocUpperLimit( ) {
		return this.allocUpperLimit;
	}

	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}
	public Date getInvalidTime( ) {
		return this.invalidTime;
	}

	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}
	public String getPrincipalId( ) {
		return this.principalId;
	}

	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
	}
	public String getPrincipalOpenId( ) {
		return this.principalOpenId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSupportMerchantList(List<AgreementLimitMerchant> supportMerchantList) {
		this.supportMerchantList = supportMerchantList;
	}
	public List<AgreementLimitMerchant> getSupportMerchantList( ) {
		return this.supportMerchantList;
	}

	public void setValidStratTime(Date validStratTime) {
		this.validStratTime = validStratTime;
	}
	public Date getValidStratTime( ) {
		return this.validStratTime;
	}

}
