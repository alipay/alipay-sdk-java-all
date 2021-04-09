package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * kds配置信息模型
 *
 * @author auto create
 * @since 1.0, 2018-12-21 17:20:39
 */
public class KdsInfoModel extends AlipayObject {

	private static final long serialVersionUID = 8263682742761235443L;

	/**
	 * 是否删除 false删除，true删除
	 */
	@ApiField("delete_flag")
	private Boolean deleteFlag;

	/**
	 * 设备列表
	 */
	@ApiListField("device_list")
	@ApiField("kds_device_model")
	private List<KdsDeviceModel> deviceList;

	/**
	 * 就餐模式可多选枚举如下：
TO_GO("TO_GO", "外带"),
TAKE_OUT("TAKE_OUT", "外卖"),
FOR_HERE("FOR_HERE", "堂食"),
全选回传ALL，ALL与其它类型不兼容
	 */
	@ApiListField("dinner_type")
	@ApiField("string")
	private List<String> dinnerType;

	/**
	 * 是否有设备绑定，false无，true有
	 */
	@ApiField("has_device")
	private Boolean hasDevice;

	/**
	 * 是否有档口，false没有，true有
	 */
	@ApiField("has_stall")
	private Boolean hasStall;

	/**
	 * KDSID
	 */
	@ApiField("kds_id")
	private String kdsId;

	/**
	 * KDS名称
	 */
	@ApiField("kds_name")
	private String kdsName;

	/**
	 * kds屏幕类型：
("COOK", "制作屏"),
("PREPARE", "备餐屏"),
("TAKE", "取餐屏"),
	 */
	@ApiField("kds_type")
	private String kdsType;

	/**
	 * 是否打印，false不打印，true打印
	 */
	@ApiField("print_flag")
	private Boolean printFlag;

	/**
	 * kds绑定的打印机设备ID
print_flag为true时，该字段必填
	 */
	@ApiField("printer_device_id")
	private String printerDeviceId;

	/**
	 * 打印机列表
	 */
	@ApiListField("printer_list")
	@ApiField("kds_printer_model")
	private List<KdsPrinterModel> printerList;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public Boolean getDeleteFlag() {
		return this.deleteFlag;
	}
	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public List<KdsDeviceModel> getDeviceList() {
		return this.deviceList;
	}
	public void setDeviceList(List<KdsDeviceModel> deviceList) {
		this.deviceList = deviceList;
	}

	public List<String> getDinnerType() {
		return this.dinnerType;
	}
	public void setDinnerType(List<String> dinnerType) {
		this.dinnerType = dinnerType;
	}

	public Boolean getHasDevice() {
		return this.hasDevice;
	}
	public void setHasDevice(Boolean hasDevice) {
		this.hasDevice = hasDevice;
	}

	public Boolean getHasStall() {
		return this.hasStall;
	}
	public void setHasStall(Boolean hasStall) {
		this.hasStall = hasStall;
	}

	public String getKdsId() {
		return this.kdsId;
	}
	public void setKdsId(String kdsId) {
		this.kdsId = kdsId;
	}

	public String getKdsName() {
		return this.kdsName;
	}
	public void setKdsName(String kdsName) {
		this.kdsName = kdsName;
	}

	public String getKdsType() {
		return this.kdsType;
	}
	public void setKdsType(String kdsType) {
		this.kdsType = kdsType;
	}

	public Boolean getPrintFlag() {
		return this.printFlag;
	}
	public void setPrintFlag(Boolean printFlag) {
		this.printFlag = printFlag;
	}

	public String getPrinterDeviceId() {
		return this.printerDeviceId;
	}
	public void setPrinterDeviceId(String printerDeviceId) {
		this.printerDeviceId = printerDeviceId;
	}

	public List<KdsPrinterModel> getPrinterList() {
		return this.printerList;
	}
	public void setPrinterList(List<KdsPrinterModel> printerList) {
		this.printerList = printerList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
