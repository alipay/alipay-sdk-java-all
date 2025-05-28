package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方PDF加签
 *
 * @author auto create
 * @since 1.0, 2025-05-06 16:10:12
 */
public class AlipayCommerceMedicalHealthcaPrescriptionpdfApproveModel extends AlipayObject {

	private static final long serialVersionUID = 1337742441891288931L;

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
	 * 姓名样式
	 */
	@ApiField("name_style")
	private String nameStyle;

	/**
	 * 处方单PDF的fileId
	 */
	@ApiField("pdf_file_id")
	private String pdfFileId;

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

	/**
	 * 签名图高度px
	 */
	@ApiField("sign_name_height")
	private Long signNameHeight;

	/**
	 * 签名图宽度px
	 */
	@ApiField("sign_name_width")
	private Long signNameWidth;

	/**
	 * 签名加签位置X轴px
	 */
	@ApiField("sign_name_x")
	private Long signNameX;

	/**
	 * 签名加签位置Y轴px
	 */
	@ApiField("sign_name_y")
	private Long signNameY;

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

	public String getPdfFileId() {
		return this.pdfFileId;
	}
	public void setPdfFileId(String pdfFileId) {
		this.pdfFileId = pdfFileId;
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

	public Long getSignNameHeight() {
		return this.signNameHeight;
	}
	public void setSignNameHeight(Long signNameHeight) {
		this.signNameHeight = signNameHeight;
	}

	public Long getSignNameWidth() {
		return this.signNameWidth;
	}
	public void setSignNameWidth(Long signNameWidth) {
		this.signNameWidth = signNameWidth;
	}

	public Long getSignNameX() {
		return this.signNameX;
	}
	public void setSignNameX(Long signNameX) {
		this.signNameX = signNameX;
	}

	public Long getSignNameY() {
		return this.signNameY;
	}
	public void setSignNameY(Long signNameY) {
		this.signNameY = signNameY;
	}

}
