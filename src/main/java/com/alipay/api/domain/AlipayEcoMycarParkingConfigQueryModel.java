package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV系统配置查询接口
 *
 * @author auto create
 * @since 1.0, 2020-12-31 16:26:51
 */
public class AlipayEcoMycarParkingConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6721443937118229715L;

	/**
	 * 接口名称。H5传入参数固定值：alipay.eco.mycar.parking.userpage.query；
小程序传入参数固定值：alipay.eco.mycar.parking.isv.homepage；
协议状态变更通知传入参数固定值： alipay.eco.mycar.parking.agreement.notify。
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * 接口类型。H5、小程序传入参数固定值：interface_page；
通知接口传入参数固定值：interface_service。
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
