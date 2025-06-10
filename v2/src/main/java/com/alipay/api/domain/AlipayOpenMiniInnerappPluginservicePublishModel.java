package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 插件发布能力中心
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:16:21
 */
public class AlipayOpenMiniInnerappPluginservicePublishModel extends AlipayObject {

	private static final long serialVersionUID = 8119654525869327522L;

	/**
	 * 功能类型，目前支持的有：1039支付, 1040会员, 1041基础, 1056资金, 1058信用, 1111口碑, 330120安全, 360101营销
	 */
	@ApiListField("ability_type_list")
	@ApiField("string")
	private List<String> abilityTypeList;

	/**
	 * 服务发布logo
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 服务描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 移动端详情，用于能力中心展示
	 */
	@ApiField("detail_for_client")
	private String detailForClient;

	/**
	 * pc端详情，用于能力中心展示
	 */
	@ApiField("detail_for_pc")
	private String detailForPc;

	/**
	 * 插件id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 可订购人群，1003个人, 1004企业，-1无限制
	 */
	@ApiField("sell_crowd")
	private String sellCrowd;

	/**
	 * 发布后是否展示，01展示（默认）、02隐藏
	 */
	@ApiField("show_type")
	private String showType;

	/**
	 * 服务标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * pc端url地址，不需要则为空
	 */
	@ApiField("visit_url_for_pc")
	private String visitUrlForPc;

	public List<String> getAbilityTypeList() {
		return this.abilityTypeList;
	}
	public void setAbilityTypeList(List<String> abilityTypeList) {
		this.abilityTypeList = abilityTypeList;
	}

	public String getAppLogo() {
		return this.appLogo;
	}
	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetailForClient() {
		return this.detailForClient;
	}
	public void setDetailForClient(String detailForClient) {
		this.detailForClient = detailForClient;
	}

	public String getDetailForPc() {
		return this.detailForPc;
	}
	public void setDetailForPc(String detailForPc) {
		this.detailForPc = detailForPc;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getSellCrowd() {
		return this.sellCrowd;
	}
	public void setSellCrowd(String sellCrowd) {
		this.sellCrowd = sellCrowd;
	}

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getVisitUrlForPc() {
		return this.visitUrlForPc;
	}
	public void setVisitUrlForPc(String visitUrlForPc) {
		this.visitUrlForPc = visitUrlForPc;
	}

}
