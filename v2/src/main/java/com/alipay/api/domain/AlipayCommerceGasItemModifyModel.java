package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加油商品更新
 *
 * @author auto create
 * @since 1.0, 2025-12-10 17:12:42
 */
public class AlipayCommerceGasItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7218581257478939558L;

	/**
	 * 商品详情地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 商品扩展信息：可以解析成 Map 的 json string
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部商品ID
	 */
	@ApiField("external_item_id")
	private String externalItemId;

	/**
	 * 前台类目id：target_type + target_id 和 front_category_id 二选一
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	/**
	 * 商品id(和external_item_id不能同时为空)
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * null
	 */
	@ApiListField("label_list")
	@ApiField("fuel_item_label_create_info")
	private List<FuelItemLabelCreateInfo> labelList;

	/**
	 * 商品主图
	 */
	@ApiField("main_pic")
	private String mainPic;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 更新时间戳（只处理时间戳最大的一次请求）
	 */
	@ApiField("op_timestamp")
	private Long opTimestamp;

	/**
	 * 场景：GAS_CHARGE（加油）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * null
	 */
	@ApiListField("sku_list")
	@ApiField("fuel_item_sku_create_info")
	private List<FuelItemSkuCreateInfo> skuList;

	/**
	 * 商品状态： EFFECT（有效）、 INVALID（无效）
	 */
	@ApiField("status")
	private String status;

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalItemId() {
		return this.externalItemId;
	}
	public void setExternalItemId(String externalItemId) {
		this.externalItemId = externalItemId;
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

	public List<FuelItemLabelCreateInfo> getLabelList() {
		return this.labelList;
	}
	public void setLabelList(List<FuelItemLabelCreateInfo> labelList) {
		this.labelList = labelList;
	}

	public String getMainPic() {
		return this.mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOpTimestamp() {
		return this.opTimestamp;
	}
	public void setOpTimestamp(Long opTimestamp) {
		this.opTimestamp = opTimestamp;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<FuelItemSkuCreateInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<FuelItemSkuCreateInfo> skuList) {
		this.skuList = skuList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
