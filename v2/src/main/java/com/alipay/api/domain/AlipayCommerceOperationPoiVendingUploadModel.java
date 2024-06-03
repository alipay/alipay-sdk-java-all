package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能售卖点位数据上传
 *
 * @author auto create
 * @since 1.0, 2023-12-05 15:25:17
 */
public class AlipayCommerceOperationPoiVendingUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7349198483952568756L;

	/**
	 * 地址描述
	 */
	@ApiField("address_desc")
	private String addressDesc;

	/**
	 * 营业时间，json格式，days_in_week：一周中的哪几天，范围1~7，hours：一天中的时间，24小时制。
例如：[{"days_in_week":[1,2,3,4,5], "hours":"08:00-20:00"},{"days_in_week":[6,7], "hours":"00:00-24:00"}]，代表周一到周五早8点到晚8点，周六日全天
	 */
	@ApiListField("business_hours_desc")
	@ApiField("business_hours_desc")
	private List<BusinessHoursDesc> businessHoursDesc;

	/**
	 * 点位类型，可取值如下： 
vending(自助售卖机), 
water_dispenser(饮水机), 
washing(洗衣机）,
physical_testing_equipment（体测仪）
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 客服电话
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 点位是否可用，Y：可用，N：不可用，不可用点位不会展示给C端
	 */
	@ApiField("enabled")
	private String enabled;

	/**
	 * 外部实体编号，唯一标识一个实体，如售卖机编号
注1：商户维度下，点位类型（category_code）+ 实体编号（entity_code）唯一，一个商户下相同类型+实体编号多次调用，以最新一次调用数据为准
注2：此编号需要可用于反查商家数据，如调用商家ISP接口获取编号对应设备点位的实时信息
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 点位名称，无需包含品牌信息及设备类型，如：Z空间，XX小区，XX商场1号机。
展示给消费者时，可通过配置选择需要展示的字段，如是否显示品牌及设备类型，或是否不显示点位名称
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 扩展信息字段，具体内容根据商家及设备类型不同另行约定。json格式，请将需要传递的key和value字段放入map中，转成json string传入
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 地址位置纬度，使用国标GCJ-02坐标系，取值范围：纬度-90~90，中国地区经度范围：纬度3.86~53.55
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地址位置经度，使用国标GCJ-02坐标系，取值范围：经度-180~180，中国地区经度范围：73.66~135.05
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 点位上传时间，某一点位信息多次上传，以最新上传时间数据为当前最新快照，格式：yyyy-mm-dd hh:MM:ss
	 */
	@ApiField("upload_time")
	private String uploadTime;

	public String getAddressDesc() {
		return this.addressDesc;
	}
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}

	public List<BusinessHoursDesc> getBusinessHoursDesc() {
		return this.businessHoursDesc;
	}
	public void setBusinessHoursDesc(List<BusinessHoursDesc> businessHoursDesc) {
		this.businessHoursDesc = businessHoursDesc;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEnabled() {
		return this.enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
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

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
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

	public String getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

}
