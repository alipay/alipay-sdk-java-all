package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭租户开通的isv服务接口
 *
 * @author auto create
 * @since 1.0, 2020-10-19 16:43:58
 */
public class AlipayIserviceCcmServiceCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3184559483448494376L;

	/**
	 * 服务代码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
