package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建药师入驻签约二维码
 *
 * @author auto create
 * @since 1.0, 2025-05-06 16:09:37
 */
public class AlipayCommerceMedicalHealthcaPharmacistsignqrurlCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4582322679922896613L;

	/**
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 药师姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 红框红体（姓名样式）
	 */
	@ApiField("name_style")
	private String nameStyle;

	/**
	 * 药师UID
	 */
	@ApiField("pharmacist_code")
	private String pharmacistCode;

	/**
	 * 请求唯一标识（与后续的结果消费和主动查询对应，需要存储）
	 */
	@ApiField("request_id")
	private String requestId;

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNameStyle() {
		return this.nameStyle;
	}
	public void setNameStyle(String nameStyle) {
		this.nameStyle = nameStyle;
	}

	public String getPharmacistCode() {
		return this.pharmacistCode;
	}
	public void setPharmacistCode(String pharmacistCode) {
		this.pharmacistCode = pharmacistCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
