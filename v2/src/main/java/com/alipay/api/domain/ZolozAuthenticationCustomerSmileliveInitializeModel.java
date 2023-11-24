package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸初始化唤起zim
 *
 * @author auto create
 * @since 1.0, 2023-04-03 15:37:47
 */
public class ZolozAuthenticationCustomerSmileliveInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7228325664277447199L;

	/**
	 * { "apdidToken": "设备指纹", "appName": "应用名称", "appVersion": "应用版本", "bioMetaInfo": "生物信息如2.3.0:3,-4" }
	 */
	@ApiField("zimmetainfo")
	private String zimmetainfo;

	public String getZimmetainfo() {
		return this.zimmetainfo;
	}
	public void setZimmetainfo(String zimmetainfo) {
		this.zimmetainfo = zimmetainfo;
	}

}
