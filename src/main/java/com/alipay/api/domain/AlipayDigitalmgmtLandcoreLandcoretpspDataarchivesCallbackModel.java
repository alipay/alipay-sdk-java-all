package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测结果回调
 *
 * @author auto create
 * @since 1.0, 2022-10-19 10:03:27
 */
public class AlipayDigitalmgmtLandcoreLandcoretpspDataarchivesCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 8833885294137171699L;

	/**
	 * 用于标识业务系统中归档数据唯一ID
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 状态对应的说明
	 */
	@ApiField("message_content")
	private String messageContent;

	/**
	 * 用于标识反馈结果状态，状态码信息描述见接口说明
	 */
	@ApiField("status")
	private String status;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getMessageContent() {
		return this.messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
