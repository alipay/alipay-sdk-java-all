package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 协同任务信息
 *
 * @author auto create
 * @since 1.0, 2025-04-29 16:26:56
 */
public class CollaborateTask extends AlipayObject {

	private static final long serialVersionUID = 7899715688426727874L;

	/**
	 * 活动描述，用户参与活动时返回。
	 */
	@ApiField("activity_desc")
	private String activityDesc;

	/**
	 * 活动id，用户参与活动时返回。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动类型，用户参与活动时返回。
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 任务拉取时该字段无返回内容，确认商户有安装意图时返回该字段
	 */
	@ApiField("address")
	private String address;

	/**
	 * 市级编码，入：330100 表示杭州市。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * pull接口返回脱敏后的联系人姓名，如刘*,confirm接口确认商家有意愿安装，则返回完整的联系人姓名。
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 如果为空默认是N7，商户需要铺设设备的类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 任务分配的时间。
	 */
	@ApiField("dispatched_time")
	private Date dispatchedTime;

	/**
	 * 区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区名称。
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 外部展业人员编号
	 */
	@ApiField("installer_no")
	private String installerNo;

	/**
	 * 服务商可以基于此id判断拉取到的任务需要协同什么样的产品，如： N7 设备。
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 协同产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 协同产品标签，如：0元先享等。
	 */
	@ApiListField("product_tags")
	@ApiField("string")
	private List<String> productTags;

	/**
	 * 省级地址编码，如：330000 表示浙江。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称。
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 线上强leads签约了必有
	 */
	@ApiField("sales_order_id")
	private String salesOrderId;

	/**
	 * 任务拉取时该字段无返回内容，确认领取时会返回该字段。
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 任务拉取时该字段无返回内容，确认领取且当前商户是你方商户时返回该字段。
	 */
	@ApiListField("smid_list")
	@ApiField("string")
	private List<String> smidList;

	/**
	 * 线上有参与活动的必有
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 任务编号
	 */
	@ApiField("task_no")
	private String taskNo;

	/**
	 * WILLNGNESS-强意愿用户（多次提报）
NOT_SIGNING-未签约
HAS_SIGNED-已签约
STOCK-存量摸排
	 */
	@ApiListField("task_tags")
	@ApiField("string")
	private List<String> taskTags;

	/**
	 * 任务拉取时无该内容返回，确认领取时返回脱敏内容，如131****2222，确认商户有意图或呼叫商户N次未接通的情况会返回该字段未脱敏数据，N以实际业务沟通为准
	 */
	@ApiField("tel")
	private String tel;

	public String getActivityDesc() {
		return this.activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public Date getDispatchedTime() {
		return this.dispatchedTime;
	}
	public void setDispatchedTime(Date dispatchedTime) {
		this.dispatchedTime = dispatchedTime;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getInstallerNo() {
		return this.installerNo;
	}
	public void setInstallerNo(String installerNo) {
		this.installerNo = installerNo;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<String> getProductTags() {
		return this.productTags;
	}
	public void setProductTags(List<String> productTags) {
		this.productTags = productTags;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getSalesOrderId() {
		return this.salesOrderId;
	}
	public void setSalesOrderId(String salesOrderId) {
		this.salesOrderId = salesOrderId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<String> getSmidList() {
		return this.smidList;
	}
	public void setSmidList(List<String> smidList) {
		this.smidList = smidList;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getTaskNo() {
		return this.taskNo;
	}
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

	public List<String> getTaskTags() {
		return this.taskTags;
	}
	public void setTaskTags(List<String> taskTags) {
		this.taskTags = taskTags;
	}

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
