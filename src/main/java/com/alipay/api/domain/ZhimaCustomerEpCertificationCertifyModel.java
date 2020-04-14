package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证引导(页面接口)
 *
 * @author auto create
 * @since 1.0, 2017-10-27 14:29:07
 */
public class ZhimaCustomerEpCertificationCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5824498556412717434L;

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
