package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报关单查询
 *
 * @author auto create
 * @since 1.0, 2020-05-27 11:39:59
 */
public class AnttechBlockchainDefinTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7673795952182759561L;

	/**
	 * 企业/报关单查询请求 in Json string
	 */
	@ApiField("encoded_biz_param")
	private String encodedBizParam;

	/**
	 * sys_param, 按其中字段function区分查询类型，如企业认证还是报关单查询。
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
