package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证查询
 *
 * @author auto create
 * @since 1.0, 2022-04-15 12:02:02
 */
public class ZhimaCustomerEpIdentificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1243624121881937334L;

	/**
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取。
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
