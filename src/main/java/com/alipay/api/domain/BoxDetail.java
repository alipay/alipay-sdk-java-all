package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌box申请单提报详情
 *
 * @author auto create
 * @since 1.0, 2020-12-15 19:22:04
 */
public class BoxDetail extends AlipayObject {

	private static final long serialVersionUID = 3388835153381865797L;

	/**
	 * 品牌box所属biz_id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 应用类型
	 */
	@ApiField("block_type")
	private String blockType;

	/**
	 * 版本信息
	 */
	@ApiField("box_version")
	private String boxVersion;

	/**
	 * 详情描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片链接
	 */
	@ApiField("img")
	private String img;

	/**
	 * 品牌box数据索引
	 */
	@ApiField("index")
	private Long index;

	/**
	 * 品牌box所属material_id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 提报应用名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 品牌box所属sub_service_code
	 */
	@ApiField("sub_service_code")
	private String subServiceCode;

	/**
	 * 跳转url
	 */
	@ApiField("url")
	private String url;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

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

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
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

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getSubServiceCode() {
		return this.subServiceCode;
	}
	public void setSubServiceCode(String subServiceCode) {
		this.subServiceCode = subServiceCode;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
