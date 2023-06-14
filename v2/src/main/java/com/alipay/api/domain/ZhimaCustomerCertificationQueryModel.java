package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻认证查询
 *
 * @author auto create
 * @since 1.0, 2018-08-29 14:41:48
 */
public class ZhimaCustomerCertificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2744578132881631598L;

	/**
	 * 一次认证的唯一标识，在商户调用认证初始化接口的时候获取
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
