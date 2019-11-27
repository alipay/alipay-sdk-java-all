package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证书安装初始化response
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:03
 */
public class AlipaySecurityProdCertCsrApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2669565981549812639L;

	/**
	 * ifaf_message:注册阶段客户端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含客户端的校验数据。
	 */
	@ApiField("ifaf_message")
	private String ifafMessage;

	public String getIfafMessage() {
		return this.ifafMessage;
	}
	public void setIfafMessage(String ifafMessage) {
		this.ifafMessage = ifafMessage;
	}

}
