package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业云配置单项检测结果
 *
 * @author auto create
 * @since 1.0, 2023-07-10 09:38:13
 */
public class BpaasConfSingleCheckResult extends AlipayObject {

	private static final long serialVersionUID = 4177791957945563998L;

	/**
	 * 单项检测失败的原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 行业云单项配置检查是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 单项检测失败之后的操作提示
	 */
	@ApiField("tips")
	private String tips;

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

}
