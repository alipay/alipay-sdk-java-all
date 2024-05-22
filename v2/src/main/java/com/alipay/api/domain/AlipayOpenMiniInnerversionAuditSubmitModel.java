package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序版本提交审核
 *
 * @author auto create
 * @since 1.0, 2023-01-08 00:21:53
 */
public class AlipayOpenMiniInnerversionAuditSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2741455395999226142L;

	/**
	 * 小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考<a href=‘https://opendocs.alipay.com/b/03al2m’>开放服务类目</a>，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。
	 */
	@ApiField("app_category_ids")
	private String appCategoryIds;

	/**
	 * 小程序应用描述，20-200个字，如果不填默认采用当前小程序的应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序应用英文名称，如果不填默认采用当前小程序应用英文名称，3～30个字符。插件不填
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/**
	 * 小程序logo图标，图片格式必须为：png、jpeg、jpg，比例必须为1:1，建议上传像素为180*180，不超过256kb， 如果不填默认采用当前小程序应用logo图标
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 小程序应用名称，如果不填默认采用当前小程序应用名称，名称3-40个字符，一个中文算两个字符
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
	 * 需要提交审核的小程序版本号，格式为: x.y.z，其中x、y、z均为整型数字，一个应用最多只能有一个审核中、审核通过或者审核驳回的版本。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端ID，多端场景下区分不同端
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 提交审核营业执照信息，部分小程序类目需要营业执照信息，需要营业执照的类目请参照 <a href=‘https://opendocs.alipay.com/b/03al2m’>开放服务类目</a>。模板和插件不需要资质
	 */
	@ApiField("license_info")
	private AuditLicenseInfo licenseInfo;

	/**
	 * 小程序备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 小程序ID，特殊场景专用，普通业务方无需关注该参数。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 <a href='https://opendocs.alipay.com/mini/03l8c6'>alipay.open.mini.category.query</a>（小程序类目树查询接口）查询mini_category_list，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。使用后不再读取app_category_ids值，老前台类目将废弃
	 */
	@ApiField("mini_category_ids")
	private String miniCategoryIds;

	/**
	 * 小程序所属PID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 门头照图片地址，部分小程序类目需要提交，参照 <a href=‘https://opendocs.alipay.com/b/03al2m’>开放服务类目</a> 中是否需要营业执照信息，如果不填默认采用当前小程序门头照图片
	 */
	@ApiField("out_door_pic")
	private String outDoorPic;

	/**
	 * 小程序所属PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 小程序应用截图列表，逗号分割，需要2-5张图片，单张图片不能超过4MB，图片格式只支持jpg，png；通过模板实例化小程序不需要传递此参数。
	 */
	@ApiListField("screen_shot_list")
	@ApiField("string")
	private List<String> screenShotList;

	/**
	 * 小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱，和客服电话至少填写一个
	 */
	@ApiField("service_email")
	private String serviceEmail;

	/**
	 * 小程序客服电话，如果不填默认采用当前小程序的应用客服电话，和客服邮箱至少填写一个。插件不填
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 特殊资质图片地址列表，逗号分隔；部分类目需要特殊资质，如果需要特殊资质，最少一张，最多三张。模板和插件不需要特殊资质
	 */
	@ApiField("special_license_pic_list")
	private String specialLicensePicList;

	/**
	 * 小程序版本变更描述，30-500个字符，区分于app_desc
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

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public AuditLicenseInfo getLicenseInfo() {
		return this.licenseInfo;
	}
	public void setLicenseInfo(AuditLicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutDoorPic() {
		return this.outDoorPic;
	}
	public void setOutDoorPic(String outDoorPic) {
		this.outDoorPic = outDoorPic;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<String> getScreenShotList() {
		return this.screenShotList;
	}
	public void setScreenShotList(List<String> screenShotList) {
		this.screenShotList = screenShotList;
	}

	public String getServiceEmail() {
		return this.serviceEmail;
	}
	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
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

	public String getVersionDesc() {
		return this.versionDesc;
	}
	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}

}
