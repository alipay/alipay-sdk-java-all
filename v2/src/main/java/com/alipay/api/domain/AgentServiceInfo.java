package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体服务信息
 *
 * @author auto create
 * @since 1.0, 2025-11-24 14:54:55
 */
public class AgentServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 6448975997361651913L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private ServiceExtInfoMap extInfos;

	/**
	 * 当服务配置为非直连模式时,才会有值
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 服务的图标
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 服务展示的优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 埋点信息
	 */
	@ApiField("scm_info")
	private String scmInfo;

	/**
	 * 服务的副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 服务的标题/名称
	 */
	@ApiField("title")
	private String title;

	public ServiceExtInfoMap getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(ServiceExtInfoMap extInfos) {
		this.extInfos = extInfos;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getScmInfo() {
		return this.scmInfo;
	}
	public void setScmInfo(String scmInfo) {
		this.scmInfo = scmInfo;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
