package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Push推送渠道参数
 *
 * @author auto create
 * @since 1.0, 2026-06-23 10:02:56
 */
public class PushChannelDTO extends AlipayObject {

	private static final long serialVersionUID = 5854521526289188928L;

	/**
	 * 本次请求的业务id，业务方提供
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 推送类型
	 */
	@ApiField("push_type")
	private String pushType;

	/**
	 * 消息内容
	 */
	@ApiField("template_params")
	private String templateParams;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getPushType() {
		return this.pushType;
	}
	public void setPushType(String pushType) {
		this.pushType = pushType;
	}

	public String getTemplateParams() {
		return this.templateParams;
	}
	public void setTemplateParams(String templateParams) {
		this.templateParams = templateParams;
	}

}
