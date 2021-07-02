package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸识别机具信息
 *
 * @author auto create
 * @since 1.0, 2018-11-20 14:56:05
 */
public class FaceMachineInfo extends AlipayObject {

	private static final long serialVersionUID = 2316621525643972872L;

	/**
	 * 摄像头驱动版本号
	 */
	@ApiField("camera_drive_ver")
	private String cameraDriveVer;

	/**
	 * 摄像头型号
	 */
	@ApiField("camera_model")
	private String cameraModel;

	/**
	 * 摄像头名称
	 */
	@ApiField("camera_name")
	private String cameraName;

	/**
	 * 摄像头版本号
	 */
	@ApiField("camera_ver")
	private String cameraVer;

	/**
	 * 扩展信息
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 机具编码
	 */
	@ApiField("machine_code")
	private String machineCode;

	/**
	 * 机具型号
	 */
	@ApiField("machine_model")
	private String machineModel;

	/**
	 * 机具版本号
	 */
	@ApiField("machine_ver")
	private String machineVer;

	public String getCameraDriveVer() {
		return this.cameraDriveVer;
	}
	public void setCameraDriveVer(String cameraDriveVer) {
		this.cameraDriveVer = cameraDriveVer;
	}

	public String getCameraModel() {
		return this.cameraModel;
	}
	public void setCameraModel(String cameraModel) {
		this.cameraModel = cameraModel;
	}

	public String getCameraName() {
		return this.cameraName;
	}
	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}

	public String getCameraVer() {
		return this.cameraVer;
	}
	public void setCameraVer(String cameraVer) {
		this.cameraVer = cameraVer;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getMachineCode() {
		return this.machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getMachineModel() {
		return this.machineModel;
	}
	public void setMachineModel(String machineModel) {
		this.machineModel = machineModel;
	}

	public String getMachineVer() {
		return this.machineVer;
	}
	public void setMachineVer(String machineVer) {
		this.machineVer = machineVer;
	}

}
