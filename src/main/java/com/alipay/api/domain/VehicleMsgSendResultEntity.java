package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主服务统一消息的批量发送结果
 *
 * @author auto create
 * @since 1.0, 2020-03-06 14:28:01
 */
public class VehicleMsgSendResultEntity extends AlipayObject {

	private static final long serialVersionUID = 5331686363843267958L;

	/**
	 * identity字段：值为不大于64位的保证唯一的字符串；该字段用于保证消息唯一性，防止消息重复推送，相当于业务流水号，由接入方自行生成
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 消息如果投递失败的提示信息
	 */
	@ApiField("result")
	private String result;

	/**
	 * 投递结果，车主服务是否成功接收消息请求
	 */
	@ApiField("success")
	private Boolean success;

	public String getOutMsgId() {
		return this.outMsgId;
	}
	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
