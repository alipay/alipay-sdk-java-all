package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料采购单详情
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:40:45
 */
public class AccessPurchaseOrder extends AlipayObject {

	private static final long serialVersionUID = 3697957257276118384L;

	/**
	 * 申请日期, 格式:
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 申请订单明细号
	 */
	@ApiField("asset_item_id")
	private String assetItemId;

	/**
	 * 申请订单号
	 */
	@ApiField("asset_order_id")
	private String assetOrderId;

	/**
	 * 采购单号（订单汇总表ID）
	 */
	@ApiField("asset_purchase_id")
	private String assetPurchaseId;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 订单创建日期, 格式: yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 是否需要生产
	 */
	@ApiField("is_produce")
	private String isProduce;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 收货人地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 联系人电话
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 物料类型
	 */
	@ApiField("stuff_attr_name")
	private String stuffAttrName;

	/**
	 * 物料材质
	 */
	@ApiField("stuff_material")
	private String stuffMaterial;

	/**
	 * 物料尺寸
	 */
	@ApiField("stuff_size")
	private String stuffSize;

	/**
	 * 物料属性
	 */
	@ApiField("stuff_type")
	private String stuffType;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称，线下约定的物料名
	 */
	@ApiField("template_name")
	private String templateName;

	public String getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getAssetItemId() {
		return this.assetItemId;
	}
	public void setAssetItemId(String assetItemId) {
		this.assetItemId = assetItemId;
	}

	public String getAssetOrderId() {
		return this.assetOrderId;
	}
	public void setAssetOrderId(String assetOrderId) {
		this.assetOrderId = assetOrderId;
	}

	public String getAssetPurchaseId() {
		return this.assetPurchaseId;
	}
	public void setAssetPurchaseId(String assetPurchaseId) {
		this.assetPurchaseId = assetPurchaseId;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getIsProduce() {
		return this.isProduce;
	}
	public void setIsProduce(String isProduce) {
		this.isProduce = isProduce;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getStuffAttrName() {
		return this.stuffAttrName;
	}
	public void setStuffAttrName(String stuffAttrName) {
		this.stuffAttrName = stuffAttrName;
	}

	public String getStuffMaterial() {
		return this.stuffMaterial;
	}
	public void setStuffMaterial(String stuffMaterial) {
		this.stuffMaterial = stuffMaterial;
	}

	public String getStuffSize() {
		return this.stuffSize;
	}
	public void setStuffSize(String stuffSize) {
		this.stuffSize = stuffSize;
	}

	public String getStuffType() {
		return this.stuffType;
	}
	public void setStuffType(String stuffType) {
		this.stuffType = stuffType;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
