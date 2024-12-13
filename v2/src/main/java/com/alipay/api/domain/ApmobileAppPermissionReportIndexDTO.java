package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测报告基本信息
 *
 * @author auto create
 * @since 1.0, 2023-08-10 16:12:00
 */
public class ApmobileAppPermissionReportIndexDTO extends AlipayObject {

	private static final long serialVersionUID = 5656176856881894882L;

	/**
	 * 版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 证书摘要
	 */
	@ApiField("cert_md_5")
	private String certMd5;

	/**
	 * 检测报告pdfafts的下载url
	 */
	@ApiField("detect_report_pdf_url")
	private String detectReportPdfUrl;

	/**
	 * 检测时间
	 */
	@ApiField("detect_time")
	private Date detectTime;

	/**
	 * 开发者
	 */
	@ApiField("developer")
	private String developer;

	/**
	 * 文件摘要
	 */
	@ApiField("md_5")
	private String md5;

	/**
	 * 软件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 包名
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 系统平台
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 隐私权政策url
	 */
	@ApiField("privacy_policy")
	private String privacyPolicy;

	/**
	 * 集成sdk数量
	 */
	@ApiField("sdk_sum")
	private Long sdkSum;

	/**
	 * 签名证书
	 */
	@ApiField("sign_certificate")
	private String signCertificate;

	/**
	 * 文件体积大小，单位M
	 */
	@ApiField("size")
	private String size;

	/**
	 * targetSdkVersion
	 */
	@ApiField("target_sdk_version")
	private String targetSdkVersion;

	/**
	 * 检测任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 测试机型
	 */
	@ApiField("ut_name")
	private String utName;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getCertMd5() {
		return this.certMd5;
	}
	public void setCertMd5(String certMd5) {
		this.certMd5 = certMd5;
	}

	public String getDetectReportPdfUrl() {
		return this.detectReportPdfUrl;
	}
	public void setDetectReportPdfUrl(String detectReportPdfUrl) {
		this.detectReportPdfUrl = detectReportPdfUrl;
	}

	public Date getDetectTime() {
		return this.detectTime;
	}
	public void setDetectTime(Date detectTime) {
		this.detectTime = detectTime;
	}

	public String getDeveloper() {
		return this.developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getMd5() {
		return this.md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPrivacyPolicy() {
		return this.privacyPolicy;
	}
	public void setPrivacyPolicy(String privacyPolicy) {
		this.privacyPolicy = privacyPolicy;
	}

	public Long getSdkSum() {
		return this.sdkSum;
	}
	public void setSdkSum(Long sdkSum) {
		this.sdkSum = sdkSum;
	}

	public String getSignCertificate() {
		return this.signCertificate;
	}
	public void setSignCertificate(String signCertificate) {
		this.signCertificate = signCertificate;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getTargetSdkVersion() {
		return this.targetSdkVersion;
	}
	public void setTargetSdkVersion(String targetSdkVersion) {
		this.targetSdkVersion = targetSdkVersion;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUtName() {
		return this.utName;
	}
	public void setUtName(String utName) {
		this.utName = utName;
	}

}
