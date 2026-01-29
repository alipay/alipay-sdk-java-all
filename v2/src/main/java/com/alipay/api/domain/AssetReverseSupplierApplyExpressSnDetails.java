package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 该数据结构用于承载供应商发起未妥投对应的运单号和sn列表
 *
 * @author auto create
 * @since 1.0, 2025-07-24 17:27:19
 */
public class AssetReverseSupplierApplyExpressSnDetails extends AlipayObject {

	private static final long serialVersionUID = 5761642831236987195L;

	/**
	 * 未妥投申请数量，无SN未妥投时必传
	 */
	@ApiField("apply_count")
	private String applyCount;

	/**
	 * 逆向退回的物料明细：后续供应商收货拆包后直接扫描品条码，若判断品名有sn则需仓库进行sn信息反馈
	 */
	@ApiListField("asset_reverse_item_details")
	@ApiField("asset_reverse_item_detail")
	private List<AssetReverseItemDetail> assetReverseItemDetails;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_infos")
	private LogisticsInfo logisticsInfos;

	/**
	 * sn列表
	 */
	@ApiListField("sn_records")
	@ApiField("string")
	private List<String> snRecords;

	public String getApplyCount() {
		return this.applyCount;
	}
	public void setApplyCount(String applyCount) {
		this.applyCount = applyCount;
	}

	public List<AssetReverseItemDetail> getAssetReverseItemDetails() {
		return this.assetReverseItemDetails;
	}
	public void setAssetReverseItemDetails(List<AssetReverseItemDetail> assetReverseItemDetails) {
		this.assetReverseItemDetails = assetReverseItemDetails;
	}

	public LogisticsInfo getLogisticsInfos() {
		return this.logisticsInfos;
	}
	public void setLogisticsInfos(LogisticsInfo logisticsInfos) {
		this.logisticsInfos = logisticsInfos;
	}

	public List<String> getSnRecords() {
		return this.snRecords;
	}
	public void setSnRecords(List<String> snRecords) {
		this.snRecords = snRecords;
	}

}
