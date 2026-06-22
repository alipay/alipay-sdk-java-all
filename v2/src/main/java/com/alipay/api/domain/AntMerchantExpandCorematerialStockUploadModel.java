package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核心原材料库存信息上传
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:19:48
 */
public class AntMerchantExpandCorematerialStockUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4753725583946254771L;

	/**
	 * 库存信息
	 */
	@ApiListField("stock_data_list")
	@ApiField("core_material_stock_data")
	private List<CoreMaterialStockData> stockDataList;

	/**
	 * 出入库明细信息
	 */
	@ApiListField("stock_detail_list")
	@ApiField("core_material_stock_detail")
	private List<CoreMaterialStockDetail> stockDetailList;

	/**
	 * 批次号，用于幂等
	 */
	@ApiField("upload_batch_no")
	private String uploadBatchNo;

	/**
	 * 上传类型：STOCK_COUNT-库存数量（覆盖式更新）/STOCK_DETAIL-出入库明细
	 */
	@ApiField("upload_type")
	private String uploadType;

	public List<CoreMaterialStockData> getStockDataList() {
		return this.stockDataList;
	}
	public void setStockDataList(List<CoreMaterialStockData> stockDataList) {
		this.stockDataList = stockDataList;
	}

	public List<CoreMaterialStockDetail> getStockDetailList() {
		return this.stockDetailList;
	}
	public void setStockDetailList(List<CoreMaterialStockDetail> stockDetailList) {
		this.stockDetailList = stockDetailList;
	}

	public String getUploadBatchNo() {
		return this.uploadBatchNo;
	}
	public void setUploadBatchNo(String uploadBatchNo) {
		this.uploadBatchNo = uploadBatchNo;
	}

	public String getUploadType() {
		return this.uploadType;
	}
	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

}
