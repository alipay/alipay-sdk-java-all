package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用受理页面申请
 *
 * @author auto create
 * @since 1.0, 2024-12-25 11:29:56
 */
public class ZhimaCreditEpAcceptanceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1777597753467173921L;

	/**
	 * 一次受理过程的唯一标识，从受理初始化接口获取
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
