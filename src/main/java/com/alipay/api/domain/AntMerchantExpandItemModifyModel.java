package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品修改接口
 *
 * @author auto create
 * @since 1.0, 2019-01-18 10:43:20
 */
public class AntMerchantExpandItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4668855881744171641L;

	/**
	 * 商品扩展信息：可以解析成 Map<String, String> 的 json string
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 前台类目id, null表示未分类
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品标签列表，null表示不修改标签列表，空list表示清空标签
	 */
	@ApiListField("label_list")
	@ApiField("item_label_modify_info")
	private List<ItemLabelModifyInfo> labelList;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 场景：GAS_CHARGE（加油）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 商品sku列表，至少有一个
	 */
	@ApiListField("sku_list")
	@ApiField("item_sku_modify_info")
	private List<ItemSkuModifyInfo> skuList;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<ItemLabelModifyInfo> getLabelList() {
		return this.labelList;
	}
	public void setLabelList(List<ItemLabelModifyInfo> labelList) {
		this.labelList = labelList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<ItemSkuModifyInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<ItemSkuModifyInfo> skuList) {
		this.skuList = skuList;
	}

}
