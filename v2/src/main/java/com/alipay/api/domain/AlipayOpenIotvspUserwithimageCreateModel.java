package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 录入机构用户信息（人员图片可选）
 *
 * @author auto create
 * @since 1.0, 2024-07-19 17:44:50
 */
public class AlipayOpenIotvspUserwithimageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4524543694128451161L;

	/**
	 * false-不下发本地库
true-下发本地库
	 */
	@ApiField("bio_in_client")
	private Boolean bioInClient;

	/**
	 * 姓名，三要素入库必填
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，枚举支持：IDENTITY_CARD身份证，PASS_PORT护照，STU_NUM学生学号，COMPANY_NUM工号，TAIWAN_CARD台胞证，HK_MC_CARD港澳证件
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 组件编码，详见接入指南
	 */
	@ApiField("component_out_id")
	private String componentOutId;

	/**
	 * 扩展信息，服务商自定义，如无可为空
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 刷脸的ftoken
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 人脸图片
	 */
	@ApiField("image")
	private String image;

	/**
	 * 服务商传入服务商的PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 自定义标签
	 */
	@ApiField("label_out_no")
	private String labelOutNo;

	/**
	 * 机构编码
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * isv自定义的用户唯一标识
	 */
	@ApiField("vid")
	private String vid;

	public Boolean getBioInClient() {
		return this.bioInClient;
	}
	public void setBioInClient(Boolean bioInClient) {
		this.bioInClient = bioInClient;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getComponentOutId() {
		return this.componentOutId;
	}
	public void setComponentOutId(String componentOutId) {
		this.componentOutId = componentOutId;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getLabelOutNo() {
		return this.labelOutNo;
	}
	public void setLabelOutNo(String labelOutNo) {
		this.labelOutNo = labelOutNo;
	}

	public String getOrgOutId() {
		return this.orgOutId;
	}
	public void setOrgOutId(String orgOutId) {
		this.orgOutId = orgOutId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
