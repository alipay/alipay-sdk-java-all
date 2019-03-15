package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口信息列表，停车业务需要配置的接口列表，该值为JSON数据格式的LIST对象，现阶段只需要配置一个页面接口即可 。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。
 *
 * @author auto create
 * @since 1.0, 2017-06-13 15:26:13
 */
public class InterfaceInfoList extends AlipayObject {

	private static final long serialVersionUID = 4821176728867515856L;

	/**
	 * 传入参数固定值:alipay.eco.mycar.parking.userpage.query
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * 传入参数固定值:interface_page
	 */
	@ApiField("interface_type")
	private String interfaceType;

	/**
	 * SPI接口的调用地址url，协议必须为https，对整个url字符串必须进行UrlEncode编码。编码为UTF-8
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
