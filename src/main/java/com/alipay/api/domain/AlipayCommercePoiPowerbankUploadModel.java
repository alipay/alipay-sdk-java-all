package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电宝点位上传
 *
 * @author auto create
 * @since 1.0, 2021-07-16 19:12:40
 */
public class AlipayCommercePoiPowerbankUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4695653419325539824L;

	/**
	 * 地址描述
	 */
	@ApiField("address_desc")
	private String addressDesc;

	/**
	 * 是否可借用，Y:可借，N:不可借。如果不可借用，则不在支付宝首页标准服务推荐以及中心场小程序地图展示
	 */
	@ApiField("can_borrow")
	private String canBorrow;

	/**
	 * 充电宝机柜总共可以借还的充电宝数量（一共能放几个充电宝).如无法统计可以不传
	 */
	@ApiField("can_borrow_cnt")
	private String canBorrowCnt;

	/**
	 * 联系电话，手机11位数字，座机：区号－数字
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 外部实体编号，唯一标识一个实体，如自行车编号，机柜编号 注：商户维度下，类目Code（categoryCode）+实体编号（entity_code）唯一，一个商户下相同类目code+实体编号多次调用
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 点位名称，点位的描述，如XX充电宝
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 扩展信息字段，格式:json。请将需要传递的key和value字段放入map中,然后转成json传入
	 */
	@ApiField("ext_properties")
	private String extProperties;

	/**
	 * 地址位置纬度，取值范围：纬度-90~90，中国地区经度范围：纬度3.86~53.55
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地址位置经度，取值范围：经度-180~180，中国地区经度范围：73.66~135.05
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 营业时间，格式：xx:xx-xx:xx，24小时制，如果是昼夜00:00—24:00
	 */
	@ApiField("office_hours_desc")
	private String officeHoursDesc;

	/**
	 * 实体上传时间，某一借还实体信息多次上传，以最新上传时间数据为当前最新快照，格式：yyyy-mm-dd hh:MM:ss
	 */
	@ApiField("upload_time")
	private String uploadTime;

	public String getAddressDesc() {
		return this.addressDesc;
	}
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}

	public String getCanBorrow() {
		return this.canBorrow;
	}
	public void setCanBorrow(String canBorrow) {
		this.canBorrow = canBorrow;
	}

	public String getCanBorrowCnt() {
		return this.canBorrowCnt;
	}
	public void setCanBorrowCnt(String canBorrowCnt) {
		this.canBorrowCnt = canBorrowCnt;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEntityCode() {
		return this.entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getExtProperties() {
		return this.extProperties;
	}
	public void setExtProperties(String extProperties) {
		this.extProperties = extProperties;
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

	public String getOfficeHoursDesc() {
		return this.officeHoursDesc;
	}
	public void setOfficeHoursDesc(String officeHoursDesc) {
		this.officeHoursDesc = officeHoursDesc;
	}

	public String getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

}
