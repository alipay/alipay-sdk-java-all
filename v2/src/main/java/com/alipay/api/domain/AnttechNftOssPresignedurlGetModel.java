package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成预签名URL
 *
 * @author auto create
 * @since 1.0, 2025-08-14 17:28:13
 */
public class AnttechNftOssPresignedurlGetModel extends AlipayObject {

	private static final long serialVersionUID = 4629785621332381969L;

	/**
	 * 上传文件数据的业务日期
	 */
	@ApiField("business_date")
	private String businessDate;

	/**
	 * 上传文件的文件大小，用于校验上传文件不能超过限制值， 单位字节。
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 上传文件场景, 区分文件目录，以及为后续区分上传不同bucket作扩展
	 */
	@ApiField("scenario_type")
	private String scenarioType;

	public String getBusinessDate() {
		return this.businessDate;
	}
	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getScenarioType() {
		return this.scenarioType;
	}
	public void setScenarioType(String scenarioType) {
		this.scenarioType = scenarioType;
	}

}
