package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取种子数据内部数据结构
 *
 * @author auto create
 * @since 1.0, 2020-03-24 17:40:26
 */
public class WorldBaseRPCResponseInfo extends AlipayObject {

	private static final long serialVersionUID = 2411966177478932423L;

	/**
	 * 错误信息
	 */
	@ApiField("error_indicator")
	private WorldErrorIndicator errorIndicator;

	/**
	 * 应答扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否调用成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 服务端时间(long型数据)
	 */
	@ApiField("time")
	private Long time;

	public WorldErrorIndicator getErrorIndicator() {
		return this.errorIndicator;
	}
	public void setErrorIndicator(WorldErrorIndicator errorIndicator) {
		this.errorIndicator = errorIndicator;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTime() {
		return this.time;
	}
	public void setTime(Long time) {
		this.time = time;
	}

}
