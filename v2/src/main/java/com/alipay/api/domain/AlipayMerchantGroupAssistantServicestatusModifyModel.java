package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改小助手快捷服务状态
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:31:02
 */
public class AlipayMerchantGroupAssistantServicestatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3536356817499526955L;

	/**
	 * 小助手内容id，创建快捷服务时返回的数据唯一id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 小助手定向消息更新状态 1、INVALID(下线)，下线操作只能在上线后的上线状态才可以下线操作； 2、VALID(上线)，上线操作只能在下线状态下才可以操作； 3、DELETED(删除)，删除操作只能在审核中和失效状态下才可以操作。状态流转如下： VALID(发送完成状态) -> INVALID(下线状态)； INVALID(下线状态) -> VALID(上线状态)； AUDITING(审核中) -> DELETED(删除状态)，INVALID(失效) -> DELETED(删除状态)；
	 */
	@ApiField("status")
	private String status;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
