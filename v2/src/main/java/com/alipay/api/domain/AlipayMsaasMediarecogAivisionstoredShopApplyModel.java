package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * AI门店准入申请
 *
 * @author auto create
 * @since 1.0, 2026-06-01 19:12:50
 */
public class AlipayMsaasMediarecogAivisionstoredShopApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5312491646924983227L;

	/**
	 * null
	 */
	@ApiListField("camera_infos")
	@ApiField("camera_info")
	private List<CameraInfo> cameraInfos;

	/**
	 * 设备sn
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 2088开头的
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 门店名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店唯一id
	 */
	@ApiField("shop_pid")
	private String shopPid;

	public List<CameraInfo> getCameraInfos() {
		return this.cameraInfos;
	}
	public void setCameraInfos(List<CameraInfo> cameraInfos) {
		this.cameraInfos = cameraInfos;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopPid() {
		return this.shopPid;
	}
	public void setShopPid(String shopPid) {
		this.shopPid = shopPid;
	}

}
