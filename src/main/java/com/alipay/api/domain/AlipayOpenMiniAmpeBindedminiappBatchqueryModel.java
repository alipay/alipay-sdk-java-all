package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询绑定的小程序列表信息
 *
 * @author auto create
 * @since 1.0, 2020-06-08 09:52:14
 */
public class AlipayOpenMiniAmpeBindedminiappBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3772788296155756667L;

	/**
	 * 移动应用ID，必填
	 */
	@ApiField("mobile_app_id")
	private String mobileAppId;

	public String getMobileAppId() {
		return this.mobileAppId;
	}
	public void setMobileAppId(String mobileAppId) {
		this.mobileAppId = mobileAppId;
	}

}
