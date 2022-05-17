package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 双链通拍卖业务查询接口
 *
 * @author auto create
 * @since 1.0, 2021-11-20 19:21:23
 */
public class AnttechBlockchainDefinFinancePaimaiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5369775959739554772L;

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
