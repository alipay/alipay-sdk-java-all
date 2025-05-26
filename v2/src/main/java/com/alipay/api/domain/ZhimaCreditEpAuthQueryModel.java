package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询芝麻企业信用企业主授权数据
 *
 * @author auto create
 * @since 1.0, 2025-04-24 19:03:55
 */
public class ZhimaCreditEpAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2155942229796216535L;

	/**
	 * 企业信用赋予的唯一业务标识id，在企信小程序跳转到对方承接页时会带有bizNo，对方通过该方式获取该唯一id
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 要查询授权数据的统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

}
