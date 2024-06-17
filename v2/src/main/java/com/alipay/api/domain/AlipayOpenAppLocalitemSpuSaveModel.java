package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序本地商品SPU保存
 *
 * @author auto create
 * @since 1.0, 2024-03-28 11:44:06
 */
public class AlipayOpenAppLocalitemSpuSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6364822688136715564L;

	/**
	 * 属性KV列表，通过alipay.open.app.localitem.template.query获取本地商品模板信息接口得到商品属性key，is_required=1时属性必填
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/**
	 * 商品类目ID，可通过alipay.open.app.localitem.allcategory.query接口获取
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 外部标品id，要求 APPID 下全局唯一
	 */
	@ApiField("out_spu_id")
	private String outSpuId;

	/**
	 * 标品id
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 标品名称
	 */
	@ApiField("spu_name")
	private String spuName;

	/**
	 * 标品状态
	 */
	@ApiField("spu_status")
	private String spuStatus;

	public List<AppItemAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<AppItemAttrVO> attrs) {
		this.attrs = attrs;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getOutSpuId() {
		return this.outSpuId;
	}
	public void setOutSpuId(String outSpuId) {
		this.outSpuId = outSpuId;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getSpuName() {
		return this.spuName;
	}
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public String getSpuStatus() {
		return this.spuStatus;
	}
	public void setSpuStatus(String spuStatus) {
		this.spuStatus = spuStatus;
	}

}
