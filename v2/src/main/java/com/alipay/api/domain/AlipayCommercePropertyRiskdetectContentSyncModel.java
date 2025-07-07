package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业风险检测内容同步
 *
 * @author auto create
 * @since 1.0, 2025-06-05 15:27:29
 */
public class AlipayCommercePropertyRiskdetectContentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1149976318574455147L;

	/**
	 * createTime	内容物抓取时间,格式
yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 支付宝侧设备id。说明：
deviceId、outDeviceId至少传其中之一
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 从文件上传接口回参获取
● uploadModel=OSS时 不可为空
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 需要上传的文件url,文件url的域名需要提前加白
● uploadModel=URL时 不可为空
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 机构侧标识内容的唯一ID
	 */
	@ApiField("out_content_id")
	private String outContentId;

	/**
	 * 外部设备编码。说明：
deviceId、outDeviceId至少传其中之一
	 */
	@ApiField("out_device_id")
	private String outDeviceId;

	/**
	 * 上传模式 OSS ： 主动上传模式
URL： 公网URL转存模式  
	 */
	@ApiField("upload_mode")
	private String uploadMode;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getOutContentId() {
		return this.outContentId;
	}
	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}

	public String getOutDeviceId() {
		return this.outDeviceId;
	}
	public void setOutDeviceId(String outDeviceId) {
		this.outDeviceId = outDeviceId;
	}

	public String getUploadMode() {
		return this.uploadMode;
	}
	public void setUploadMode(String uploadMode) {
		this.uploadMode = uploadMode;
	}

}
