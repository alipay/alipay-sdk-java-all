package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 酒店智慧住集团信息同步
 *
 * @author auto create
 * @since 1.0, 2025-10-24 14:27:41
 */
public class AlipayCommerceHotelLockerGroupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3779262897633913186L;

	/**
	 * 支付宝Pid
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 小程序logo
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * null
	 */
	@ApiListField("bar_links")
	@ApiField("bar_link_info")
	private List<BarLinkInfo> barLinks;

	/**
	 * 配置模式
	 */
	@ApiField("config_model")
	private GroupConfigModelConfig configModel;

	/**
	 * 支付宝应用小程序APPID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序名称
	 */
	@ApiField("mini_app_name")
	private String miniAppName;

	/**
	 * 一般为集团名称拼音大写，英文，需要提前和支付宝酒店技术确认是否冲突
	 */
	@ApiField("org_group_code")
	private String orgGroupCode;

	/**
	 * 集团名称
	 */
	@ApiField("org_group_name")
	private String orgGroupName;

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

	public String getAppLogo() {
		return this.appLogo;
	}
	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public List<BarLinkInfo> getBarLinks() {
		return this.barLinks;
	}
	public void setBarLinks(List<BarLinkInfo> barLinks) {
		this.barLinks = barLinks;
	}

	public GroupConfigModelConfig getConfigModel() {
		return this.configModel;
	}
	public void setConfigModel(GroupConfigModelConfig configModel) {
		this.configModel = configModel;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppName() {
		return this.miniAppName;
	}
	public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
	}

	public String getOrgGroupCode() {
		return this.orgGroupCode;
	}
	public void setOrgGroupCode(String orgGroupCode) {
		this.orgGroupCode = orgGroupCode;
	}

	public String getOrgGroupName() {
		return this.orgGroupName;
	}
	public void setOrgGroupName(String orgGroupName) {
		this.orgGroupName = orgGroupName;
	}

}
