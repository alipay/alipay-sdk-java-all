package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号信息修改
 *
 * @author auto create
 * @since 1.0, 2025-04-08 09:57:19
 */
public class AlipayContentLifeaccountInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1489747445814436377L;

	/**
	 * 医生描述，如职称等信息
	 */
	@ApiField("doctor_desc")
	private String doctorDesc;

	/**
	 * 加密后的好大夫id，与public id一起指定一个操作用户
	 */
	@ApiField("hdf_id_encrypted")
	private String hdfIdEncrypted;

	/**
	 * 头像链接
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 账号描述
	 */
	@ApiField("public_desc")
	private String publicDesc;

	/**
	 * 需要修改信息的号id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 修改后的号名称
	 */
	@ApiField("public_name")
	private String publicName;

	public String getDoctorDesc() {
		return this.doctorDesc;
	}
	public void setDoctorDesc(String doctorDesc) {
		this.doctorDesc = doctorDesc;
	}

	public String getHdfIdEncrypted() {
		return this.hdfIdEncrypted;
	}
	public void setHdfIdEncrypted(String hdfIdEncrypted) {
		this.hdfIdEncrypted = hdfIdEncrypted;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getPublicDesc() {
		return this.publicDesc;
	}
	public void setPublicDesc(String publicDesc) {
		this.publicDesc = publicDesc;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

}
