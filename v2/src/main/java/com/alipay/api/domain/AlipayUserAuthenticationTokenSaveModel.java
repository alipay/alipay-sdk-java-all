package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号令牌信息保存
 *
 * @author auto create
 * @since 1.0, 2026-08-13 14:52:50
 */
public class AlipayUserAuthenticationTokenSaveModel extends AlipayObject {

	private static final long serialVersionUID = 8169448734738247143L;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务暂存数据
	 */
	@ApiField("biz_obj")
	private String bizObj;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizObj() {
		return this.bizObj;
	}
	public void setBizObj(String bizObj) {
		this.bizObj = bizObj;
	}

}
