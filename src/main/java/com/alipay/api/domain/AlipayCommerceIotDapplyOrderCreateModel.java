package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁iot进件申请单创建接口
 *
 * @author auto create
 * @since 1.0, 2020-11-25 20:52:28
 */
public class AlipayCommerceIotDapplyOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8493343612476674965L;

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
	 * 申请人类型
	 */
	@ApiField("applicant_type")
	private String applicantType;

	/**
	 * 申请总数量，order_item_list每个元素apply_amount之和
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 物料申请模式
	 */
	@ApiField("asset_apply_type")
	private String assetApplyType;

	/**
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 订单创建子单集合
	 */
	@ApiListField("device_apply_order_item_models")
	@ApiField("device_apply_order_item_dto")
	private List<DeviceApplyOrderItemDto> deviceApplyOrderItemModels;

	/**
	 * 扩展字段，JSON字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 物料商品ID
	 */
	@ApiField("item_mall_id")
	private String itemMallId;

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
	 * 行业场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 行业场景名称
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

	public String getApplicantMobile() {
		return this.applicantMobile;
	}
	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}

	public String getApplicantName() {
		return this.applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantPid() {
		return this.applicantPid;
	}
	public void setApplicantPid(String applicantPid) {
		this.applicantPid = applicantPid;
	}

	public String getApplicantType() {
		return this.applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getAssetApplyType() {
		return this.assetApplyType;
	}
	public void setAssetApplyType(String assetApplyType) {
		this.assetApplyType = assetApplyType;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public List<DeviceApplyOrderItemDto> getDeviceApplyOrderItemModels() {
		return this.deviceApplyOrderItemModels;
	}
	public void setDeviceApplyOrderItemModels(List<DeviceApplyOrderItemDto> deviceApplyOrderItemModels) {
		this.deviceApplyOrderItemModels = deviceApplyOrderItemModels;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemMallId() {
		return this.itemMallId;
	}
	public void setItemMallId(String itemMallId) {
		this.itemMallId = itemMallId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

}
