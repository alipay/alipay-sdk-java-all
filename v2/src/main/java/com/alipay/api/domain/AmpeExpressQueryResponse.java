package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMPE快递包裹查询结果
 *
 * @author auto create
 * @since 1.0, 2021-09-02 14:31:57
 */
public class AmpeExpressQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 2344178735282475273L;

	/**
	 * 快递包裹状态
	 */
	@ApiField("code")
	private String code;

	/**
	 * 包裹数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 状态描述
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
