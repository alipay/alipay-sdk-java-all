package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户核身信息
 *
 * @author auto create
 * @since 1.0, 2025-11-24 19:57:42
 */
public class UserCertifyInfo extends AlipayObject {

	private static final long serialVersionUID = 4274688914943536568L;

	/**
	 * 核身数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 核身任务ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 核身结果，true通过false不通过
	 */
	@ApiField("result")
	private Boolean result;

	/**
	 * 核身时间，YYYY-MM-DD HH:mm:ss
	 */
	@ApiField("time")
	private String time;

	/**
	 * 认证类型
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
