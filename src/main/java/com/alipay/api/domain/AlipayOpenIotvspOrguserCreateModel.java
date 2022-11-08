package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.open.iotvsp.orguserinfo.query
 *
 * @author auto create
 * @since 1.0, 2022-03-31 02:08:28
 */
public class AlipayOpenIotvspOrguserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5766235175642595844L;

	/**
	 * 授权的appId
	 */
	@ApiField("authorize_app_id")
	private String authorizeAppId;

	/**
	 * 授权appid的pid，不一定是isv本人的pid
	 */
	@ApiField("authorize_app_pid")
	private String authorizeAppPid;

	/**
	 * 人员数据的流水ID，用于核身组件初始化参数
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，IDENTITY_CARD身份证，PASS_PORT护照，STU_NUM学生学号，COMPANY_NUM工号，TAIWAN_CARD台胞证，HK_MC_CARD港澳证件
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 签约主体外标id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 签约主体类型，1机构2机构集，和签约主体id配合使用
	 */
	@ApiField("entity_type")
	private Long entityType;

	/**
	 * 用户额外信息
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * isv英文名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	public String getAuthorizeAppId() {
		return this.authorizeAppId;
	}
	public void setAuthorizeAppId(String authorizeAppId) {
		this.authorizeAppId = authorizeAppId;
	}

	public String getAuthorizeAppPid() {
		return this.authorizeAppPid;
	}
	public void setAuthorizeAppPid(String authorizeAppPid) {
		this.authorizeAppPid = authorizeAppPid;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
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

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Long getEntityType() {
		return this.entityType;
	}
	public void setEntityType(Long entityType) {
		this.entityType = entityType;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
