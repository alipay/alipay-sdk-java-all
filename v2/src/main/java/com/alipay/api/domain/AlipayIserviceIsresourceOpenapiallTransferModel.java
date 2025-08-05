package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isresource应用服务facade接口
 *
 * @author auto create
 * @since 1.0, 2025-05-08 16:34:54
 */
public class AlipayIserviceIsresourceOpenapiallTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2379294927223971269L;

	/**
	 * 接口名#方法名
	 */
	@ApiField("action")
	private String action;

	/**
	 * JSON序列化后的入参
	 */
	@ApiField("params")
	private String params;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 星云系统用户id，1088码
	 */
	@ApiField("ur_id")
	private String urId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUrId() {
		return this.urId;
	}
	public void setUrId(String urId) {
		this.urId = urId;
	}

}
