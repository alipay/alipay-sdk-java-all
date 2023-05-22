package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.RegionInfo;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniVersionAuditApplyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.version.audit.apply request
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 18:06:51
 */
public class AlipayOpenMiniVersionAuditApplyRequest implements AlipayUploadRequest<AlipayOpenMiniVersionAuditApplyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以通过  https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询，如果不填默认采用当前小程序应用类目。使用默认应用类目后不需要再次上传营业执照号、营业执照名、营业执照截图、营业执照有效期。
	 */
	private String appCategoryIds;

	/** 
	* 小程序描述，长度限制 20~400 个字符。
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息
	 */
	private String appDesc;

	/** 
	* 小程序应用英文名称，长度限制 3～30 个字符；仅支持英文和数字。
如果不填默认采用当前小程序应用英文名称，如无默认值则必填，不可为空。
	 */
	private String appEnglishName;

	/** 
	* 小程序logo图标，图片格式仅支持 jpeg,png,jpg,PNG,JPG ,JPEG格式，不支持 bmp,gif,BMP,GIF格式。建议上传像素为180*180 px，logo图片最大 2M，图片高度与宽度必须一致。
如果不填默认采用当前小程序 logo 图标。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。
	 */
	private FileItem appLogo;

	/** 
	* 小程序名称，长度限制 3~30 个字符，仅支持包含中文、数字、英文、下划线、+、-。
如果不填默认采用当前小程序应用名称，如无默认值则必填，不可为空。
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息
	 */
	private String appName;

	/** 
	* 小程序简介，一句话描述小程序功能，长度限制 10~32个字符。
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息
	 */
	private String appSlogan;

	/** 
	* 小程序版本号，请选择开发版本执行提交审核操作。
	 */
	private String appVersion;

	/** 
	* 审核类型：
NONE： 不拆分准入、营销（默认）
BASE_PROMOTE：准入、营销拆分审核
建议设置成“BASE_PROMOTE”，小程序将会更容易上架。将小程序发布审核拆分成“准入”、“营销”。原先小程序需要两个环节都审核通过才能上架，现在小程序只需要准入通过即可上架，但是无法在营销场景（支付宝泛搜、支付宝首页推荐等）展现给用户，小程序可通过精搜或者扫码等方式使用。如果小程序需要进行营销，可发布新版本，当准入&营销都通过后，小程序也可被营销。点击查看支付宝小程序营销规范：https://opendocs.alipay.com/b/03al2q
	 */
	private String auditRule;

	/** 
	* 审核通过后是否自动上架，
自动上架：true；不自动上架（默认）：false。
如果小程序上架前无需特殊处理，建议设置成true，平台将会在小程序审核通过时自动将其上架
	 */
	private String autoOnline;

	/** 
	* 小程序投放的端参数。例如投放到支付宝钱包是支付宝端。默认支付宝端。支持：
com.alipay.alipaywallet:支付宝端；
com.alipay.iot.xpaas：支付宝IoT端。
	 */
	private String bundleId;

	/** 
	* 第五张营业执照照片，不能超过 4MB，最大宽度 2160 px，最大高度 3840 px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
	 */
	private FileItem fifthLicensePic;

	/** 
	* 小程序第五张应用截图，模板实例化的小程序可不传应用截图。
截图大小不能超过 4MB，最大宽度 2160px，最大高度3840px。图片格式仅支持 png,jpg,PNG,JPG 格式。小程序截图数量最小为2，最大为5。
	 */
	private FileItem fifthScreenShot;

	/** 
	* 第一张营业执照照片，不能超过 4MB，最大宽度 2160 px，最大高度 3840 px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
	 */
	private FileItem firstLicensePic;

	/** 
	* 小程序第一张应用截图，模板实例化的小程序可不传应用截图。
截图大小不能超过 4MB，最大宽度 2160px，最大高度 3840px。图片格式仅支持 png,jpg,PNG,JPG 格式。小程序截图数量最小为2，最大为5。 
	 */
	private FileItem firstScreenShot;

	/** 
	* 第一张特殊资质图片，不能超过4MB，最大宽度 2160px，最大高度3840px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。
	 */
	private FileItem firstSpecialLicensePic;

	/** 
	* 第四张营业执照照片，不能超过 4MB，最大宽度 2160 px，最大高度 3840 px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
	 */
	private FileItem fourthLicensePic;

	/** 
	* 小程序第四张应用截图，模板实例化的小程序可不传应用截图。
截图大小不能超过 4MB，最大宽度 2160px，最大高度3840px。图片格式仅支持 png,jpg,PNG,JPG 格式。小程序截图数量最小为2，最大为5。
	 */
	private FileItem fourthScreenShot;

	/** 
	* 营业执照名称，部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
	 */
	private String licenseName;

	/** 
	* 营业执照证件号，部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。

如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
	 */
	private String licenseNo;

	/** 
	* 营业执照有效期，格式为 yyyy-MM-dd，9999-12-31表示长期有效。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
	 */
	private String licenseValidDate;

	/** 
	* 小程序备注，小程序备注最多500字符。
	 */
	private String memo;

	/** 
	* 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query
接口查询mini_category_list。
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息
注意：个人开发者不得使用企业类目。
	 */
	private String miniCategoryIds;

	/** 
	* 门头照，不能超过 4MB，最大宽度 2160 px，最大高度 3840 px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传门头照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写门头照信息。
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。
	 */
	private FileItem outDoorPic;

	/** 
	* 小程序服务区域类型，支持：
GLOBAL-全球
CHINA-中国
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。
LOCATION-指定区域
	 */
	private String regionType;

	/** 
	* 第二张营业执照照片，不能超过 4MB，最大宽度 2160 px，最大高度 3840 px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
	 */
	private FileItem secondLicensePic;

	/** 
	* 小程序第二张应用截图，模板实例化的小程序可不传应用截图。
截图大小不能超过 4MB，最大宽度 2160px，最大高度3840px。图片格式仅支持 png,jpg,PNG,JPG 格式。小程序截图数量最小为2，最大为5。
	 */
	private FileItem secondScreenShot;

	/** 
	* 第二张特殊资质图片文件，不能超过4MB，最大宽度 2160px，最大高度3840px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。
	 */
	private FileItem secondSpecialLicensePic;

	/** 
	* 小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。
注意：2021年7月1日后，该字段将逐步灰度为可选字段，请按可选开发。
	 */
	private String serviceEmail;

	/** 
	* 小程序客服电话，长度限制5~30个字符，仅支持包含数字和-。如果不填默认采用当前小程序的应用客服电话，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。
注意：2021年7月1日后，该字段将逐步灰度为必填字段，请按必填开发。
	 */
	private String servicePhone;

	/** 
	* 省市区信息。当region_type为LOCATION或传入city_code时，province_code不能为空；填写area_code时，province_code和city_code不能为空。只填province_code则全选该省；填写province_code和city_code则全选该市，以此类推。省市区code参见https://gw.alipayobjects.com/os/bmw-prod/0aab0319-13de-42b9-85cf-13877a5f78ed.xlsx
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。
	 */
	private List<RegionInfo> serviceRegionInfo;

	/** 
	* 如果有审核加急权益，是否使用审核加急权益加速审核：
加速（默认）：true
不加速：false
	 */
	private String speedUp;

	/** 
	* 测试账号，是否需要填写请参见https://opendocs.alipay.com/mini/operation/standard/case/akxg6r#3.%20%E6%B5%8B%E8%AF%95%E5%86%85%E5%AE%B9%E6%8F%90%E4%BA%A4%E4%B8%8D%E5%AE%8C%E6%95%B4
	 */
	private String testAccout;

	/** 
	* 测试附件，用于上传测试报告和测试录屏，请上传10M以内附件，支持格式zip，rar。是否需要填写请参见:https://opendocs.alipay.com/mini/operation/standard/case/akxg6r#3.%20%E6%B5%8B%E8%AF%95%E5%86%85%E5%AE%B9%E6%8F%90%E4%BA%A4%E4%B8%8D%E5%AE%8C%E6%95%B4
	 */
	private FileItem testFileName;

	/** 
	* 测试账号密码
	 */
	private String testPassword;

	/** 
	* 第三张营业执照照片，不能超过 4MB，最大宽度 2160 px，最大高度 3840 px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果选择的类目不需要该信息，则可不填。如果选择的类目需要该信息，如果商户之前在平台上传过该信息，也允许不填
	 */
	private FileItem thirdLicensePic;

	/** 
	* 小程序第三张应用截图，模板实例化的小程序可不传应用截图。
截图大小不能超过 4MB，最大宽度 2160px，最大高度 3840px。图片格式仅支持 png,jpg,PNG,JPG 格式。小程序截图数量最小为2，最大为5。
	 */
	private FileItem thirdScreenShot;

	/** 
	* 第三张特殊资质图片文件，不能超过4MB，最大宽度 2160px，最大高度3840px。图片格式仅支持 png,jpg,PNG,JPG 格式。
部分小程序类目需要提交，可通过https://opendocs.alipay.com/mini/03l8c8 查询类目是否需要上传营业执照信息。参照https://opendocs.alipay.com/mini/operation/material 要求填写营业执照信息。
如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。
	 */
	private FileItem thirdSpecialLicensePic;

	/** 
	* 小程序版本描述，30-500个字符。
	 */
	private String versionDesc;

	public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}
	public String getAppCategoryIds() {
		return this.appCategoryIds;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppDesc() {
		return this.appDesc;
	}

	public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}
	public String getAppEnglishName() {
		return this.appEnglishName;
	}

	public void setAppLogo(FileItem appLogo) {
		this.appLogo = appLogo;
	}
	public FileItem getAppLogo() {
		return this.appLogo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return this.appName;
	}

	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}
	public String getAppSlogan() {
		return this.appSlogan;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAuditRule(String auditRule) {
		this.auditRule = auditRule;
	}
	public String getAuditRule() {
		return this.auditRule;
	}

	public void setAutoOnline(String autoOnline) {
		this.autoOnline = autoOnline;
	}
	public String getAutoOnline() {
		return this.autoOnline;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleId() {
		return this.bundleId;
	}

	public void setFifthLicensePic(FileItem fifthLicensePic) {
		this.fifthLicensePic = fifthLicensePic;
	}
	public FileItem getFifthLicensePic() {
		return this.fifthLicensePic;
	}

	public void setFifthScreenShot(FileItem fifthScreenShot) {
		this.fifthScreenShot = fifthScreenShot;
	}
	public FileItem getFifthScreenShot() {
		return this.fifthScreenShot;
	}

	public void setFirstLicensePic(FileItem firstLicensePic) {
		this.firstLicensePic = firstLicensePic;
	}
	public FileItem getFirstLicensePic() {
		return this.firstLicensePic;
	}

	public void setFirstScreenShot(FileItem firstScreenShot) {
		this.firstScreenShot = firstScreenShot;
	}
	public FileItem getFirstScreenShot() {
		return this.firstScreenShot;
	}

	public void setFirstSpecialLicensePic(FileItem firstSpecialLicensePic) {
		this.firstSpecialLicensePic = firstSpecialLicensePic;
	}
	public FileItem getFirstSpecialLicensePic() {
		return this.firstSpecialLicensePic;
	}

	public void setFourthLicensePic(FileItem fourthLicensePic) {
		this.fourthLicensePic = fourthLicensePic;
	}
	public FileItem getFourthLicensePic() {
		return this.fourthLicensePic;
	}

	public void setFourthScreenShot(FileItem fourthScreenShot) {
		this.fourthScreenShot = fourthScreenShot;
	}
	public FileItem getFourthScreenShot() {
		return this.fourthScreenShot;
	}

	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}
	public String getLicenseName() {
		return this.licenseName;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseValidDate(String licenseValidDate) {
		this.licenseValidDate = licenseValidDate;
	}
	public String getLicenseValidDate() {
		return this.licenseValidDate;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setMiniCategoryIds(String miniCategoryIds) {
		this.miniCategoryIds = miniCategoryIds;
	}
	public String getMiniCategoryIds() {
		return this.miniCategoryIds;
	}

	public void setOutDoorPic(FileItem outDoorPic) {
		this.outDoorPic = outDoorPic;
	}
	public FileItem getOutDoorPic() {
		return this.outDoorPic;
	}

	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}
	public String getRegionType() {
		return this.regionType;
	}

	public void setSecondLicensePic(FileItem secondLicensePic) {
		this.secondLicensePic = secondLicensePic;
	}
	public FileItem getSecondLicensePic() {
		return this.secondLicensePic;
	}

	public void setSecondScreenShot(FileItem secondScreenShot) {
		this.secondScreenShot = secondScreenShot;
	}
	public FileItem getSecondScreenShot() {
		return this.secondScreenShot;
	}

	public void setSecondSpecialLicensePic(FileItem secondSpecialLicensePic) {
		this.secondSpecialLicensePic = secondSpecialLicensePic;
	}
	public FileItem getSecondSpecialLicensePic() {
		return this.secondSpecialLicensePic;
	}

	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}
	public String getServiceEmail() {
		return this.serviceEmail;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getServicePhone() {
		return this.servicePhone;
	}

	public void setServiceRegionInfo(List<RegionInfo> serviceRegionInfo) {
		this.serviceRegionInfo = serviceRegionInfo;
	}
	public List<RegionInfo> getServiceRegionInfo() {
		return this.serviceRegionInfo;
	}

	public void setSpeedUp(String speedUp) {
		this.speedUp = speedUp;
	}
	public String getSpeedUp() {
		return this.speedUp;
	}

	public void setTestAccout(String testAccout) {
		this.testAccout = testAccout;
	}
	public String getTestAccout() {
		return this.testAccout;
	}

	public void setTestFileName(FileItem testFileName) {
		this.testFileName = testFileName;
	}
	public FileItem getTestFileName() {
		return this.testFileName;
	}

	public void setTestPassword(String testPassword) {
		this.testPassword = testPassword;
	}
	public String getTestPassword() {
		return this.testPassword;
	}

	public void setThirdLicensePic(FileItem thirdLicensePic) {
		this.thirdLicensePic = thirdLicensePic;
	}
	public FileItem getThirdLicensePic() {
		return this.thirdLicensePic;
	}

	public void setThirdScreenShot(FileItem thirdScreenShot) {
		this.thirdScreenShot = thirdScreenShot;
	}
	public FileItem getThirdScreenShot() {
		return this.thirdScreenShot;
	}

	public void setThirdSpecialLicensePic(FileItem thirdSpecialLicensePic) {
		this.thirdSpecialLicensePic = thirdSpecialLicensePic;
	}
	public FileItem getThirdSpecialLicensePic() {
		return this.thirdSpecialLicensePic;
	}

	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}
	public String getVersionDesc() {
		return this.versionDesc;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.open.mini.version.audit.apply";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_category_ids", this.appCategoryIds);
		txtParams.put("app_desc", this.appDesc);
		txtParams.put("app_english_name", this.appEnglishName);
		txtParams.put("app_name", this.appName);
		txtParams.put("app_slogan", this.appSlogan);
		txtParams.put("app_version", this.appVersion);
		txtParams.put("audit_rule", this.auditRule);
		txtParams.put("auto_online", this.autoOnline);
		txtParams.put("bundle_id", this.bundleId);
		txtParams.put("license_name", this.licenseName);
		txtParams.put("license_no", this.licenseNo);
		txtParams.put("license_valid_date", this.licenseValidDate);
		txtParams.put("memo", this.memo);
		txtParams.put("mini_category_ids", this.miniCategoryIds);
		txtParams.put("region_type", this.regionType);
		txtParams.put("service_email", this.serviceEmail);
		txtParams.put("service_phone", this.servicePhone);
		txtParams.put("service_region_info", this.serviceRegionInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.serviceRegionInfo, true));
		txtParams.put("speed_up", this.speedUp);
		txtParams.put("test_accout", this.testAccout);
		txtParams.put("test_password", this.testPassword);
		txtParams.put("version_desc", this.versionDesc);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("app_logo", this.appLogo);
		params.put("fifth_license_pic", this.fifthLicensePic);
		params.put("fifth_screen_shot", this.fifthScreenShot);
		params.put("first_license_pic", this.firstLicensePic);
		params.put("first_screen_shot", this.firstScreenShot);
		params.put("first_special_license_pic", this.firstSpecialLicensePic);
		params.put("fourth_license_pic", this.fourthLicensePic);
		params.put("fourth_screen_shot", this.fourthScreenShot);
		params.put("out_door_pic", this.outDoorPic);
		params.put("second_license_pic", this.secondLicensePic);
		params.put("second_screen_shot", this.secondScreenShot);
		params.put("second_special_license_pic", this.secondSpecialLicensePic);
		params.put("test_file_name", this.testFileName);
		params.put("third_license_pic", this.thirdLicensePic);
		params.put("third_screen_shot", this.thirdScreenShot);
		params.put("third_special_license_pic", this.thirdSpecialLicensePic);
		return params;
	}

	public Class<AlipayOpenMiniVersionAuditApplyResponse> getResponseClass() {
		return AlipayOpenMiniVersionAuditApplyResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
