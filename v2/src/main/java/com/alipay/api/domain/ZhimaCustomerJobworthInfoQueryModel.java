package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证信息查询
 *
 * @author auto create
 * @since 1.0, 2024-01-02 10:15:48
 */
public class ZhimaCustomerJobworthInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4415814337945121332L;

	/**
	 * 若用户没有开通工作证或者芝麻，成功开通后回跳的链接 ，支持http或schema地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 证件号 ，根据cert_type类型设置对应证件号码，选择身份证校验时必传
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 ，枚举值：
0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证
选择身份证校验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 子场景
	 */
	@ApiField("cloud_resume_scene")
	private String cloudResumeScene;

	/**
	 * 公司社会统一代码h5页面访客展示使用
	 */
	@ApiField("company_certificate")
	private String companyCertificate;

	/**
	 * 外部订单号，zhima.credit.payafteruse.creditagreement.sign的入参 out_agreement_no智能简历场景支持只传该值
	 */
	@ApiField("conn_key")
	private String connKey;

	/**
	 * 在h5页面是否展示底部跳转按钮
	 */
	@ApiField("has_button")
	private Boolean hasButton;

	/**
	 * 是否需要返回h5页面
	 */
	@ApiField("has_html")
	private Boolean hasHtml;

	/**
	 * true or false
是否展示
	 */
	@ApiField("has_number")
	private Boolean hasNumber;

	/**
	 * 是否展示二维码
	 */
	@ApiField("has_qr_code")
	private Boolean hasQrCode;

	/**
	 * 行业描述ID
	 */
	@ApiField("industry_id")
	private String industryId;

	/**
	 * 对外使用的jobid
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 商户内部的唯一id如果是需要返回h5页面必填
	 */
	@ApiField("ka_visitor_id")
	private String kaVisitorId;

	/**
	 * 蚂蚁统一会员ID ，为2088开头的唯一标识
选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID ，为2088开头的唯一标识
选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 商户侧配置访客名称
如果是需要返回h5页面必填
	 */
	@ApiField("visitor_name")
	private String visitorName;

	/**
	 * 访问类型
C = company  or P = person
如果是需要返回h5页面必填
	 */
	@ApiField("visitor_type")
	private String visitorType;

	/**
	 * 上传图片接口返回的id
	 */
	@ApiField("visitor_url")
	private String visitorUrl;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCloudResumeScene() {
		return this.cloudResumeScene;
	}
	public void setCloudResumeScene(String cloudResumeScene) {
		this.cloudResumeScene = cloudResumeScene;
	}

	public String getCompanyCertificate() {
		return this.companyCertificate;
	}
	public void setCompanyCertificate(String companyCertificate) {
		this.companyCertificate = companyCertificate;
	}

	public String getConnKey() {
		return this.connKey;
	}
	public void setConnKey(String connKey) {
		this.connKey = connKey;
	}

	public Boolean getHasButton() {
		return this.hasButton;
	}
	public void setHasButton(Boolean hasButton) {
		this.hasButton = hasButton;
	}

	public Boolean getHasHtml() {
		return this.hasHtml;
	}
	public void setHasHtml(Boolean hasHtml) {
		this.hasHtml = hasHtml;
	}

	public Boolean getHasNumber() {
		return this.hasNumber;
	}
	public void setHasNumber(Boolean hasNumber) {
		this.hasNumber = hasNumber;
	}

	public Boolean getHasQrCode() {
		return this.hasQrCode;
	}
	public void setHasQrCode(Boolean hasQrCode) {
		this.hasQrCode = hasQrCode;
	}

	public String getIndustryId() {
		return this.industryId;
	}
	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getKaVisitorId() {
		return this.kaVisitorId;
	}
	public void setKaVisitorId(String kaVisitorId) {
		this.kaVisitorId = kaVisitorId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVisitorName() {
		return this.visitorName;
	}
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorType() {
		return this.visitorType;
	}
	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}

	public String getVisitorUrl() {
		return this.visitorUrl;
	}
	public void setVisitorUrl(String visitorUrl) {
		this.visitorUrl = visitorUrl;
	}

}
