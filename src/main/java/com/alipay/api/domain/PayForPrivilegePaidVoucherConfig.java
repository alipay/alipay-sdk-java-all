package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充享惠业务有偿券配置
 *
 * @author auto create
 * @since 1.0, 2022-03-29 10:46:56
 */
public class PayForPrivilegePaidVoucherConfig extends AlipayObject {

	private static final long serialVersionUID = 8789345537248752844L;

	/**
	 * 消费者充值赠送的该类型有偿券的数量
	 */
	@ApiField("send_count")
	private Long sendCount;

	/**
	 * 有偿券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public Long getSendCount() {
		return this.sendCount;
	}
	public void setSendCount(Long sendCount) {
		this.sendCount = sendCount;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
