package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * WEB应用
 *
 * @author auto create
 * @since 1.0, 2023-03-03 17:12:22
 */
public class BusinessWebAppDTO extends AlipayObject {

	private static final long serialVersionUID = 6216793769191844991L;

	/**
	 * 测试账户
	 */
	@ApiField("account")
	private String account;

	/**
	 * 网站状态
	 */
	@ApiField("app_status")
	private String appStatus;

	/**
	 * 网站类型
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 网站备注图片
	 */
	@ApiListField("ext_pictures")
	@ApiField("string")
	private List<String> extPictures;

	/**
	 * ICP备案授权函
	 */
	@ApiField("icp_auth_pic")
	private String icpAuthPic;

	/**
	 * ICP许可证
	 */
	@ApiField("icp_licence_pic")
	private String icpLicencePic;

	/**
	 * 网站备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 测试密码
	 */
	@ApiField("password")
	private String password;

	/**
	 * 网站截图
	 */
	@ApiListField("screenshot")
	@ApiField("string")
	private List<String> screenshot;

	/**
	 * 网站地址
	 */
	@ApiField("url")
	private String url;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAppStatus() {
		return this.appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public List<String> getExtPictures() {
		return this.extPictures;
	}
	public void setExtPictures(List<String> extPictures) {
		this.extPictures = extPictures;
	}

	public String getIcpAuthPic() {
		return this.icpAuthPic;
	}
	public void setIcpAuthPic(String icpAuthPic) {
		this.icpAuthPic = icpAuthPic;
	}

	public String getIcpLicencePic() {
		return this.icpLicencePic;
	}
	public void setIcpLicencePic(String icpLicencePic) {
		this.icpLicencePic = icpLicencePic;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getScreenshot() {
		return this.screenshot;
	}
	public void setScreenshot(List<String> screenshot) {
		this.screenshot = screenshot;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
