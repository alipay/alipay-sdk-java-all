package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceApplyOrderItemModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayCommerceIotDapplyOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8295838539516575731L;

	/** 
	 * 申请人联系电话
	 */
	@ApiField("applicant_mobile")
	private String applicantMobile;

	/** 
	 * 申请人名称
	 */
	@ApiField("applicant_name")
	private String applicantName;

	/** 
	 * 申请人pid
	 */
	@ApiField("applicant_pid")
	private String applicantPid;

	/** 
	 * 申请人类型，填：ALIPAY_MEMBER
	 */
	@ApiField("applicant_type")
	private String applicantType;

	/** 
	 * 申请数量，order_item_list每个元素apply_amount之和
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/** 
	 * 物料申请单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	/** 
	 * 物料申请模式，填：
	 */
	@ApiField("asset_apply_type")
	private String assetApplyType;

	/** 
	 * 创建人，填供应商pid
	 */
	@ApiField("creator")
	private String creator;

	/** 
	 * 设备子单集合
	 */
	@ApiListField("device_apply_order_item_models")
	@ApiField("device_apply_order_item_model")
	private List<DeviceApplyOrderItemModel> deviceApplyOrderItemModels;

	/** 
	 * 扩展信息，用于透出 机具类型，请求开票信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 订单号
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 行业场景,填：
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 行业场景名称，填：供应商自发货
	 */
	@ApiField("scene_name")
	private String sceneName;

	/** 
	 * 店铺Id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 来源渠道, 供应商系统为：DSUPPLIER
	 */
	@ApiField("source_code")
	private String sourceCode;

	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantMobile( ) {
		return this.applicantMobile;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantName( ) {
		return this.applicantName;
	}

	public void setApplicantPid(String applicantPid) {
		this.applicantPid = applicantPid;
	}
	public String getApplicantPid( ) {
		return this.applicantPid;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	public String getApplicantType( ) {
		return this.applicantType;
	}

	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}
	public String getApplyAmount( ) {
		return this.applyAmount;
	}

	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}
	public String getAssetApplyOrderId( ) {
		return this.assetApplyOrderId;
	}

	public void setAssetApplyType(String assetApplyType) {
		this.assetApplyType = assetApplyType;
	}
	public String getAssetApplyType( ) {
		return this.assetApplyType;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator( ) {
		return this.creator;
	}

	public void setDeviceApplyOrderItemModels(List<DeviceApplyOrderItemModel> deviceApplyOrderItemModels) {
		this.deviceApplyOrderItemModels = deviceApplyOrderItemModels;
	}
	public List<DeviceApplyOrderItemModel> getDeviceApplyOrderItemModels( ) {
		return this.deviceApplyOrderItemModels;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}
	public String getSceneName( ) {
		return this.sceneName;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	public String getSourceCode( ) {
		return this.sourceCode;
	}

}
