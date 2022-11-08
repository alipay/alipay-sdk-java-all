package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 封面故事容器，用于红包详情页
 *
 * @author auto create
 * @since 1.0, 2022-09-01 21:02:48
 */
public class GiftTemplateStoryBox extends AlipayObject {

	private static final long serialVersionUID = 3337289327596736842L;

	/**
	 * 商家跳转链接描述，用于红包详情页
	 */
	@ApiField("link_show_memo")
	private String linkShowMemo;

	/**
	 * 红包详情页商家跳转链接
	 */
	@ApiField("link_to_merchant")
	private String linkToMerchant;

	/**
	 * 封面故事描述，用于红包详情页
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 封面故事视觉资源列表，包含图片、视频等，用于红包详情页
	 */
	@ApiListField("resources")
	@ApiField("gift_template_meta_info")
	private List<GiftTemplateMetaInfo> resources;

	public String getLinkShowMemo() {
		return this.linkShowMemo;
	}
	public void setLinkShowMemo(String linkShowMemo) {
		this.linkShowMemo = linkShowMemo;
	}

	public String getLinkToMerchant() {
		return this.linkToMerchant;
	}
	public void setLinkToMerchant(String linkToMerchant) {
		this.linkToMerchant = linkToMerchant;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<GiftTemplateMetaInfo> getResources() {
		return this.resources;
	}
	public void setResources(List<GiftTemplateMetaInfo> resources) {
		this.resources = resources;
	}

}
