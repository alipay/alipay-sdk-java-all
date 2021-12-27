package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还借用实体数据上传接口
 *
 * @author auto create
 * @since 1.0, 2021-07-30 17:23:10
 */
public class ZhimaMerchantBorrowEntityUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1365679237957665977L;

	/**
	 * 地址描述
	 */
	@ApiField("address_desc")
	private String addressDesc;

	/**
	 * 是否可借用，Y:可借，N:不可借。如果不可借用，则不在芝麻借还频道地图展示
	 */
	@ApiField("can_borrow")
	private String canBorrow;

	/**
	 * 可借用数量，如果是借用实物，如自行车，传1即可。如果是借用门店或借还机柜，则传入可借用的物品数量
	 */
	@ApiField("can_borrow_cnt")
	private String canBorrowCnt;

	/**
	 * 类目Code，传入芝麻借还规定的类目Code，其他值会认为非法参数，枚举如下：
*雨伞：umbrella
*充电宝：power_bank
注意：联调测试情况下，类目Code必须传如 test。
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 是否收租金，Y:收租金，N:不收租金
	 */
	@ApiField("collect_rent")
	private String collectRent;

	/**
	 * 联系电话，手机11位数字，座机：区号－数字
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 外部实体编号，唯一标识一个实体，如自行车编号，机柜编号
注：商户维度下，类目Code（categoryCode）+实体编号（entity_code）唯一，一个商户下相同类目code+实体编号多次调用，将按照上传时间（upload_time）更新，更新规则取最新的upload_time快照数据
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 实体名称，借用实体的描述，如XX雨伞，XX充电宝，XX自行车
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
	 * 信用借还的签约产品码，固定为：w1010100000000002858。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 租金描述，该借还点的租金描述，例如：5元/小时，5-10元／小时
	 */
	@ApiField("rent_desc")
	private String rentDesc;

	/**
	 * 借用总数，如果是借用实物，如自行车，传1即可。如果是借用门店或借还机柜，则传入提供借还物品的总量
	 */
	@ApiField("total_borrow_cnt")
	private String totalBorrowCnt;

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

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCollectRent() {
		return this.collectRent;
	}
	public void setCollectRent(String collectRent) {
		this.collectRent = collectRent;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRentDesc() {
		return this.rentDesc;
	}
	public void setRentDesc(String rentDesc) {
		this.rentDesc = rentDesc;
	}

	public String getTotalBorrowCnt() {
		return this.totalBorrowCnt;
	}
	public void setTotalBorrowCnt(String totalBorrowCnt) {
		this.totalBorrowCnt = totalBorrowCnt;
	}

	public String getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

}
