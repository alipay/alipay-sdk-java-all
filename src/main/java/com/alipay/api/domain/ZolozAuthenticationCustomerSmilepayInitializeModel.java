package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸初始化唤起zim
 *
 * @author auto create
 * @since 1.0, 2021-12-20 10:02:44
 */
public class ZolozAuthenticationCustomerSmilepayInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5133776866673619981L;

	/**
	 * 刷脸服务Id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 商户可传入刷脸服务所需的扩展参数，json格式
	 */
	@ApiField("service_params")
	private String serviceParams;

	/**
	 * { "apdidToken": "设备指纹", "appName": "应用名称", "appVersion": "应用版本", "bioMetaInfo": "生物信息如2.3.0:3,-4" }
	 */
	@ApiField("zimmetainfo")
	private String zimmetainfo;

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceParams() {
		return this.serviceParams;
	}
	public void setServiceParams(String serviceParams) {
		this.serviceParams = serviceParams;
	}

	public String getZimmetainfo() {
		return this.zimmetainfo;
	}
	public void setZimmetainfo(String zimmetainfo) {
		this.zimmetainfo = zimmetainfo;
	}

}
