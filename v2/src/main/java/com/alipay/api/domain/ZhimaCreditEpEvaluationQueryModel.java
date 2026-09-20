package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业数据知识产权评价信息查询
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:34:25
 */
public class ZhimaCreditEpEvaluationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6692748654824454946L;

	/**
	 * 渠道码,联系bd分配
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业证件号，来自工商信息，优先取统一社会代码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

}
