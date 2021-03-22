package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证引导(页面接口)
 *
 * @author auto create
 * @since 1.0, 2020-07-10 10:17:20
 */
public class ZhimaCustomerEpCertificationCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5561881872789882668L;

	/**
	 * 一次认证的唯一标识，在完成芝麻认证初始化后可以获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
