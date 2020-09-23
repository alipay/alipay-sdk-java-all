package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV系统配置查询接口
 *
 * @author auto create
 * @since 1.0, 2020-07-02 11:10:27
 */
public class AlipayEcoMycarParkingConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4642951247856671957L;

	/**
	 * H5传入参数固定值：alipay.eco.mycar.parking.userpage.query

小程序传入参数固定值：alipay.eco.mycar.parking.isv.homepage
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * 传入参数固定值:interface_page
	 */
	@ApiField("interface_type")
	private String interfaceType;

	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getInterfaceType() {
		return this.interfaceType;
	}
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

}
