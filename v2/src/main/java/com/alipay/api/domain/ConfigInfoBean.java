package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程配置信息
 *
 * @author auto create
 * @since 1.0, 2020-08-20 16:40:57
 */
public class ConfigInfoBean extends AlipayObject {

	private static final long serialVersionUID = 8326324267567794447L;

	/**
	 * 配置附件收集任务相关信息
	 */
	@ApiField("attachment_explain")
	private AttachmentExplainBean attachmentExplain;

	/**
	 * 签署完成是否自动归档，默认true，如果false，则归档需要调用签署流程归档接口
	 */
	@ApiField("auto_archive")
	private Boolean autoArchive;

	/**
	 * 是否收集附件（需签署人上传身份证或者其他文件的，需设置为true）
	 */
	@ApiField("collect_attachement")
	private Boolean collectAttachement;

	/**
	 * 物流公司编号（目前仅支持顺丰"SF"）
注：避免影响生产订单，联调及测试环境请传入SF_TEST。
	 */
	@ApiField("company_no")
	private String companyNo;

	/**
	 * 合同过期时间：该参数设置的时间若到期，则会触发流程文件过期通知
	 */
	@ApiField("contract_validity")
	private Long contractValidity;

	/**
	 * 签署完成后跳转商户小程序的地址（signModel字段值为2时 选填）
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 商户小程序签署地址（signModel字段值为1时 必填）
	 */
	@ApiField("merchant_mini_sign_url")
	private String merchantMiniSignUrl;

	/**
	 * https://esign.cn/callback
	 */
	@ApiField("notice_developer_url")
	private String noticeDeveloperUrl;

	/**
	 * 平台订单号，可将商户订单与电子合同进行关联。用户通过支付宝官方小程序 合同管家 查看合同时，可快速进入商家的小程序及对应的订单详情页，为商家的小程序提供了流量入口，提高用户的活跃度和留存率；
	 */
	@ApiField("platform_order_no")
	private String platformOrderNo;

	/**
	 * 12或15位物流单号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 快递扫码签收方式：
1-商户小程序：扫码后跳转商户小程序进行签收；
0-e签宝小程序：如商户没有支付宝小程序，可使用e签宝小程序完成签收。
	 */
	@ApiField("sign_model")
	private Long signModel;

	/**
	 * 指定签署人需要上传的附件列表，例如：A、B、C三方签署，A需上传附件1，B需指定附件2，C需上传附件1,2,3
	 */
	@ApiListField("specify_attachment_infos")
	@ApiField("specify_attachment_info")
	private List<SpecifyAttachmentInfo> specifyAttachmentInfos;

	public AttachmentExplainBean getAttachmentExplain() {
		return this.attachmentExplain;
	}
	public void setAttachmentExplain(AttachmentExplainBean attachmentExplain) {
		this.attachmentExplain = attachmentExplain;
	}

	public Boolean getAutoArchive() {
		return this.autoArchive;
	}
	public void setAutoArchive(Boolean autoArchive) {
		this.autoArchive = autoArchive;
	}

	public Boolean getCollectAttachement() {
		return this.collectAttachement;
	}
	public void setCollectAttachement(Boolean collectAttachement) {
		this.collectAttachement = collectAttachement;
	}

	public String getCompanyNo() {
		return this.companyNo;
	}
	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public Long getContractValidity() {
		return this.contractValidity;
	}
	public void setContractValidity(Long contractValidity) {
		this.contractValidity = contractValidity;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getMerchantMiniSignUrl() {
		return this.merchantMiniSignUrl;
	}
	public void setMerchantMiniSignUrl(String merchantMiniSignUrl) {
		this.merchantMiniSignUrl = merchantMiniSignUrl;
	}

	public String getNoticeDeveloperUrl() {
		return this.noticeDeveloperUrl;
	}
	public void setNoticeDeveloperUrl(String noticeDeveloperUrl) {
		this.noticeDeveloperUrl = noticeDeveloperUrl;
	}

	public String getPlatformOrderNo() {
		return this.platformOrderNo;
	}
	public void setPlatformOrderNo(String platformOrderNo) {
		this.platformOrderNo = platformOrderNo;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Long getSignModel() {
		return this.signModel;
	}
	public void setSignModel(Long signModel) {
		this.signModel = signModel;
	}

	public List<SpecifyAttachmentInfo> getSpecifyAttachmentInfos() {
		return this.specifyAttachmentInfos;
	}
	public void setSpecifyAttachmentInfos(List<SpecifyAttachmentInfo> specifyAttachmentInfos) {
		this.specifyAttachmentInfos = specifyAttachmentInfos;
	}

}
