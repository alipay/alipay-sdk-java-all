package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备订单SN模型
 *
 * @author auto create
 * @since 1.0, 2021-09-06 16:41:25
 */
public class OrderDevice extends AlipayObject {

	private static final long serialVersionUID = 2369778664997235424L;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 实际安装照片：最多5张，英文逗号分隔(,) ，图片格式必须（bmp,jpg,png,gif,image）
	 */
	@ApiField("install_actual_photo")
	private String installActualPhoto;

	/**
	 * 安装方式：挂壁安装（WALL_MOUNTING），底座支架安装(RACK_MOUNTING)
	 */
	@ApiField("install_mode")
	private String installMode;

	/**
	 * 铺屏现场照片: 最多5张，英文逗号分隔(,) ，图片格式必须（bmp,jpg,png,gif,image）
	 */
	@ApiField("install_scene_photo")
	private String installScenePhoto;

	/**
	 * 是否安装路由器
	 */
	@ApiField("is_install_router")
	private Boolean isInstallRouter;

	/**
	 * 设备屏幕尺寸:INCH_24 (24英寸)、INCH_32(32英寸)、INCH_64（64英寸）
	 */
	@ApiField("screen_size")
	private String screenSize;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getInstallActualPhoto() {
		return this.installActualPhoto;
	}
	public void setInstallActualPhoto(String installActualPhoto) {
		this.installActualPhoto = installActualPhoto;
	}

	public String getInstallMode() {
		return this.installMode;
	}
	public void setInstallMode(String installMode) {
		this.installMode = installMode;
	}

	public String getInstallScenePhoto() {
		return this.installScenePhoto;
	}
	public void setInstallScenePhoto(String installScenePhoto) {
		this.installScenePhoto = installScenePhoto;
	}

	public Boolean getIsInstallRouter() {
		return this.isInstallRouter;
	}
	public void setIsInstallRouter(Boolean isInstallRouter) {
		this.isInstallRouter = isInstallRouter;
	}

	public String getScreenSize() {
		return this.screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getSupplierSn() {
		return this.supplierSn;
	}
	public void setSupplierSn(String supplierSn) {
		this.supplierSn = supplierSn;
	}

}
