package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 向风控发送异步安全数据
 *
 * @author auto create
 * @since 1.0, 2017-09-14 19:24:48
 */
public class AlipaySecurityDataDatabusSendModel extends AlipayObject {

	private static final long serialVersionUID = 5884468918439739599L;

	/**
	 * 安全累计属性列表字段，安全属性列表，key为属性名称，value为属性值；如 key:"145" ，value:"1"
	 */
	@ApiField("security_content")
	private String securityContent;

	/**
	 * 代码发送给安全核心的事件编码
	 */
	@ApiField("security_sign")
	private String securitySign;

	public String getSecurityContent() {
		return this.securityContent;
	}
	public void setSecurityContent(String securityContent) {
		this.securityContent = securityContent;
	}

	public String getSecuritySign() {
		return this.securitySign;
	}
	public void setSecuritySign(String securitySign) {
		this.securitySign = securitySign;
	}

}
