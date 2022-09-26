package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌box基础信息
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:46
 */
public class BoxExclusiveBase extends AlipayObject {

	private static final long serialVersionUID = 1171753459968538564L;

	/**
	 * box基础工单信息
	 */
	@ApiField("base_order_info")
	private BoxOrderStatusInfo baseOrderInfo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * box描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 2020111621000215527749
	 */
	@ApiField("main_id")
	private String mainId;

	/**
	 * box关联的服务类型
	 */
	@ApiField("main_type")
	private String mainType;

	/**
	 * 素材类型（图片/视频）
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 素材地址
	 */
	@ApiField("material_url")
	private String materialUrl;

	/**
	 * box关联的pid
	 */
	@ApiField("pid")
	private String pid;

	public BoxOrderStatusInfo getBaseOrderInfo() {
		return this.baseOrderInfo;
	}
	public void setBaseOrderInfo(BoxOrderStatusInfo baseOrderInfo) {
		this.baseOrderInfo = baseOrderInfo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMainId() {
		return this.mainId;
	}
	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public String getMainType() {
		return this.mainType;
	}
	public void setMainType(String mainType) {
		this.mainType = mainType;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getMaterialUrl() {
		return this.materialUrl;
	}
	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
