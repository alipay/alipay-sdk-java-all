package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达基本信息
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:28:44
 */
public class SearchBoxBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 8298236414646594522L;

	/**
	 * 搜索直达配置id
	 */
	@ApiField("box_id")
	private String boxId;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 搜索直达名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 搜索直达配置状态，INITIAL-初始/ONLINE-已上架/EXPIRE-已失效/OFFLINE-已下架
	 */
	@ApiField("status")
	private String status;

	/**
	 * 小程序id
	 */
	@ApiField("target_appid")
	private String targetAppid;

	public String getBoxId() {
		return this.boxId;
	}
	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}
