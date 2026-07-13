package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店预约配置复制
 *
 * @author auto create
 * @since 1.0, 2026-05-09 16:02:45
 */
public class AlipayCommerceLifeserviceShopCopyModel extends AlipayObject {

	private static final long serialVersionUID = 7291278478721856589L;

	/**
	 * 复制类型
	 */
	@ApiField("copy_type")
	private String copyType;

	/**
	 * 复制源
	 */
	@ApiField("source_shop_id")
	private String sourceShopId;

	/**
	 * null
	 */
	@ApiListField("target_out_shop_ids")
	@ApiField("string")
	private List<String> targetOutShopIds;

	/**
	 * null
	 */
	@ApiListField("target_shop_ids")
	@ApiField("string")
	private List<String> targetShopIds;

	public String getCopyType() {
		return this.copyType;
	}
	public void setCopyType(String copyType) {
		this.copyType = copyType;
	}

	public String getSourceShopId() {
		return this.sourceShopId;
	}
	public void setSourceShopId(String sourceShopId) {
		this.sourceShopId = sourceShopId;
	}

	public List<String> getTargetOutShopIds() {
		return this.targetOutShopIds;
	}
	public void setTargetOutShopIds(List<String> targetOutShopIds) {
		this.targetOutShopIds = targetOutShopIds;
	}

	public List<String> getTargetShopIds() {
		return this.targetShopIds;
	}
	public void setTargetShopIds(List<String> targetShopIds) {
		this.targetShopIds = targetShopIds;
	}

}
