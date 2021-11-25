package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社保保险数据
 *
 * @author auto create
 * @since 1.0, 2018-12-26 17:18:44
 */
public class SiData extends AlipayObject {

	private static final long serialVersionUID = 2712244446133218566L;

	/**
	 * 唯一定位一次报文请求，由商户生成， 确保唯一
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝处理完请求后，当前页面跳转到商户网站里指定页面的http路径，业务详情url。
	 */
	@ApiField("service_return_url")
	private String serviceReturnUrl;

	/**
	 * 目标人扩展信息,Json值
	 */
	@ApiField("target_extend_params")
	private String targetExtendParams;

	/**
	 * 目标人证件号
	 */
	@ApiField("target_idcard")
	private String targetIdcard;

	/**
	 * 目标人证件类型
证件类型
身份证：01 
等
	 */
	@ApiField("target_idcard_type")
	private String targetIdcardType;

	/**
	 * 目标人手机号
	 */
	@ApiField("target_mobile")
	private String targetMobile;

	/**
	 * 社会保障卡卡号
	 */
	@ApiField("target_sicard_no")
	private String targetSicardNo;

	/**
	 * 支付宝用户ID,可以通过获取会员信息产品 获取支付宝用户ID
证件信息和userid同时存在以userid为主
target_user_id>target_idcard
	 */
	@ApiField("target_user_id")
	private String targetUserId;

	/**
	 * 目标人证件姓名
	 */
	@ApiField("target_user_name")
	private String targetUserName;

	/**
	 * 模板数据
	 */
	@ApiField("template_data")
	private String templateData;

	/**
	 * 业务类型对应的模板编号：联调时需要咨询技术
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 场景数据的类型的版本,默认1.0
	 */
	@ApiField("template_version")
	private String templateVersion;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceReturnUrl() {
		return this.serviceReturnUrl;
	}
	public void setServiceReturnUrl(String serviceReturnUrl) {
		this.serviceReturnUrl = serviceReturnUrl;
	}

	public String getTargetExtendParams() {
		return this.targetExtendParams;
	}
	public void setTargetExtendParams(String targetExtendParams) {
		this.targetExtendParams = targetExtendParams;
	}

	public String getTargetIdcard() {
		return this.targetIdcard;
	}
	public void setTargetIdcard(String targetIdcard) {
		this.targetIdcard = targetIdcard;
	}

	public String getTargetIdcardType() {
		return this.targetIdcardType;
	}
	public void setTargetIdcardType(String targetIdcardType) {
		this.targetIdcardType = targetIdcardType;
	}

	public String getTargetMobile() {
		return this.targetMobile;
	}
	public void setTargetMobile(String targetMobile) {
		this.targetMobile = targetMobile;
	}

	public String getTargetSicardNo() {
		return this.targetSicardNo;
	}
	public void setTargetSicardNo(String targetSicardNo) {
		this.targetSicardNo = targetSicardNo;
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}
	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}

	public String getTargetUserName() {
		return this.targetUserName;
	}
	public void setTargetUserName(String targetUserName) {
		this.targetUserName = targetUserName;
	}

	public String getTemplateData() {
		return this.templateData;
	}
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
