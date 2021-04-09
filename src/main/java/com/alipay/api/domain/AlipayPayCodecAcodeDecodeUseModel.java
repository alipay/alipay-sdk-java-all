package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 码上浙江解码接口
 *
 * @author auto create
 * @since 1.0, 2019-10-14 10:31:12
 */
public class AlipayPayCodecAcodeDecodeUseModel extends AlipayObject {

	private static final long serialVersionUID = 1332495444882213784L;

	/**
	 * 具体业务场景代码
	 */
	@ApiField("acode_scene")
	private String acodeScene;

	/**
	 * 场景码。用于区分大场景。非必填参数，不传默认是非支付场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 扫码设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 二维码byte数组的base64的形式
	 */
	@ApiField("dynamic_id")
	private String dynamicId;

	/**
	 * 机构类型,浙里办传“00000008”
	 */
	@ApiField("institution_type")
	private String institutionType;

	/**
	 * 地理位置信息
	 */
	@ApiField("lbs_info")
	private String lbsInfo;

	/**
	 * 扫码的时间戳(Long型)
	 */
	@ApiField("scan_time")
	private Long scanTime;

	/**
	 * 外部业务号，用于标识这笔解码请求，对同一个码的重复解码请求，scene_no必须与上一次保持一致，不同请求的scene_no必须不一样
	 */
	@ApiField("scene_no")
	private String sceneNo;

	public String getAcodeScene() {
		return this.acodeScene;
	}
	public void setAcodeScene(String acodeScene) {
		this.acodeScene = acodeScene;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDynamicId() {
		return this.dynamicId;
	}
	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getInstitutionType() {
		return this.institutionType;
	}
	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	public String getLbsInfo() {
		return this.lbsInfo;
	}
	public void setLbsInfo(String lbsInfo) {
		this.lbsInfo = lbsInfo;
	}

	public Long getScanTime() {
		return this.scanTime;
	}
	public void setScanTime(Long scanTime) {
		this.scanTime = scanTime;
	}

	public String getSceneNo() {
		return this.sceneNo;
	}
	public void setSceneNo(String sceneNo) {
		this.sceneNo = sceneNo;
	}

}
