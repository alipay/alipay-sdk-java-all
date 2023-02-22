package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料生产指令对象, 包括物料生产的相关信息: 订单明细ID, 申请单号, 模板ID, 物料名称, 物料图片Url, 数量,  申请日期,收货人姓名,联系人电话,收货人地址等.
 *
 * @author auto create
 * @since 1.0, 2022-11-28 16:03:14
 */
public class AssetProduceItem extends AlipayObject {

	private static final long serialVersionUID = 7772155722124446478L;

	/**
	 * 生产指令动作类别：套组则为ASSEMBLE，组装
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 申请日期，格式yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 申请单号
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 收钱码吊牌和贴纸类型不为空; 
物料图片Url，供应商使用该图片进行物料打印
	 */
	@ApiField("asset_pic_url")
	private String assetPicUrl;

	/**
	 * 目前只有空码生产的码图片url从这里获取
	 */
	@ApiField("asset_resource")
	private String assetResource;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 业务线
	 */
	@ApiField("biz_line")
	private String bizLine;

	/**
	 * 业务渠道
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 线下供应商区分业务流
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * city
	 */
	@ApiField("city")
	private String city;

	/**
	 * 数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 订单创建时间, 格式: yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 1 - 旧模式, 需要在生产完成时反馈运单号 ; 2 - 新模式, 不需要在生产完成时反馈运单号
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 物流公司代码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流运单号; 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 生产指令描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 公司主体代码
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 公司主体名
	 */
	@ApiField("ou_name")
	private String ouName;

	/**
	 * 1. 如果该物料是套组的子物料, 那么该值为套组物料id; 2, 其他情况和物料id(即, item_id)一致或者为空.
	 */
	@ApiField("parent_template_id")
	private String parentTemplateId;

	/**
	 * 收件人地址邮编; 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("postcode")
	private String postcode;

	/**
	 * 面单打印信息
	 */
	@ApiField("print_data")
	private String printData;

	/**
	 * 生产单号
	 */
	@ApiField("produce_order")
	private String produceOrder;

	/**
	 * 供应商全称
	 */
	@ApiField("produce_supplier_full_name")
	private String produceSupplierFullName;

	/**
	 * 供应商ID
	 */
	@ApiField("produce_supplier_id")
	private String produceSupplierId;

	/**
	 * 供应商名称
	 */
	@ApiField("produce_supplier_name")
	private String produceSupplierName;

	/**
	 * 生产模式类型，用于供应商区分业务是：直发生产还是备货生产
	 */
	@ApiField("produce_type")
	private String produceType;

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
	 * 物料供应商PID，和调用方的供应商PID一致
	 */
	@ApiField("supplier_pid")
	private String supplierPid;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称，线下约定的物料名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 动作
	 */
	@ApiField("work_process")
	private String workProcess;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	public String getAssetPicUrl() {
		return this.assetPicUrl;
	}
	public void setAssetPicUrl(String assetPicUrl) {
		this.assetPicUrl = assetPicUrl;
	}

	public String getAssetResource() {
		return this.assetResource;
	}
	public void setAssetResource(String assetResource) {
		this.assetResource = assetResource;
	}

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getBizLine() {
		return this.bizLine;
	}
	public void setBizLine(String bizLine) {
		this.bizLine = bizLine;
	}

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getOuName() {
		return this.ouName;
	}
	public void setOuName(String ouName) {
		this.ouName = ouName;
	}

	public String getParentTemplateId() {
		return this.parentTemplateId;
	}
	public void setParentTemplateId(String parentTemplateId) {
		this.parentTemplateId = parentTemplateId;
	}

	public String getPostcode() {
		return this.postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPrintData() {
		return this.printData;
	}
	public void setPrintData(String printData) {
		this.printData = printData;
	}

	public String getProduceOrder() {
		return this.produceOrder;
	}
	public void setProduceOrder(String produceOrder) {
		this.produceOrder = produceOrder;
	}

	public String getProduceSupplierFullName() {
		return this.produceSupplierFullName;
	}
	public void setProduceSupplierFullName(String produceSupplierFullName) {
		this.produceSupplierFullName = produceSupplierFullName;
	}

	public String getProduceSupplierId() {
		return this.produceSupplierId;
	}
	public void setProduceSupplierId(String produceSupplierId) {
		this.produceSupplierId = produceSupplierId;
	}

	public String getProduceSupplierName() {
		return this.produceSupplierName;
	}
	public void setProduceSupplierName(String produceSupplierName) {
		this.produceSupplierName = produceSupplierName;
	}

	public String getProduceType() {
		return this.produceType;
	}
	public void setProduceType(String produceType) {
		this.produceType = produceType;
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

	public String getSupplierPid() {
		return this.supplierPid;
	}
	public void setSupplierPid(String supplierPid) {
		this.supplierPid = supplierPid;
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

	public String getWorkProcess() {
		return this.workProcess;
	}
	public void setWorkProcess(String workProcess) {
		this.workProcess = workProcess;
	}

}
