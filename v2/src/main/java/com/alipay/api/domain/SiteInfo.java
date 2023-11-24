package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点信息
 *
 * @author auto create
 * @since 1.0, 2023-11-08 15:54:29
 */
public class SiteInfo extends AlipayObject {

	private static final long serialVersionUID = 8446571139669741813L;

	/**
	 * 测试账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 授权函照片
	 */
	@ApiField("auth_letter_image")
	private String authLetterImage;

	/**
	 * 下载地址
	 */
	@ApiField("download")
	private String download;

	/**
	 * ICP备案/许可证号
	 */
	@ApiField("icp_no")
	private String icpNo;

	/**
	 * ICP备案主体主办单位名称
	 */
	@ApiField("icp_org_name")
	private String icpOrgName;

	/**
	 * ICP备案主体信息服务名称
	 */
	@ApiField("icp_service_name")
	private String icpServiceName;

	/**
	 * 应用市场
	 */
	@ApiField("market")
	private String market;

	/**
	 * 测试密码
	 */
	@ApiField("password")
	private String password;

	/**
	 * 备注说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 备注说明图片
	 */
	@ApiField("remark_image")
	private String remarkImage;

	/**
	 * 截图照片；当传入交易场景trade_scene，且当传入trade_scene=WAP、trade_scene=APP、trade_scene=PC时该参数必传
	 */
	@ApiField("screenshot_image")
	private String screenshotImage;

	/**
	 * 网站域名
	 */
	@ApiField("site_domain")
	private String siteDomain;

	/**
	 * 站点名称
	 */
	@ApiField("site_name")
	private String siteName;

	/**
	 * 网站：01
APP  : 02
服务窗:03
公众号:04
其他:05
支付宝小程序:06
	 */
	@ApiField("site_type")
	private String siteType;

	/**
	 * 站点地址
	 */
	@ApiField("site_url")
	private String siteUrl;

	/**
	 * 上架状态；
	 */
	@ApiField("status")
	private String status;

	/**
	 * 小程序appId; 当传入service，且包含jsapi支付时，sites的site_type=06, tiny_app_id必填。
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAuthLetterImage() {
		return this.authLetterImage;
	}
	public void setAuthLetterImage(String authLetterImage) {
		this.authLetterImage = authLetterImage;
	}

	public String getDownload() {
		return this.download;
	}
	public void setDownload(String download) {
		this.download = download;
	}

	public String getIcpNo() {
		return this.icpNo;
	}
	public void setIcpNo(String icpNo) {
		this.icpNo = icpNo;
	}

	public String getIcpOrgName() {
		return this.icpOrgName;
	}
	public void setIcpOrgName(String icpOrgName) {
		this.icpOrgName = icpOrgName;
	}

	public String getIcpServiceName() {
		return this.icpServiceName;
	}
	public void setIcpServiceName(String icpServiceName) {
		this.icpServiceName = icpServiceName;
	}

	public String getMarket() {
		return this.market;
	}
	public void setMarket(String market) {
		this.market = market;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemarkImage() {
		return this.remarkImage;
	}
	public void setRemarkImage(String remarkImage) {
		this.remarkImage = remarkImage;
	}

	public String getScreenshotImage() {
		return this.screenshotImage;
	}
	public void setScreenshotImage(String screenshotImage) {
		this.screenshotImage = screenshotImage;
	}

	public String getSiteDomain() {
		return this.siteDomain;
	}
	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
	}

	public String getSiteName() {
		return this.siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteType() {
		return this.siteType;
	}
	public void setSiteType(String siteType) {
		this.siteType = siteType;
	}

	public String getSiteUrl() {
		return this.siteUrl;
	}
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

}
