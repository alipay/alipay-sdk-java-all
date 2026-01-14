package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业h5信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class InteOpHtmlFiveInfo extends AlipayObject {

	private static final long serialVersionUID = 4349997199538991722L;

	/**
	 * 网站备注图片，最小5KB ，最大5M。图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("h_5_extra_pic")
	private String h5ExtraPic;

	/**
	 * H5首页截图，最小5KB ，最大5M。图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("h_5_home_screenshot")
	private String h5HomeScreenshot;

	/**
	 * H5商品页截图，最小5KB ，最大5M。图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("h_5_item_screenshot")
	private String h5ItemScreenshot;

	/**
	 * 网站信息文本。
	 */
	@ApiField("h_5_memo")
	private String h5Memo;

	/**
	 * H5支付页截图，最小5KB ，最大5M。图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("h_5_pay_screenshot")
	private String h5PayScreenshot;

	/**
	 * H5网站地址。
	 */
	@ApiField("h_5_sites")
	private String h5Sites;

	/**
	 * H5网址授权函，最小5KB ，最大5M。图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("h_5_sites_loa")
	private String h5SitesLoa;

	/**
	 * H5网站状态
	 */
	@ApiField("h_5_status")
	private String h5Status;

	/**
	 * H5网站测试账户
	 */
	@ApiField("h_5_test_account")
	private String h5TestAccount;

	/**
	 * H5网站测试账户密码
	 */
	@ApiField("h_5_test_account_password")
	private String h5TestAccountPassword;

	public String getH5ExtraPic() {
		return this.h5ExtraPic;
	}
	public void setH5ExtraPic(String h5ExtraPic) {
		this.h5ExtraPic = h5ExtraPic;
	}

	public String getH5HomeScreenshot() {
		return this.h5HomeScreenshot;
	}
	public void setH5HomeScreenshot(String h5HomeScreenshot) {
		this.h5HomeScreenshot = h5HomeScreenshot;
	}

	public String getH5ItemScreenshot() {
		return this.h5ItemScreenshot;
	}
	public void setH5ItemScreenshot(String h5ItemScreenshot) {
		this.h5ItemScreenshot = h5ItemScreenshot;
	}

	public String getH5Memo() {
		return this.h5Memo;
	}
	public void setH5Memo(String h5Memo) {
		this.h5Memo = h5Memo;
	}

	public String getH5PayScreenshot() {
		return this.h5PayScreenshot;
	}
	public void setH5PayScreenshot(String h5PayScreenshot) {
		this.h5PayScreenshot = h5PayScreenshot;
	}

	public String getH5Sites() {
		return this.h5Sites;
	}
	public void setH5Sites(String h5Sites) {
		this.h5Sites = h5Sites;
	}

	public String getH5SitesLoa() {
		return this.h5SitesLoa;
	}
	public void setH5SitesLoa(String h5SitesLoa) {
		this.h5SitesLoa = h5SitesLoa;
	}

	public String getH5Status() {
		return this.h5Status;
	}
	public void setH5Status(String h5Status) {
		this.h5Status = h5Status;
	}

	public String getH5TestAccount() {
		return this.h5TestAccount;
	}
	public void setH5TestAccount(String h5TestAccount) {
		this.h5TestAccount = h5TestAccount;
	}

	public String getH5TestAccountPassword() {
		return this.h5TestAccountPassword;
	}
	public void setH5TestAccountPassword(String h5TestAccountPassword) {
		this.h5TestAccountPassword = h5TestAccountPassword;
	}

}
