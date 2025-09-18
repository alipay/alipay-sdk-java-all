package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 城服用户消息触达
 *
 * @author auto create
 * @since 1.0, 2024-06-17 14:00:16
 */
public class AlipayEcoCityserviceMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 2588819135415484593L;

	/**
	 * 消息条数，默认1，需和msg_list数组中消息实际条数保持一致，上限1000条
	 */
	@ApiField("batch_size")
	private Long batchSize;

	/**
	 * 敏感字段加密类型，目前支持md5,sm3;
值为md5时，certificate_number需传入md5值，certificate_username传入未加密值
值为sm3时，certificate_number+certificate_username均需传入sm3加密后值
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 消息列表
	 */
	@ApiListField("msg_list")
	@ApiField("alipay_eco_message_entity")
	private List<AlipayEcoMessageEntity> msgList;

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

	public List<AlipayEcoMessageEntity> getMsgList() {
		return this.msgList;
	}
	public void setMsgList(List<AlipayEcoMessageEntity> msgList) {
		this.msgList = msgList;
	}

}
