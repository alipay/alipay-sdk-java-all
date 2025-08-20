package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方图片加签
 *
 * @author auto create
 * @since 1.0, 2025-05-06 16:12:41
 */
public class AlipayCommerceMedicalHealthcaPrescriptionpicApproveModel extends AlipayObject {

	private static final long serialVersionUID = 3599457969537611244L;

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
	 * 药师UID
	 */
	@ApiField("pharmacist_code")
	private String pharmacistCode;

	/**
	 * 处方单图片的fileId
	 */
	@ApiField("pic_file_id")
	private String picFileId;

	/**
	 * 图片水印文本
	 */
	@ApiField("sign_mark_text")
	private String signMarkText;

	/**
	 * 药师签名图片的AFTS的fileId
	 */
	@ApiField("sign_name_file_id")
	private String signNameFileId;

	/**
	 * 签名图比例(1-100]px
	 */
	@ApiField("sign_name_size")
	private Long signNameSize;

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

	public String getPharmacistCode() {
		return this.pharmacistCode;
	}
	public void setPharmacistCode(String pharmacistCode) {
		this.pharmacistCode = pharmacistCode;
	}

	public String getPicFileId() {
		return this.picFileId;
	}
	public void setPicFileId(String picFileId) {
		this.picFileId = picFileId;
	}

	public String getSignMarkText() {
		return this.signMarkText;
	}
	public void setSignMarkText(String signMarkText) {
		this.signMarkText = signMarkText;
	}

	public String getSignNameFileId() {
		return this.signNameFileId;
	}
	public void setSignNameFileId(String signNameFileId) {
		this.signNameFileId = signNameFileId;
	}

	public Long getSignNameSize() {
		return this.signNameSize;
	}
	public void setSignNameSize(Long signNameSize) {
		this.signNameSize = signNameSize;
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
