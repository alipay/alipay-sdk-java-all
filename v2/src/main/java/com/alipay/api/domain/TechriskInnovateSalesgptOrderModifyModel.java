package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内购小程序外部商户订单信息上传
 *
 * @author auto create
 * @since 1.0, 2023-09-14 14:11:19
 */
public class TechriskInnovateSalesgptOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8234755618718199699L;

	/**
	 * 详细内容数据
	 */
	@ApiField("content")
	private OrderSubmitContent content;

	/**
	 * 请求接口名称
	 */
	@ApiField("method_name")
	private String methodName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public OrderSubmitContent getContent() {
		return this.content;
	}
	public void setContent(OrderSubmitContent content) {
		this.content = content;
	}

	public String getMethodName() {
		return this.methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
