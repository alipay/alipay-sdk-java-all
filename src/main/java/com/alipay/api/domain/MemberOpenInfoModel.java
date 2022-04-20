package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通会员配置
 *
 * @author auto create
 * @since 1.0, 2019-02-20 18:56:19
 */
public class MemberOpenInfoModel extends AlipayObject {

	private static final long serialVersionUID = 2491983984869415361L;

	/**
	 * 开卡连接，必须http、https开头
	 */
	@ApiField("open_url")
	private String openUrl;

	/**
	 * 微信端开卡链接，不能是alipay域名
如果会员模板支持微信端，则必填
	 */
	@ApiField("wechat_open_url")
	private String wechatOpenUrl;

	public String getOpenUrl() {
		return this.openUrl;
	}
	public void setOpenUrl(String openUrl) {
		this.openUrl = openUrl;
	}

	public String getWechatOpenUrl() {
		return this.wechatOpenUrl;
	}
	public void setWechatOpenUrl(String wechatOpenUrl) {
		this.wechatOpenUrl = wechatOpenUrl;
	}

}
