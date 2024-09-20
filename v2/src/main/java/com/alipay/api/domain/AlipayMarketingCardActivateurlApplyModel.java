package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡领卡链接获取接口
 *
 * @author auto create
 * @since 1.0, 2024-04-10 16:33:01
 */
public class AlipayMarketingCardActivateurlApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4748351223739417662L;

	/**
	 * 会员卡开卡表单提交后回调地址。要求必须是单纯的服务端接收回调。
说明：
1.该地址不可带参数，如需回传参数，可设置out_string入参。
	 */
	@ApiField("callback")
	private String callback;

	/**
	 * 需要关注的生活号AppId。若需要在领卡页面展示“关注生活号”提示，需开通生活号并绑定会员卡。生活号快速接入详见：https://doc.open.alipay.com/docs/doc.htm?treeId=193&articleId=105933&docType=1
	 */
	@ApiField("follow_app_id")
	private String followAppId;

	/**
	 * 该值为商家拉起开卡组件的传递的 out_string  值。通常可用于区分不同业务场景，禁止将该字段作为开卡流程的必要字段，否则会导致会员推广场景下的入会失败
	 */
	@ApiField("out_string")
	private String outString;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCallback() {
		return this.callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getFollowAppId() {
		return this.followAppId;
	}
	public void setFollowAppId(String followAppId) {
		this.followAppId = followAppId;
	}

	public String getOutString() {
		return this.outString;
	}
	public void setOutString(String outString) {
		this.outString = outString;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
