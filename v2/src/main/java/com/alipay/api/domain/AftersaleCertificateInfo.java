package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 售后凭证信息
 *
 * @author auto create
 * @since 1.0, 2026-04-17 19:14:34
 */
public class AftersaleCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 2495346693688137972L;

	/**
	 * 售后次序号列表
	 */
	@ApiListField("aftersale_serial_info_vo_list")
	@ApiField("aftersale_serial_info")
	private List<AftersaleSerialInfo> aftersaleSerialInfoVoList;

	/**
	 * 支付宝侧的凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	public List<AftersaleSerialInfo> getAftersaleSerialInfoVoList() {
		return this.aftersaleSerialInfoVoList;
	}
	public void setAftersaleSerialInfoVoList(List<AftersaleSerialInfo> aftersaleSerialInfoVoList) {
		this.aftersaleSerialInfoVoList = aftersaleSerialInfoVoList;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

}
