package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程配置信息（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:36:29
 */
public class ConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 8229382243887621928L;

	/**
	 * 附件信息（collect_attachement值为true时必填）
	 */
	@ApiField("attachment_explain")
	private AttachmentExplain attachmentExplain;

	/**
	 * 是否收集附件
	 */
	@ApiField("collect_attachement")
	private Boolean collectAttachement;

	/**
	 * 收集证件类型列表
	 */
	@ApiListField("collect_cert_types")
	@ApiField("string")
	private List<String> collectCertTypes;

	/**
	 * 公司编号-SF
	 */
	@ApiField("company_no")
	private String companyNo;

	/**
	 * 文档过期时间
	 */
	@ApiField("contract_validity")
	private Long contractValidity;

	/**
	 * 支付宝小程序跳转
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 商户小程序签署地址（signModel字段值为1时 必填）
	 */
	@ApiField("merchant_mini_sign_url")
	private String merchantMiniSignUrl;

	/**
	 * 回调地址，签署的过程和签署完成都会回调。
	 */
	@ApiField("notice_developer_url")
	private String noticeDeveloperUrl;

	/**
	 * 平台订单号
	 */
	@ApiField("platform_order_no")
	private String platformOrderNo;

	/**
	 * 物流单号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 签署方式  0-e签宝小程序签署 1-商户小程序签署  默认0
	 */
	@ApiField("sign_model")
	private Long signModel;

	public AttachmentExplain getAttachmentExplain() {
		return this.attachmentExplain;
	}
	public void setAttachmentExplain(AttachmentExplain attachmentExplain) {
		this.attachmentExplain = attachmentExplain;
	}

	public Boolean getCollectAttachement() {
		return this.collectAttachement;
	}
	public void setCollectAttachement(Boolean collectAttachement) {
		this.collectAttachement = collectAttachement;
	}

	public List<String> getCollectCertTypes() {
		return this.collectCertTypes;
	}
	public void setCollectCertTypes(List<String> collectCertTypes) {
		this.collectCertTypes = collectCertTypes;
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

}
