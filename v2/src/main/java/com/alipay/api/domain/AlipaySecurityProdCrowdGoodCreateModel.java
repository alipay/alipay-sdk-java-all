package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 友活任务创建
 *
 * @author auto create
 * @since 1.0, 2026-08-07 14:53:40
 */
public class AlipaySecurityProdCrowdGoodCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5388735471372875451L;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 批次号，用于某一个任务批次的批量操作
	 */
	@ApiField("batch_number")
	private String batchNumber;

	/**
	 * 业务id，包括POI_ID，PID，SN
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * POI_ID
	 */
	@ApiField("business_id_type")
	private String businessIdType;

	/**
	 * 城市编码，上海市：310100
	 */
	@ApiField("city_code")
	private Long cityCode;

	/**
	 * 任务描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 额外参数，json string格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * LEAD：找店
	 */
	@ApiField("good_type")
	private String goodType;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 店铺名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * OFFLINE_OPERATION，线下任务
	 */
	@ApiField("operation_mode")
	private String operationMode;

	/**
	 * 6位员工号，可留空
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 外部业务 id,幂等控制;不填不校验幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 模板替换字符json string，比如{"shop_name" : "全家便利店"}
	 */
	@ApiField("place_holder")
	private String placeHolder;

	/**
	 * 客户id
	 */
	@ApiField("shop_id")
	private Long shopId;

	/**
	 * 模版id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 任务库存，默认为1，单位是个
	 */
	@ApiField("total")
	private Long total;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBatchNumber() {
		return this.batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessIdType() {
		return this.businessIdType;
	}
	public void setBusinessIdType(String businessIdType) {
		this.businessIdType = businessIdType;
	}

	public Long getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGoodType() {
		return this.goodType;
	}
	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperationMode() {
		return this.operationMode;
	}
	public void setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getPlaceHolder() {
		return this.placeHolder;
	}
	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
