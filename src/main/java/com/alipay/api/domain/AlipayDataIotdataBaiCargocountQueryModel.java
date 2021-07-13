package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仓库货物盘点接口
 *
 * @author auto create
 * @since 1.0, 2019-12-05 10:41:30
 */
public class AlipayDataIotdataBaiCargocountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4329843597878299915L;

	/**
	 * 货物盘点使用的摄像头id
	 */
	@ApiField("camera_id")
	private Long cameraId;

	/**
	 * JSON字符串，包含盘点算法使用的超参数如畸变矫正矩阵，透视变换矩阵，库位RoI区域等
	 */
	@ApiField("counting_params")
	private String countingParams;

	/**
	 * 用于盘点的视频帧产生时间，Unix时间戳，单位秒
	 */
	@ApiField("counting_time")
	private Long countingTime;

	/**
	 * base64编码视频帧数据
	 */
	@ApiField("input_frame")
	private String inputFrame;

	/**
	 * 算法用于盘点指定货物的模板图像数据，base64编码
	 */
	@ApiField("input_template")
	private String inputTemplate;

	public Long getCameraId() {
		return this.cameraId;
	}
	public void setCameraId(Long cameraId) {
		this.cameraId = cameraId;
	}

	public String getCountingParams() {
		return this.countingParams;
	}
	public void setCountingParams(String countingParams) {
		this.countingParams = countingParams;
	}

	public Long getCountingTime() {
		return this.countingTime;
	}
	public void setCountingTime(Long countingTime) {
		this.countingTime = countingTime;
	}

	public String getInputFrame() {
		return this.inputFrame;
	}
	public void setInputFrame(String inputFrame) {
		this.inputFrame = inputFrame;
	}

	public String getInputTemplate() {
		return this.inputTemplate;
	}
	public void setInputTemplate(String inputTemplate) {
		this.inputTemplate = inputTemplate;
	}

}
