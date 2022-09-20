package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索运营工单模块信息
 *
 * @author auto create
 * @since 1.0, 2021-11-04 10:06:40
 */
public class BrandDetail extends AlipayObject {

	private static final long serialVersionUID = 2351814913536139149L;

	/**
	 * 搜索工单详情数据block_type
	 */
	@ApiField("block_type")
	private String blockType;

	/**
	 * 版本号
	 */
	@ApiField("box_version")
	private String boxVersion;

	/**
	 * 描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * img地址
	 */
	@ApiField("img")
	private String img;

	/**
	 * 索引信息
	 */
	@ApiField("index")
	private String index;

	/**
	 * 工单详情数据key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 工单详情数据material_id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 应用名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 搜索运营工单详情数据public_bind_app_id
	 */
	@ApiField("public_bind_app_id")
	private String publicBindAppId;

	/**
	 * 服务码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getBlockType() {
		return this.blockType;
	}
	public void setBlockType(String blockType) {
		this.blockType = blockType;
	}

	public String getBoxVersion() {
		return this.boxVersion;
	}
	public void setBoxVersion(String boxVersion) {
		this.boxVersion = boxVersion;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImg() {
		return this.img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public String getIndex() {
		return this.index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPublicBindAppId() {
		return this.publicBindAppId;
	}
	public void setPublicBindAppId(String publicBindAppId) {
		this.publicBindAppId = publicBindAppId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
