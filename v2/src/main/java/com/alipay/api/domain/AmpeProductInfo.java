package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 产品信息
 *
 * @author auto create
 * @since 1.0, 2023-10-16 19:33:09
 */
public class AmpeProductInfo extends AlipayObject {

	private static final long serialVersionUID = 4672282458753933328L;

	/**
	 * 类目描述
	 */
	@ApiField("category_desc")
	private String categoryDesc;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 设备机型列表
	 */
	@ApiListField("device_model_list")
	@ApiField("ampe_device_model_info")
	private List<AmpeDeviceModelInfo> deviceModelList;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备类型描述
	 */
	@ApiField("device_type_desc")
	private String deviceTypeDesc;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 调用的appId
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 产品图片
	 */
	@ApiField("product_pic")
	private String productPic;

	/**
	 * 拒绝原因
	 */
	@ApiField("reject_memo")
	private String rejectMemo;

	/**
	 * 出货量
	 */
	@ApiField("ship_quantity")
	private Long shipQuantity;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 审核状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	public String getCategoryDesc() {
		return this.categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<AmpeDeviceModelInfo> getDeviceModelList() {
		return this.deviceModelList;
	}
	public void setDeviceModelList(List<AmpeDeviceModelInfo> deviceModelList) {
		this.deviceModelList = deviceModelList;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceTypeDesc() {
		return this.deviceTypeDesc;
	}
	public void setDeviceTypeDesc(String deviceTypeDesc) {
		this.deviceTypeDesc = deviceTypeDesc;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInvokeAppId() {
		return this.invokeAppId;
	}
	public void setInvokeAppId(String invokeAppId) {
		this.invokeAppId = invokeAppId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPic() {
		return this.productPic;
	}
	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}

	public String getRejectMemo() {
		return this.rejectMemo;
	}
	public void setRejectMemo(String rejectMemo) {
		this.rejectMemo = rejectMemo;
	}

	public Long getShipQuantity() {
		return this.shipQuantity;
	}
	public void setShipQuantity(Long shipQuantity) {
		this.shipQuantity = shipQuantity;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
