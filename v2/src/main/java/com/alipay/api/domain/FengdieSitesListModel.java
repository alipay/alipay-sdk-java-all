package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云凤蝶站点列表信息模型
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:45
 */
public class FengdieSitesListModel extends AlipayObject {

	private static final long serialVersionUID = 8711581321859428561L;

	/**
	 * 站点发生修改的时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 站点 ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 站点是否已经上线，true 表示已经上线
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/**
	 * 站点下线时间
	 */
	@ApiField("offline_time")
	private String offlineTime;

	/**
	 * 创建者信息
	 */
	@ApiField("owner")
	private FengdieSitesOwner owner;

	/**
	 * 包含这些状态：OPEN: 可编辑状态；
    COMPLETE: 编辑完成预览状态；
    PRERELEASED: 活动预发布中，预发布并不会把活动发布到线上；
    PRERELEASE_FAIL: 活动预发布失败；
    RELEASING: 活动正式发布中，正式发布与预发布的区别在于正式发布成功后活动就上线了；
    RELEASE_FAIL: 活动正式发布失败；
    RELEASED: 活动已经发布上线；
    DISCARDED: 活动已废弃，废弃的活动无法通过 URL 访问
	 */
	@ApiField("status")
	private String status;

	/**
	 * 站点模板名
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 当前站点模板包采用的具体版本
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 站点标题
	 */
	@ApiField("title")
	private String title;

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsOnline() {
		return this.isOnline;
	}
	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getOfflineTime() {
		return this.offlineTime;
	}
	public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

	public FengdieSitesOwner getOwner() {
		return this.owner;
	}
	public void setOwner(FengdieSitesOwner owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
