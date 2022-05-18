package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员模板门店绑定
 *
 * @author auto create
 * @since 1.0, 2018-11-30 15:37:04
 */
public class KoubeiMarketingCampaignMemberTemplateBindModel extends AlipayObject {

	private static final long serialVersionUID = 8769363192415365316L;

	/**
	 * 将门店绑定到会员模板上，跟remove_shop_ids不可同时为空
	 */
	@ApiListField("add_shop_ids")
	@ApiField("string")
	private List<String> addShopIds;

	/**
	 * 会员模板id
	 */
	@ApiField("member_template_id")
	private String memberTemplateId;

	/**
	 * 将门店与会员模板解绑，跟add_shop_ids不可同时为空
	 */
	@ApiListField("remove_shop_ids")
	@ApiField("string")
	private List<String> removeShopIds;

	/**
	 * 请求ID，由开发者生成并保证唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	public List<String> getAddShopIds() {
		return this.addShopIds;
	}
	public void setAddShopIds(List<String> addShopIds) {
		this.addShopIds = addShopIds;
	}

	public String getMemberTemplateId() {
		return this.memberTemplateId;
	}
	public void setMemberTemplateId(String memberTemplateId) {
		this.memberTemplateId = memberTemplateId;
	}

	public List<String> getRemoveShopIds() {
		return this.removeShopIds;
	}
	public void setRemoveShopIds(List<String> removeShopIds) {
		this.removeShopIds = removeShopIds;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
