package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基础数据服务-数据验真
 *
 * @author auto create
 * @since 1.0, 2021-08-12 11:14:24
 */
public class AnttechBlockchainDefinDataserviceVerifySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7686693853639391885L;

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
