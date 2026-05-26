package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起法人授权
 *
 * @author auto create
 * @since 1.0, 2026-01-30 16:32:10
 */
public class AlipayOfflineProviderCollaborateAuthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2361123251582218834L;

	/**
	 * 将要进行设备绑定的smid，其他人将向<a href="https://opendocs.alipay.com/p/03rq2b?pathHash=f91a1cda">完成smid商户实名认证</a>的法人或联系人申请授权。
	 */
	@ApiField("smid")
	private String smid;

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
