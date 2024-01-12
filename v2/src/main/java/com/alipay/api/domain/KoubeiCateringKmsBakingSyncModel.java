package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * kms烘焙数据同步
 *
 * @author auto create
 * @since 1.0, 2020-11-24 15:51:29
 */
public class KoubeiCateringKmsBakingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4659219512964864814L;

	/**
	 * 同步:sync;
核对:check;
	 */
	@ApiField("action")
	private String action;

	/**
	 * 核对数据，如果action=check则必填
	 */
	@ApiField("check_data")
	private KmsBakingCheckDTO checkData;

	/**
	 * 烘焙库存数据，根据type选填，一次最多批量同步100条数据。
	 */
	@ApiListField("inventory_data")
	@ApiField("kms_baking_inventory_d_t_o")
	private List<KmsBakingInventoryDTO> inventoryData;

	/**
	 * 烘焙营销数据，根据type选填，一次最多批量同步100条数据。
	 */
	@ApiListField("promotion_data")
	@ApiField("kms_baking_promotion_d_t_o")
	private List<KmsBakingPromotionDTO> promotionData;

	/**
	 * 口碑门店Id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 库存：inventory
营销：promotion
	 */
	@ApiField("type")
	private String type;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public KmsBakingCheckDTO getCheckData() {
		return this.checkData;
	}
	public void setCheckData(KmsBakingCheckDTO checkData) {
		this.checkData = checkData;
	}

	public List<KmsBakingInventoryDTO> getInventoryData() {
		return this.inventoryData;
	}
	public void setInventoryData(List<KmsBakingInventoryDTO> inventoryData) {
		this.inventoryData = inventoryData;
	}

	public List<KmsBakingPromotionDTO> getPromotionData() {
		return this.promotionData;
	}
	public void setPromotionData(List<KmsBakingPromotionDTO> promotionData) {
		this.promotionData = promotionData;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
