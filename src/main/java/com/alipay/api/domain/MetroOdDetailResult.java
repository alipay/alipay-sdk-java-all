package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-04-14 15:40:13
 */
public class MetroOdDetailResult extends AlipayObject {

	private static final long serialVersionUID = 6829713164756568261L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果
	 */
	@ApiListField("data")
	@ApiField("metro_od_item")
	private List<MetroOdItem> data;

	/**
	 * 消息描述
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<MetroOdItem> getData() {
		return this.data;
	}
	public void setData(List<MetroOdItem> data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
