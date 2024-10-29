package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用服务受理结果查询
 *
 * @author auto create
 * @since 1.0, 2024-07-31 16:45:16
 */
public class ZhimaCreditEpAcceptanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6177212958558875577L;

	/**
	 * 一次信用服务受理的唯一标识。
获取方式：调用受理初始化接口时获取，或订阅商户通知接口时获取
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
