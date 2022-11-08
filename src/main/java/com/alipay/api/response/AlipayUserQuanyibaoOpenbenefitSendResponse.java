package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.quanyibao.openbenefit.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-22 19:14:17
 */
public class AlipayUserQuanyibaoOpenbenefitSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2471787336128877874L;

	/** 
	 * 权益宝权益发放的业务号，与入参中third_biz_no关联且唯一
	 */
	@ApiField("send_biz_no")
	private String sendBizNo;

	/** 
	 * 标识权益的发放状态，process是中间态，表示可重试，FAILED和SUCCESS表示终态
	 */
	@ApiField("send_status")
	private String sendStatus;

	public void setSendBizNo(String sendBizNo) {
		this.sendBizNo = sendBizNo;
	}
	public String getSendBizNo( ) {
		return this.sendBizNo;
	}

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getSendStatus( ) {
		return this.sendStatus;
	}

}
