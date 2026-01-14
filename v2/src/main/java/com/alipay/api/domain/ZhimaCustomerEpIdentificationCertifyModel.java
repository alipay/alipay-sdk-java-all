package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证V2执行
 *
 * @author auto create
 * @since 1.0, 2022-04-15 12:01:50
 */
public class ZhimaCustomerEpIdentificationCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 8687394297775349377L;

	/**
	 * 一次认证的唯一标识，在完成企业认证初始化后可以获取。
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
