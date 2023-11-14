package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 去标请求字段
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:51:52
 */
public class RemoveTagRequest extends AlipayObject {

	private static final long serialVersionUID = 7782622185134982131L;

	/**
	 * biz_id，唯一，业务id，用于业务请求的幂等标志
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 去标类型，PID或SMID
	 */
	@ApiField("type")
	private String type;

	/**
	 * pid或smid的值
	 */
	@ApiField("value")
	private String value;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
