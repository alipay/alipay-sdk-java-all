package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通个人商户限额升级
 *
 * @author auto create
 * @since 1.0, 2025-07-08 16:00:22
 */
public class AntMerchantExpandIndirectZftUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 3194151263244743383L;

	/**
	 * 补充证件图片，与additional_cert_no+additional_cert_type搭配使用。当商户类型为个人时，使用当面付收款有限额，补充这组证件信息可提额。目前仅允许个人类型商户传入。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key
	 */
	@ApiField("additional_cert_image")
	private String additionalCertImage;

	/**
	 * 补充证件号，与additional_cert_type+additional_cert_image同时提供。当商户类型为个人时，使用当面付收款有限额，补充这组证件信息可提额。目前仅允许个人类型商户传入本字段。
	 */
	@ApiField("additional_cert_no")
	private String additionalCertNo;

	/**
	 * 补充证件类型，与additional_cert_no+additional_cert_image搭配使用。当商户类型为个人时，使用当面付收款有限额，补充这组证件信息可提额。目前仅允许个人类型商户传入本字段。
	 */
	@ApiField("additional_cert_type")
	private String additionalCertType;

	/**
	 * 二级商户支付宝商户号，进件成功时由支付宝返回。
	 */
	@ApiField("smid")
	private String smid;

	public String getAdditionalCertImage() {
		return this.additionalCertImage;
	}
	public void setAdditionalCertImage(String additionalCertImage) {
		this.additionalCertImage = additionalCertImage;
	}

	public String getAdditionalCertNo() {
		return this.additionalCertNo;
	}
	public void setAdditionalCertNo(String additionalCertNo) {
		this.additionalCertNo = additionalCertNo;
	}

	public String getAdditionalCertType() {
		return this.additionalCertType;
	}
	public void setAdditionalCertType(String additionalCertType) {
		this.additionalCertType = additionalCertType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
