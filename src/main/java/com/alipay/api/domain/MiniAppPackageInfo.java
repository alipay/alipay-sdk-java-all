package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序包信息
 *
 * @author auto create
 * @since 1.0, 2019-08-12 20:20:04
 */
public class MiniAppPackageInfo extends AlipayObject {

	private static final long serialVersionUID = 6355734137385936227L;

	/**
	 * 包二维码地址
	 */
	@ApiField("package_qr_code_url")
	private String packageQrCodeUrl;

	/**
	 * 包大小
	 */
	@ApiField("package_size")
	private Long packageSize;

	/**
	 * 包状态
Packaged 打包成功
Packaging 打包中
Fail 打包失败
NotPackage 未打包
	 */
	@ApiField("package_status")
	private String packageStatus;

	public String getPackageQrCodeUrl() {
		return this.packageQrCodeUrl;
	}
	public void setPackageQrCodeUrl(String packageQrCodeUrl) {
		this.packageQrCodeUrl = packageQrCodeUrl;
	}

	public Long getPackageSize() {
		return this.packageSize;
	}
	public void setPackageSize(Long packageSize) {
		this.packageSize = packageSize;
	}

	public String getPackageStatus() {
		return this.packageStatus;
	}
	public void setPackageStatus(String packageStatus) {
		this.packageStatus = packageStatus;
	}

}
