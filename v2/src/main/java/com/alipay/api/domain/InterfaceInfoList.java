package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口信息列表，停车业务需要配置的接口列表，该值为JSON数据格式的LIST对象，现阶段只需要配置一个页面接口即可 。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。
 *
 * @author auto create
 * @since 1.0, 2020-10-16 10:28:13
 */
public class InterfaceInfoList extends AlipayObject {

	private static final long serialVersionUID = 7324231978532779792L;

	/**
	 * H5传入参数固定值：alipay.eco.mycar.parking.userpage.query;

小程序传入参数固定值：alipay.eco.mycar.parking.isv.homepage;

协议状态变更通知传入参数固定值：
alipay.eco.mycar.parking.agreement.notify;
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * H5、小程序传入参数固定值:interface_page；
通知接口传入参数固定值:interface_service;
	 */
	@ApiField("interface_type")
	private String interfaceType;

	/**
	 * H5 SPI接口的调用地址url，协议必须为https，对整个url字符串必须进行UrlEncode编码。编码为UTF-8;

小程序SPI接口的调用地址ur格式：小程序|小程序缴费页面地址;

协议状态变更通知SPI接口的调用地址url，同H5格式;
	 */
	@ApiField("interface_url")
	private String interfaceUrl;

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

	public String getInterfaceUrl() {
		return this.interfaceUrl;
	}
	public void setInterfaceUrl(String interfaceUrl) {
		this.interfaceUrl = interfaceUrl;
	}

}
