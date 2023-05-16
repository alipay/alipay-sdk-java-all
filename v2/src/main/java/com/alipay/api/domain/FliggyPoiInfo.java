package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 飞猪POI信息，包含poi Id, 同步成功/失败，及成功失败msg
 *
 * @author auto create
 * @since 1.0, 2019-11-07 13:42:39
 */
public class FliggyPoiInfo extends AlipayObject {

	private static final long serialVersionUID = 6749696584443493298L;

	/**
	 * 业务code标识poi同步结果
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 飞猪poi同步消息,失败时为失败原因
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 1. 首次poi同步成功则必须返回poiId，失败则需返回结果为失败，及错误原因；
2 后续poi同步成功/失败，均需返回。
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 本次同步poi的结果，成功或失败，成功则必须返回poi_id。
	 */
	@ApiField("success")
	private Boolean success;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
