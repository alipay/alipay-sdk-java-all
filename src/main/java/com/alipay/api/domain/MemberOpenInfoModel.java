package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通会员配置
 *
 * @author auto create
 * @since 1.0, 2018-11-29 17:44:18
 */
public class MemberOpenInfoModel extends AlipayObject {

	private static final long serialVersionUID = 7624146163975925219L;

	/**
	 * 开卡连接，必须http、https开头
	 */
	@ApiField("open_url")
	private String openUrl;

	public String getOpenUrl() {
		return this.openUrl;
	}
	public void setOpenUrl(String openUrl) {
		this.openUrl = openUrl;
	}

}
