package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 封闭式教育场景-一脸通行特征兼容
 *
 * @author auto create
 * @since 1.0, 2021-07-23 15:18:33
 */
public class AlipayCommerceEducateFacefeatureInfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 4619974532397562195L;

	/**
	 * 人脸算法版本
	 */
	@ApiField("alg_version")
	private String algVersion;

	/**
	 * 人脸特征场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，默认为1. 1:居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 扩展信息，json串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * isv英文简称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 国家统一分配的学校社会信用代码(institution_id)
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 支付宝用户id集合,最大条数500
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	public String getAlgVersion() {
		return this.algVersion;
	}
	public void setAlgVersion(String algVersion) {
		this.algVersion = algVersion;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public List<String> getUserIds() {
		return this.userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

}
