package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用物品实体
 *
 * @author auto create
 * @since 1.0, 2022-10-31 14:17:32
 */
public class GenericItem extends AlipayObject {

	private static final long serialVersionUID = 7791675359956552169L;

	/**
	 * 物品内容，用于搜索
	 */
	@ApiField("content")
	private String content;

	/**
	 * 支付宝小程序的详情页面
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 物品的唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 归属的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 状态，1为有效、0为无效
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
