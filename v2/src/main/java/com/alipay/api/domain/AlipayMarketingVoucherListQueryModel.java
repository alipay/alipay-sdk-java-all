package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券列表
 *
 * @author auto create
 * @since 1.0, 2024-12-24 15:47:07
 */
public class AlipayMarketingVoucherListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4751224187568588768L;

	/**
	 * 支付宝用户的openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 券模板 id，可通过<a href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.voucher.templatelist.query">alipay.marketing.voucher.templatelist.query</a>(查询券模板列表)接口查询获取。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 支付宝用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
