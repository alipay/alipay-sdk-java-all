package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户授权的开放表单信息
 *
 * @author auto create
 * @since 1.0, 2024-04-10 16:31:32
 */
public class AlipayMarketingCardActivateformQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7118241964885724898L;

	/**
	 * 开放表单信息查询业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询用户表单提交信息的请求id。

网页移动应用&小程序应用：与auth_code  一起通过alipay.marketing.card.activateurl.apply(获取会员卡领卡投放链接)接口callback地址回传。

注意：auth_code（用户授权码）用于换取用户授权令牌 accessToken，后续调用接口需传入accessToken。
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
