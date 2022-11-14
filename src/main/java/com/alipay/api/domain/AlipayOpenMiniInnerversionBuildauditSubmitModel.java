package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路小程序构建并提审
 *
 * @author auto create
 * @since 1.0, 2021-10-13 15:05:58
 */
public class AlipayOpenMiniInnerversionBuildauditSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4298461583175163373L;

	/**
	 * 小程序类目，可不传，不传取基础信息中的小程序类目
	 */
	@ApiField("app_category_ids")
	private String appCategoryIds;

	/**
	 * 小程序描述，可不传，不传取基础信息中的小程序描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序在从未上架过版本之前，英文名称是可以修改的，该字段用于在提交审核时候修改小程序英文名称。注意：小程序一旦有过上架版本之后就不可以修改英文名称。
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/**
	 * 小程序logo，可不传，不传取基础信息中的小程序logo，请调用专用的logo上传接口上传logo文件，并将返回的地址作为本字段传入
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 小程序在从未上架过版本之前，中文名称是可以修改的，该字段用于在提交审核时候修改小程序中文名称。注意：小程序一旦有过上架版本之后就不可以修改中文名称。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序应用简介，一句话描述小程序功能，如果不填默认采用当前小程序应用简介，10~32个字符
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 构建扩展参数
	 */
	@ApiField("build_ext")
	private String buildExt;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 三方应用ID
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 提审时，选择的所属类目需要校验营业执照，可不传，不传取基础信息中的小程序英文名称
	 */
	@ApiField("license_info")
	private AuditLicenseInfo licenseInfo;

	/**
	 * 小程序ID，特殊场景专用，普通业务方无需关注该参数。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。使用后不再读取app_category_ids值，老前台类目将废弃
	 */
	@ApiField("mini_category_ids")
	private String miniCategoryIds;

	/**
	 * 小程序开发者ID，可不传，不传取基础信息中的小程序开发者ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 服务区域类型,可不传，不传取基础信息中的小程序服务区域类型
	 */
	@ApiField("region_type")
	private String regionType;

	/**
	 * 版本截图，最少2张，最多5张，必传
	 */
	@ApiField("screen_shot_list")
	private String screenShotList;

	/**
	 * 客服电话，可不传，不传取基础信息中的小程序客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 特殊资质图片地址列表，逗号分割,
	 */
	@ApiField("special_license_pic_list")
	private String specialLicensePicList;

	/**
	 * 小程序模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板的版本号，如果不填写，则默认用模板当前最新的在架版本
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 小程序版本描述，30-500个字符，一个中文占两个字符，一个英文或者数字占一个字符
	 */
	@ApiField("version_desc")
	private String versionDesc;

	public String getAppCategoryIds() {
		return this.appCategoryIds;
	}
	public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}

	public String getAppDesc() {
		return this.appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getAppEnglishName() {
		return this.appEnglishName;
	}
	public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}

	public String getAppLogo() {
		return this.appLogo;
	}
	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getAppSlogan() {
		return this.appSlogan;
	}
	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBuildExt() {
		return this.buildExt;
	}
	public void setBuildExt(String buildExt) {
		this.buildExt = buildExt;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public AuditLicenseInfo getLicenseInfo() {
		return this.licenseInfo;
	}
	public void setLicenseInfo(AuditLicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniCategoryIds() {
		return this.miniCategoryIds;
	}
	public void setMiniCategoryIds(String miniCategoryIds) {
		this.miniCategoryIds = miniCategoryIds;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRegionType() {
		return this.regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

	public String getScreenShotList() {
		return this.screenShotList;
	}
	public void setScreenShotList(String screenShotList) {
		this.screenShotList = screenShotList;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getSpecialLicensePicList() {
		return this.specialLicensePicList;
	}
	public void setSpecialLicensePicList(String specialLicensePicList) {
		this.specialLicensePicList = specialLicensePicList;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getVersionDesc() {
		return this.versionDesc;
	}
	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}

}
