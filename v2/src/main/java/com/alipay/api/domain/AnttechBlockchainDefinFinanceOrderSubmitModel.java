package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融场景订单提交
 *
 * @author auto create
 * @since 1.0, 2022-10-10 18:42:27
 */
public class AnttechBlockchainDefinFinanceOrderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2847778972188838697L;

	/**
	 * 业务参数
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
