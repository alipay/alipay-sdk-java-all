package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:07:41
 */
public class AlipayOpenSpNcoilopenOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1649624895711229297L;

	/** 
	 * 实际发货时间
	 */
	@ApiField("actual_delivery_time")
	private Date actualDeliveryTime;

	/** 
	 * 创建申请单的时候的描述信息
	 */
	@ApiField("apply_describe")
	private String applyDescribe;

	/** 
	 * 申请单id
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 申请时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/** 
	 * 场景code
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/** 
	 * 资源id
	 */
	@ApiField("biz_scene_resource_id")
	private String bizSceneResourceId;

	/** 
	 * 物料excel文件url
	 */
	@ApiField("download_materials_excel_url")
	private String downloadMaterialsExcelUrl;

	/** 
	 * 预计交货时间
	 */
	@ApiField("estimated_delivery_time")
	private Date estimatedDeliveryTime;

	/** 
	 * 预计交付门店数
	 */
	@ApiField("estimated_shop_sum")
	private Date estimatedShopSum;

	/** 
	 * 期望发货时间
	 */
	@ApiField("expected_delivery_time")
	private Date expectedDeliveryTime;

	/** 
	 * excel文件fileId
	 */
	@ApiField("materials_excel_file_id")
	private String materialsExcelFileId;

	/** 
	 * 物料中枢
	 */
	@ApiField("materials_total")
	private Long materialsTotal;

	/** 
	 * 如果订单已经送产，会有生产单号
	 */
	@ApiField("production_order_no")
	private String productionOrderNo;

	/** 
	 * 如果审批单被撤销了，会填写撤销原因
	 */
	@ApiField("revoke_reason")
	private String revokeReason;

	/** 
	 * 申请单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 供应商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public void setActualDeliveryTime(Date actualDeliveryTime) {
		this.actualDeliveryTime = actualDeliveryTime;
	}
	public Date getActualDeliveryTime( ) {
		return this.actualDeliveryTime;
	}

	public void setApplyDescribe(String applyDescribe) {
		this.applyDescribe = applyDescribe;
	}
	public String getApplyDescribe( ) {
		return this.applyDescribe;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getApplyTime( ) {
		return this.applyTime;
	}

	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}
	public String getBizSceneCode( ) {
		return this.bizSceneCode;
	}

	public void setBizSceneResourceId(String bizSceneResourceId) {
		this.bizSceneResourceId = bizSceneResourceId;
	}
	public String getBizSceneResourceId( ) {
		return this.bizSceneResourceId;
	}

	public void setDownloadMaterialsExcelUrl(String downloadMaterialsExcelUrl) {
		this.downloadMaterialsExcelUrl = downloadMaterialsExcelUrl;
	}
	public String getDownloadMaterialsExcelUrl( ) {
		return this.downloadMaterialsExcelUrl;
	}

	public void setEstimatedDeliveryTime(Date estimatedDeliveryTime) {
		this.estimatedDeliveryTime = estimatedDeliveryTime;
	}
	public Date getEstimatedDeliveryTime( ) {
		return this.estimatedDeliveryTime;
	}

	public void setEstimatedShopSum(Date estimatedShopSum) {
		this.estimatedShopSum = estimatedShopSum;
	}
	public Date getEstimatedShopSum( ) {
		return this.estimatedShopSum;
	}

	public void setExpectedDeliveryTime(Date expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}
	public Date getExpectedDeliveryTime( ) {
		return this.expectedDeliveryTime;
	}

	public void setMaterialsExcelFileId(String materialsExcelFileId) {
		this.materialsExcelFileId = materialsExcelFileId;
	}
	public String getMaterialsExcelFileId( ) {
		return this.materialsExcelFileId;
	}

	public void setMaterialsTotal(Long materialsTotal) {
		this.materialsTotal = materialsTotal;
	}
	public Long getMaterialsTotal( ) {
		return this.materialsTotal;
	}

	public void setProductionOrderNo(String productionOrderNo) {
		this.productionOrderNo = productionOrderNo;
	}
	public String getProductionOrderNo( ) {
		return this.productionOrderNo;
	}

	public void setRevokeReason(String revokeReason) {
		this.revokeReason = revokeReason;
	}
	public String getRevokeReason( ) {
		return this.revokeReason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierId( ) {
		return this.supplierId;
	}

}
