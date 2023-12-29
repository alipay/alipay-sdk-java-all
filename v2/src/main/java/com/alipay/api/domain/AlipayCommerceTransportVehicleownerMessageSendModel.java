package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车主服务统一消息发送入口
 *
 * @author auto create
 * @since 1.0, 2020-06-22 17:13:16
 */
public class AlipayCommerceTransportVehicleownerMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 1265346882488327281L;

	/**
	 * 消息条数，需和msg_list数组中消息实际条数保持一致，上限20条
	 */
	@ApiField("batch_size")
	private Long batchSize;

	/**
	 * 敏感字段加密类型，目前支持md5，默认加密字段是msg_list中每条消息的“certificate_number”字段
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 消息列表
	 */
	@ApiListField("msg_list")
	@ApiField("veh_message_entity")
	private List<VehMessageEntity> msgList;

	public Long getBatchSize() {
		return this.batchSize;
	}
	public void setBatchSize(Long batchSize) {
		this.batchSize = batchSize;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public List<VehMessageEntity> getMsgList() {
		return this.msgList;
	}
	public void setMsgList(List<VehMessageEntity> msgList) {
		this.msgList = msgList;
	}

}
