package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报名提交的小程序商品
 *
 * @author auto create
 * @since 1.0, 2023-05-09 21:05:29
 */
public class RecruitContentAppItem extends AlipayObject {

	private static final long serialVersionUID = 2197443263394929574L;

	/**
	 * 小程序商品配置信息列表。
	 */
	@ApiListField("content_configs")
	@ApiField("recruit_content_config")
	private List<RecruitContentConfig> contentConfigs;

	/**
	 * 支付宝侧的商品ID。推荐传item_id。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商家侧小程序商品的spu，即商家侧小程序商品id。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商家侧小程序商品归属的小程序ID。
	 */
	@ApiField("related_app_id")
	private String relatedAppId;

	public List<RecruitContentConfig> getContentConfigs() {
		return this.contentConfigs;
	}
	public void setContentConfigs(List<RecruitContentConfig> contentConfigs) {
		this.contentConfigs = contentConfigs;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getRelatedAppId() {
		return this.relatedAppId;
	}
	public void setRelatedAppId(String relatedAppId) {
		this.relatedAppId = relatedAppId;
	}

}
