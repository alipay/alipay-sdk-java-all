package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 10:42:07
 */
public class ZhimaCreditPeZmgoAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8427558673145446892L;

	/** 
	 * 芝麻GO协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 芝麻GO业务类型标识
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 芝麻GO协议预计到期时间
	 */
	@ApiField("exp_invalid_time")
	private String expInvalidTime;

	/** 
	 * 商家外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 芝麻GO协议签约时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/** 
	 * 芝麻GO协议生效时间
	 */
	@ApiField("start_time")
	private String startTime;

	/** 
	 * 签约模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setExpInvalidTime(String expInvalidTime) {
		this.expInvalidTime = expInvalidTime;
	}
	public String getExpInvalidTime( ) {
		return this.expInvalidTime;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}
	public Date getSignTime( ) {
		return this.signTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
