package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游内容对接-飞猪开店信息回调接口
 *
 * @author auto create
 * @since 1.0, 2020-04-03 11:17:17
 */
public class AlipayOverseasTravelFliggyStoreModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3848791482847493539L;

	/**
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 主体数据
	 */
	@ApiField("data")
	private StoreInfo data;

	/**
	 * 请求消息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public StoreInfo getData() {
		return this.data;
	}
	public void setData(StoreInfo data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
