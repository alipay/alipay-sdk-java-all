package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料版本信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 11:35:04
 */
public class AssetItemVersion extends AlipayObject {

	private static final long serialVersionUID = 5483416688317581455L;

	/**
	 * 物料BOM信息
	 */
	@ApiListField("bom_items")
	@ApiField("asset_bom_item")
	private List<AssetBomItem> bomItems;

	/**
	 * 物料设计稿信息
	 */
	@ApiListField("design_img")
	@ApiField("asset_file_info")
	private List<AssetFileInfo> designImg;

	/**
	 * 物料效果图信息
	 */
	@ApiListField("effect_img")
	@ApiField("asset_file_info")
	private List<AssetFileInfo> effectImg;

	/**
	 * 物料版本号
	 */
	@ApiField("item_version")
	private Long itemVersion;

	/**
	 * 物料当前版本的状态
	 */
	@ApiField("status")
	private String status;

	public List<AssetBomItem> getBomItems() {
		return this.bomItems;
	}
	public void setBomItems(List<AssetBomItem> bomItems) {
		this.bomItems = bomItems;
	}

	public List<AssetFileInfo> getDesignImg() {
		return this.designImg;
	}
	public void setDesignImg(List<AssetFileInfo> designImg) {
		this.designImg = designImg;
	}

	public List<AssetFileInfo> getEffectImg() {
		return this.effectImg;
	}
	public void setEffectImg(List<AssetFileInfo> effectImg) {
		this.effectImg = effectImg;
	}

	public Long getItemVersion() {
		return this.itemVersion;
	}
	public void setItemVersion(Long itemVersion) {
		this.itemVersion = itemVersion;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
