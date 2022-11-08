package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * IoT三方运营数据上报接口
 *
 * @author auto create
 * @since 1.0, 2022-06-09 13:42:13
 */
public class AlipayOpenIotbpaasOperationdataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1493892597941542416L;

	/**
	 * 日期字符串，格式为yyyyMMdd
	 */
	@ApiField("date")
	private String date;

	/**
	 * 设备biztid，没有可不传
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 运营数据列表
	 */
	@ApiListField("operation_data_list")
	@ApiField("operation_data")
	private List<OperationData> operationDataList;

	/**
	 * 商户PID，直连商户传递
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 门店地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 门店唯一编号（可以是商户自定义商户id）
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 直连商户传 PID，间连商户传 SMID
	 */
	@ApiField("smid")
	private String smid;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public List<OperationData> getOperationDataList() {
		return this.operationDataList;
	}
	public void setOperationDataList(List<OperationData> operationDataList) {
		this.operationDataList = operationDataList;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
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

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
