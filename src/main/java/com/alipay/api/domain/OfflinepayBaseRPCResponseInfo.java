package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权码基础请求响应信息模型
 *
 * @author auto create
 * @since 1.0, 2020-03-18 15:45:34
 */
public class OfflinepayBaseRPCResponseInfo extends AlipayObject {

	private static final long serialVersionUID = 7789481361848936161L;

	/**
	 * 错误指示器
	 */
	@ApiField("error_indicator")
	private OfflinepayErrorIndicator errorIndicator;

	/**
	 * 应答扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否调用成功
	 */
	@ApiField("success")
	private String success;

	/**
	 * 服务端时间
	 */
	@ApiField("time")
	private Long time;

	public OfflinepayErrorIndicator getErrorIndicator() {
		return this.errorIndicator;
	}
	public void setErrorIndicator(OfflinepayErrorIndicator errorIndicator) {
		this.errorIndicator = errorIndicator;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSuccess() {
		return this.success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

	public Long getTime() {
		return this.time;
	}
	public void setTime(Long time) {
		this.time = time;
	}

}
