package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡领卡链接获取接口
 *
 * @author auto create
 * @since 1.0, 2021-05-11 20:16:35
 */
public class AlipayMarketingCardActivateurlApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2293659453339673136L;

	/**
	 * 会员卡开卡表单提交后回调地址。
说明：
1.该地址不可带参数，如需回传参数，可设置out_string入参。
2.小程序应用无需传入。
	 */
	@ApiField("callback")
	private String callback;

	/**
	 * 需要关注的生活号AppId。若需要在领卡页面展示“关注生活号”提示，需开通生活号并绑定会员卡。生活号快速接入详见：https://doc.open.alipay.com/docs/doc.htm?treeId=193&articleId=105933&docType=1
	 */
	@ApiField("follow_app_id")
	private String followAppId;

	/**
	 * 扩展信息，会员领卡完成后将此参数原样带回商户页面。
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
