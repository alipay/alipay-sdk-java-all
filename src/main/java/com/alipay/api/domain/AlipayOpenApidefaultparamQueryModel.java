package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询接口默认入参
 *
 * @author auto create
 * @since 1.0, 2022-06-09 14:51:45
 */
public class AlipayOpenApidefaultparamQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3415796428885817298L;

	/**
	 * 接口名称
	 */
	@ApiField("interface_name")
	private String interfaceName;

	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

}
