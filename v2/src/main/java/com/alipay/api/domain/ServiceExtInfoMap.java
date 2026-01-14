package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展参数map
 *
 * @author auto create
 * @since 1.0, 2025-11-24 14:54:55
 */
public class ServiceExtInfoMap extends AlipayObject {

	private static final long serialVersionUID = 4513746863914931391L;

	/**
	 * 服务图片
	 */
	@ApiField("service_pic")
	private String servicePic;

	public String getServicePic() {
		return this.servicePic;
	}
	public void setServicePic(String servicePic) {
		this.servicePic = servicePic;
	}

}
