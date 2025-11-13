package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户付款码皮肤信息
 *
 * @author auto create
 * @since 1.0, 2021-12-14 15:22:30
 */
public class UserFacePaySkinInfo extends AlipayObject {

	private static final long serialVersionUID = 7675938451272487233L;

	/**
	 * 支持该皮肤的客户端最低版本
	 */
	@ApiField("client_version_limit")
	private String clientVersionLimit;

	/**
	 * 北京时间皮肤过期日期(yyyy-MM-dd)，当日的23点59分59秒，若未领取/未授权 字段为空
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 皮肤名称001
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户去查看,去设置的跳转地址
	 */
	@ApiField("setting_link")
	private String settingLink;

	/**
	 * 皮肤ID
	 */
	@ApiField("skin_id")
	private String skinId;

	/**
	 * 0-未授权时状态
1-未领取
2-已领取&未设置
3-已领取&已设置
	 */
	@ApiField("status")
	private String status;

	/**
	 * 缩略图
	 */
	@ApiField("thumbnail")
	private String thumbnail;

	public String getClientVersionLimit() {
		return this.clientVersionLimit;
	}
	public void setClientVersionLimit(String clientVersionLimit) {
		this.clientVersionLimit = clientVersionLimit;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSettingLink() {
		return this.settingLink;
	}
	public void setSettingLink(String settingLink) {
		this.settingLink = settingLink;
	}

	public String getSkinId() {
		return this.skinId;
	}
	public void setSkinId(String skinId) {
		this.skinId = skinId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getThumbnail() {
		return this.thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
