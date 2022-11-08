package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起文件存证上链请求
 *
 * @author auto create
 * @since 1.0, 2022-07-07 18:59:54
 */
public class AlipayBossProdAntlegalchainFilenotaryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1858198692141687536L;

	/**
	 * 业务应用英文名
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 业务线
	 */
	@ApiField("business_line_code")
	private String businessLineCode;

	/**
	 * 业务唯一流水id，业务数据请求唯一标识
	 */
	@ApiField("business_unique_id")
	private String businessUniqueId;

	/**
	 * 客户的实名信息，注意不能和entity的certno相同
	 */
	@ApiField("customer")
	private IdentityDTO customer;

	/**
	 * 自己的实名信息
	 */
	@ApiField("entity")
	private IdentityDTO entity;

	/**
	 * 文件id,从openapi接口alipay.boss.prod.antlegalchain.notary.upload获得file_id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 位置信息
	 */
	@ApiField("location")
	private LocationDTO location;

	/**
	 * 场景值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 提交人姓名
	 */
	@ApiField("submitter_name")
	private String submitterName;

	/**
	 * 提交人用户id
	 */
	@ApiField("submitter_uid")
	private String submitterUid;

	/**
	 * 租户信息
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 业务系统被分配的密钥key
	 */
	@ApiField("token_key")
	private String tokenKey;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getBusinessLineCode() {
		return this.businessLineCode;
	}
	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}

	public String getBusinessUniqueId() {
		return this.businessUniqueId;
	}
	public void setBusinessUniqueId(String businessUniqueId) {
		this.businessUniqueId = businessUniqueId;
	}

	public IdentityDTO getCustomer() {
		return this.customer;
	}
	public void setCustomer(IdentityDTO customer) {
		this.customer = customer;
	}

	public IdentityDTO getEntity() {
		return this.entity;
	}
	public void setEntity(IdentityDTO entity) {
		this.entity = entity;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public LocationDTO getLocation() {
		return this.location;
	}
	public void setLocation(LocationDTO location) {
		this.location = location;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSubmitterName() {
		return this.submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public String getSubmitterUid() {
		return this.submitterUid;
	}
	public void setSubmitterUid(String submitterUid) {
		this.submitterUid = submitterUid;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getTokenKey() {
		return this.tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

}
