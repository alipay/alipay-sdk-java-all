package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应收账款融资业务提交
 *
 * @author auto create
 * @since 1.0, 2023-08-09 21:43:15
 */
public class AnttechBlockchainDefinFinanceArSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8822498936952863665L;

	/**
	 * base64编码的业务参数
	 */
	@ApiField("encoded_biz_param")
	private String encodedBizParam;

	/**
	 * 系统参数
	 */
	@ApiField("sys_param")
	private SystemParam sysParam;

	public String getEncodedBizParam() {
		return this.encodedBizParam;
	}
	public void setEncodedBizParam(String encodedBizParam) {
		this.encodedBizParam = encodedBizParam;
	}

	public SystemParam getSysParam() {
		return this.sysParam;
	}
	public void setSysParam(SystemParam sysParam) {
		this.sysParam = sysParam;
	}

}
