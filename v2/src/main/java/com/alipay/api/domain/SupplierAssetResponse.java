package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商设备信息
 *
 * @author auto create
 * @since 1.0, 2019-04-10 16:54:35
 */
public class SupplierAssetResponse extends AlipayObject {

	private static final long serialVersionUID = 7698226967885544332L;

	/**
	 * 审核备注
	 */
	@ApiField("approval_remark")
	private String approvalRemark;

	/**
	 * 审核状态
	 */
	@ApiField("approval_status")
	private String approvalStatus;

	/**
	 * 审核状态文案
	 */
	@ApiField("approval_status_text")
	private String approvalStatusText;

	/**
	 * 是否支持蓝牙
	 */
	@ApiField("bluetooth_mode")
	private String bluetoothMode;

	/**
	 * bluetooth mode文案
	 */
	@ApiField("bluetooth_mode_text")
	private String bluetoothModeText;

	/**
	 * 联系地址
	 */
	@ApiField("contact_address")
	private String contactAddress;

	/**
	 * 联系电话
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 设备CPU
	 */
	@ApiField("cpu")
	private String cpu;

	/**
	 * 产品设计图片
	 */
	@ApiField("device_design_img")
	private String deviceDesignImg;

	/**
	 * 产品设计图id
	 */
	@ApiField("device_design_img_id")
	private String deviceDesignImgId;

	/**
	 * 产品图片
	 */
	@ApiField("device_img")
	private String deviceImg;

	/**
	 * 产品图片id
	 */
	@ApiField("device_img_id")
	private String deviceImgId;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 设备其他说明
	 */
	@ApiField("device_other_desc")
	private String deviceOtherDesc;

	/**
	 * 人脸摄像头
	 */
	@ApiField("face_camera")
	private String faceCamera;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 最后修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 记录主键id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 物料id（蚂蚁设备id）
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 是否支持有线网络
	 */
	@ApiField("line_network_mode")
	private String lineNetworkMode;

	/**
	 * line network mode文案
	 */
	@ApiField("line_network_mode_text")
	private String lineNetworkModeText;

	/**
	 * 设备内存
	 */
	@ApiField("memory")
	private String memory;

	/**
	 * 最低系统版本
	 */
	@ApiField("min_os_version")
	private String minOsVersion;

	/**
	 * 设备型号
	 */
	@ApiField("model_number")
	private String modelNumber;

	/**
	 * 是否支持移动网络
	 */
	@ApiField("network_mode")
	private String networkMode;

	/**
	 * network mode文案
	 */
	@ApiField("network_mode_text")
	private String networkModeText;

	/**
	 * 操作系统
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * 是否支持打印机
	 */
	@ApiField("printer")
	private String printer;

	/**
	 * ram大小
	 */
	@ApiField("ram")
	private Long ram;

	/**
	 * rom大小
	 */
	@ApiField("rom")
	private Long rom;

	/**
	 * 扫码方式
	 */
	@ApiField("scan_code_mode")
	private String scanCodeMode;

	/**
	 * 扫码距离
	 */
	@ApiField("scan_code_read_dista")
	private String scanCodeReadDista;

	/**
	 * 显示屏分辨率
	 */
	@ApiField("screen_dpi")
	private String screenDpi;

	/**
	 * 屏幕尺寸
	 */
	@ApiField("screen_size")
	private String screenSize;

	/**
	 * sdk自动打包文件下载地址
	 */
	@ApiField("sdk_auto_file")
	private String sdkAutoFile;

	/**
	 * sdk文件id
	 */
	@ApiField("sdk_auto_file_id")
	private String sdkAutoFileId;

	/**
	 * sdk名称
	 */
	@ApiField("sdk_name")
	private String sdkName;

	/**
	 * sdk版本号
	 */
	@ApiField("sdk_version")
	private String sdkVersion;

	/**
	 * 设备存储
	 */
	@ApiField("storage")
	private String storage;

	/**
	 * 供应商名称
	 */
	@ApiField("supplier_name")
	private String supplierName;

	/**
	 * 供应商pid
	 */
	@ApiField("supplier_pid")
	private String supplierPid;

	/**
	 * 供应商sn
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	/**
	 * 设备交易模式，ONE/ZERO
	 */
	@ApiField("tranaction_model")
	private String tranactionModel;

	/**
	 * tranaction model文案
	 */
	@ApiField("tranaction_model_text")
	private String tranactionModelText;

	/**
	 * 是否支持wifi
	 */
	@ApiField("wifi_mode")
	private String wifiMode;

	/**
	 * wifi mode文案
	 */
	@ApiField("wifi_mode_text")
	private String wifiModeText;

	public String getApprovalRemark() {
		return this.approvalRemark;
	}
	public void setApprovalRemark(String approvalRemark) {
		this.approvalRemark = approvalRemark;
	}

