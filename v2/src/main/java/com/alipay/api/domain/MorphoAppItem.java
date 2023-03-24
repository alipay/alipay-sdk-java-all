package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶应用列表返回数据项
 *
 * @author auto create
 * @since 1.0, 2019-12-10 16:02:33
 */
public class MorphoAppItem extends AlipayObject {

	private static final long serialVersionUID = 1146712696784323527L;

	/**
	 * 应用更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 闪蝶应用ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 小程序源数据
	 */
	@ApiField("mini_meta")
	private MorphoMiniMeta miniMeta;

	/**
	 * 应用上线状态
	 */
	@ApiField("online_state")
	private Long onlineState;

	/**
	 * 闪蝶用户数据
	 */
	@ApiField("owner")
	private MorphoUser owner;

	/**
	 * 应用状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 闪蝶应用名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 应用类型
	 */
	@ApiField("type")
	private String type;

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public MorphoMiniMeta getMiniMeta() {
		return this.miniMeta;
	}
	public void setMiniMeta(MorphoMiniMeta miniMeta) {
		this.miniMeta = miniMeta;
	}

	public Long getOnlineState() {
		return this.onlineState;
	}
	public void setOnlineState(Long onlineState) {
		this.onlineState = onlineState;
	}

	public MorphoUser getOwner() {
		return this.owner;
	}
	public void setOwner(MorphoUser owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
