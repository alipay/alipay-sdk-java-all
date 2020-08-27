package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户授权的开放表单信息
 *
 * @author auto create
 * @since 1.0, 2020-06-19 13:47:29
 */
public class AlipayMarketingCardActivateformQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2392896489171566311L;

	/**
	 * 开放表单信息查询业务类型，可选类型如下：
MEMBER_CARD -- 会员卡开卡
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询用户表单提交信息的请求id，在用户授权表单确认提交后跳转商户页面url时返回此参数。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
	 */
	@ApiField("template_id")
	private String templateId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
