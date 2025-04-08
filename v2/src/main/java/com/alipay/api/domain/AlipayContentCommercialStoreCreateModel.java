package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商创建店铺
 *
 * @author auto create
 * @since 1.0, 2024-06-14 14:08:08
 */
public class AlipayContentCommercialStoreCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7658424864197116786L;

	/**
	 * 服务市场商品编号
	 */
	@ApiField("access_code")
	private String accessCode;

	/**
	 * 店铺接入模式
	 */
	@ApiField("access_model")
	private String accessModel;

	/**
	 * 店铺名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商家oid和owner_pid不能同时为空
	 */
	@ApiField("owner_oid")
	private String ownerOid;

	/**
	 * 商家pid和owner_oId不能同时为空
	 */
	@ApiField("owner_pid")
	private String ownerPid;

	/**
	 * 用户类型：当前场景下用户类型只有商户
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 生活号ID（非必须）
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 店铺业务ID(小程序ID)
	 */
	@ApiField("store_biz_id")
	private String storeBizId;

	/**
	 * 店铺子类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 店铺类型
	 */
	@ApiField("type")
	private String type;

	public String getAccessCode() {
		return this.accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getAccessModel() {
		return this.accessModel;
	}
	public void setAccessModel(String accessModel) {
		this.accessModel = accessModel;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerOid() {
		return this.ownerOid;
	}
	public void setOwnerOid(String ownerOid) {
		this.ownerOid = ownerOid;
	}

	public String getOwnerPid() {
		return this.ownerPid;
	}
	public void setOwnerPid(String ownerPid) {
		this.ownerPid = ownerPid;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getStoreBizId() {
		return this.storeBizId;
	}
	public void setStoreBizId(String storeBizId) {
		this.storeBizId = storeBizId;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
