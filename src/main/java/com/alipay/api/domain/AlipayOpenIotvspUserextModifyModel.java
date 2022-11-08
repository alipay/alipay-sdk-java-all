package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户额外信息（ext）更新接口
 *
 * @author auto create
 * @since 1.0, 2022-11-02 20:40:15
 */
public class AlipayOpenIotvspUserextModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1133219749633351526L;

	/**
	 * 姓名
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
	 * 组件编码，该参数与userInfoList配对使用。详见接入指南
	 */
	@ApiField("component_out_id")
	private String componentOutId;

	/**
	 * 扩展信息，ISV自定义
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * ISV的PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 机构编码
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 用户唯一标识
	 */
	@ApiField("vid")
	private String vid;

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

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOrgOutId() {
		return this.orgOutId;
	}
	public void setOrgOutId(String orgOutId) {
		this.orgOutId = orgOutId;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
