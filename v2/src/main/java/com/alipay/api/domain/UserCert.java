package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 森林用户环保证书
 *
 * @author auto create
 * @since 1.0, 2020-07-07 10:07:31
 */
public class UserCert extends AlipayObject {

	private static final long serialVersionUID = 1821586414339267883L;

	/**
	 * 申请证书的时间，不是种树时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 用户环保证书id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 扩展信息，格式为JSON字符串，具体k-v需要跟接口提供方确认后使用
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 树已经种下时所在的林区id
	 */
	@ApiField("forest_id")
	private String forestId;

	/**
	 * 公益机构名称
	 */
	@ApiField("ngo_name")
	private String ngoName;

	/**
	 * 树种是否种下
	 */
	@ApiField("planted")
	private Boolean planted;

	/**
	 * 树种或保护地所在区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 树种或者保护地名称
	 */
	@ApiField("tree_name")
	private String treeName;

	/**
	 * 证书类型：树种-"TREE"/保护地-"RESERVE"
	 */
	@ApiField("type")
	private String type;

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getForestId() {
		return this.forestId;
	}
	public void setForestId(String forestId) {
		this.forestId = forestId;
	}

	public String getNgoName() {
		return this.ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public Boolean getPlanted() {
		return this.planted;
	}
	public void setPlanted(Boolean planted) {
		this.planted = planted;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getTreeName() {
		return this.treeName;
	}
	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
