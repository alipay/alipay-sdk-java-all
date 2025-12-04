package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新藏品
 *
 * @author auto create
 * @since 1.0, 2025-09-04 14:16:21
 */
public class AlipayOfflineProviderNtokenExpoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1149155133513967342L;

	/**
	 * 主活动头图
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 活动Icon
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 子活动ID
	 */
	@ApiField("meeting_timeuuid")
	private String meetingTimeuuid;

	/**
	 * 原始token
	 */
	@ApiField("origin_token")
	private String originToken;

	/**
	 * 收藏包副标题
	 */
	@ApiField("package_subtitle")
	private String packageSubtitle;

	/**
	 * 收藏包标题
	 */
	@ApiField("package_title")
	private String packageTitle;

	/**
	 * 展示模式
	 */
	@ApiField("show_mode")
	private String showMode;

	/**
	 * 收藏链接列表
	 */
	@ApiListField("url_info_list")
	@ApiField("url_info_list")
	private List<UrlInfoList> urlInfoList;

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMeetingTimeuuid() {
		return this.meetingTimeuuid;
	}
	public void setMeetingTimeuuid(String meetingTimeuuid) {
		this.meetingTimeuuid = meetingTimeuuid;
	}

	public String getOriginToken() {
		return this.originToken;
	}
	public void setOriginToken(String originToken) {
		this.originToken = originToken;
	}

	public String getPackageSubtitle() {
		return this.packageSubtitle;
	}
	public void setPackageSubtitle(String packageSubtitle) {
		this.packageSubtitle = packageSubtitle;
	}

	public String getPackageTitle() {
		return this.packageTitle;
	}
	public void setPackageTitle(String packageTitle) {
		this.packageTitle = packageTitle;
	}

	public String getShowMode() {
		return this.showMode;
	}
	public void setShowMode(String showMode) {
		this.showMode = showMode;
	}

	public List<UrlInfoList> getUrlInfoList() {
		return this.urlInfoList;
	}
	public void setUrlInfoList(List<UrlInfoList> urlInfoList) {
		this.urlInfoList = urlInfoList;
	}

}
