package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CaptchaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.operator.img.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataFindataOperatorImgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3228264346325284193L;

	/** 
	 * 系统业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 图片验证码信息
	 */
	@ApiField("captcha")
	private CaptchaInfo captcha;

	/** 
	 * 商户系统的业务流水号
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCaptcha(CaptchaInfo captcha) {
		this.captcha = captcha;
	}
	public CaptchaInfo getCaptcha( ) {
		return this.captcha;
	}

	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}
	public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

}
