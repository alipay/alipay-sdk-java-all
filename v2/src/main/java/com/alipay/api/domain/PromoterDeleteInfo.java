package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店推广员解除绑定处理结果
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:19:42
 */
public class PromoterDeleteInfo extends AlipayObject {

	private static final long serialVersionUID = 3683987435339263172L;

	/**
	 * 处理结果描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 处理结果,true:成功，false:失败
	 */
	@ApiField("result")
	private Boolean result;

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

}
