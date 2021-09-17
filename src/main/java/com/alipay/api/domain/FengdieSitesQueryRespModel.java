package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶站点查询返回值
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:57:36
 */
public class FengdieSitesQueryRespModel extends AlipayObject {

	private static final long serialVersionUID = 7765811918275348871L;

	/**
	 * 云凤蝶模板的最近修改日期
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 云凤蝶模板ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 云凤蝶模板是否上线的状态
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/**
	 * 云凤蝶模板的下线日期
	 */
	@ApiField("offline_time")
	private String offlineTime;

	/**
	 * 云凤蝶模板的负责人
	 */
	@ApiField("owner")
	private FengdieSitesOwner owner;

	/**
	 * 云凤蝶模板中所包含的页面
	 */
	@ApiListField("pages")
	@ApiField("fengdie_sites_page_model")
	private List<FengdieSitesPageModel> pages;

	/**
	 * 云凤蝶模板的当前状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 云凤蝶模板的名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 云凤蝶模板的版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 云凤蝶模板的标题
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

	public List<FengdieSitesPageModel> getPages() {
		return this.pages;
	}
	public void setPages(List<FengdieSitesPageModel> pages) {
		this.pages = pages;
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