	public String getApprovalStatus() {
		return this.approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getApprovalStatusText() {
		return this.approvalStatusText;
	}
	public void setApprovalStatusText(String approvalStatusText) {
		this.approvalStatusText = approvalStatusText;
	}

	public String getBluetoothMode() {
		return this.bluetoothMode;
	}
	public void setBluetoothMode(String bluetoothMode) {
		this.bluetoothMode = bluetoothMode;
	}

	public String getBluetoothModeText() {
		return this.bluetoothModeText;
	}
	public void setBluetoothModeText(String bluetoothModeText) {
		this.bluetoothModeText = bluetoothModeText;
	}

	public String getContactAddress() {
		return this.contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCpu() {
		return this.cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDeviceDesignImg() {
		return this.deviceDesignImg;
	}
	public void setDeviceDesignImg(String deviceDesignImg) {
		this.deviceDesignImg = deviceDesignImg;
	}

	public String getDeviceDesignImgId() {
		return this.deviceDesignImgId;
	}
	public void setDeviceDesignImgId(String deviceDesignImgId) {
		this.deviceDesignImgId = deviceDesignImgId;
	}

	public String getDeviceImg() {
		return this.deviceImg;
	}
	public void setDeviceImg(String deviceImg) {
		this.deviceImg = deviceImg;
	}

	public String getDeviceImgId() {
		return this.deviceImgId;
	}
	public void setDeviceImgId(String deviceImgId) {
		this.deviceImgId = deviceImgId;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceOtherDesc() {
		return this.deviceOtherDesc;
	}
	public void setDeviceOtherDesc(String deviceOtherDesc) {
		this.deviceOtherDesc = deviceOtherDesc;
	}

	public String getFaceCamera() {
		return this.faceCamera;
	}
	public void setFaceCamera(String faceCamera) {
		this.faceCamera = faceCamera;
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

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLineNetworkMode() {
		return this.lineNetworkMode;
	}
	public void setLineNetworkMode(String lineNetworkMode) {
		this.lineNetworkMode = lineNetworkMode;
	}

	public String getLineNetworkModeText() {
		return this.lineNetworkModeText;
	}
	public void setLineNetworkModeText(String lineNetworkModeText) {
		this.lineNetworkModeText = lineNetworkModeText;
	}

	public String getMemory() {
		return this.memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getMinOsVersion() {
		return this.minOsVersion;
	}
	public void setMinOsVersion(String minOsVersion) {
		this.minOsVersion = minOsVersion;
	}

	public String getModelNumber() {
		return this.modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getNetworkMode() {
		return this.networkMode;
	}
	public void setNetworkMode(String networkMode) {
		this.networkMode = networkMode;
	}

	public String getNetworkModeText() {
		return this.networkModeText;
	}
	public void setNetworkModeText(String networkModeText) {
		this.networkModeText = networkModeText;
	}

	public String getOsType() {
		return this.osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getPrinter() {
		return this.printer;
	}
	public void setPrinter(String printer) {
		this.printer = printer;
	}

	public Long getRam() {
		return this.ram;
	}
	public void setRam(Long ram) {
		this.ram = ram;
	}

	public Long getRom() {
		return this.rom;
	}
	public void setRom(Long rom) {
		this.rom = rom;
	}

	public String getScanCodeMode() {
		return this.scanCodeMode;
	}
	public void setScanCodeMode(String scanCodeMode) {
		this.scanCodeMode = scanCodeMode;
	}

	public String getScanCodeReadDista() {
		return this.scanCodeReadDista;
	}
	public void setScanCodeReadDista(String scanCodeReadDista) {
		this.scanCodeReadDista = scanCodeReadDista;
	}

	public String getScreenDpi() {
		return this.screenDpi;
	}
	public void setScreenDpi(String screenDpi) {
		this.screenDpi = screenDpi;
	}

	public String getScreenSize() {
		return this.screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getSdkAutoFile() {
		return this.sdkAutoFile;
	}
	public void setSdkAutoFile(String sdkAutoFile) {
		this.sdkAutoFile = sdkAutoFile;
	}

	public String getSdkAutoFileId() {
		return this.sdkAutoFileId;
	}
	public void setSdkAutoFileId(String sdkAutoFileId) {
		this.sdkAutoFileId = sdkAutoFileId;
	}

	public String getSdkName() {
		return this.sdkName;
	}
	public void setSdkName(String sdkName) {
		this.sdkName = sdkName;
	}

	public String getSdkVersion() {
		return this.sdkVersion;
	}
	public void setSdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	public String getStorage() {
		return this.storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierPid() {
		return this.supplierPid;
	}
	public void setSupplierPid(String supplierPid) {
		this.supplierPid = supplierPid;
	}

	public String getSupplierSn() {
		return this.supplierSn;
	}
	public void setSupplierSn(String supplierSn) {
		this.supplierSn = supplierSn;
	}

	public String getTranactionModel() {
		return this.tranactionModel;
	}
	public void setTranactionModel(String tranactionModel) {
		this.tranactionModel = tranactionModel;
	}

	public String getTranactionModelText() {
		return this.tranactionModelText;
	}
	public void setTranactionModelText(String tranactionModelText) {
		this.tranactionModelText = tranactionModelText;
	}

	public String getWifiMode() {
		return this.wifiMode;
	}
	public void setWifiMode(String wifiMode) {
		this.wifiMode = wifiMode;
	}

	public String getWifiModeText() {
		return this.wifiModeText;
	}
	public void setWifiModeText(String wifiModeText) {
		this.wifiModeText = wifiModeText;
	}

}
