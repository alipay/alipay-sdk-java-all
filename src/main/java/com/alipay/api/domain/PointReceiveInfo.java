package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分领取结果
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:20:04
 */
public class PointReceiveInfo extends AlipayObject {

	private static final long serialVersionUID = 8857386389671996423L;

	/**
	 * 处理结果描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 领取积分数量
	 */
	@ApiField("received_point_amount")
	private Long receivedPointAmount;

	/**
	 * 领取结果,true:成功，false:失败
	 */
	@ApiField("result")
	private Boolean result;

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getReceivedPointAmount() {
		return this.receivedPointAmount;
	}
	public void setReceivedPointAmount(Long receivedPointAmount) {
		this.receivedPointAmount = receivedPointAmount;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

}
