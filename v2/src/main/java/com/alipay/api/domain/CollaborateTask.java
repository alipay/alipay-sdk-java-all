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
 * @since 1.0, 2026-02-12 16:23:04
 */
public class CollaborateTask extends AlipayObject {

	private static final long serialVersionUID = 6335325257411927418L;

	/**
	 * 活动描述，用户参与活动时返回。
	 */
	@ApiField("activity_desc")
	private String activityDesc;

	/**
	 * 活动id，用户参与活动时返回，不为空一定是强leads
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
	 * 餐饮:CATERING
生鲜:FRESH
五金家装:HARDWARE_HOME
超市便利:SUPERMARKET
服装饰品箱包:CLOTHING_ACCESSORIES
美容美发美甲:BEAUTY_SERVICE
数码电器:ELECTRONICS
文体娱乐:ENTERTAINMENT
教育:EDUCATION
彩妆护肤:COSMETICS
生活服务:LIFE_SERVICE
出租车:TAXI
其他:OTHER
	 */
	@ApiField("biz_industry")
	private String bizIndustry;

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
	 * 线上强leads签约了必有，对接了强弱融合模式的服务商，需要通过接口alipay.offline.provider.nsales.activity.effect 来激活任务
	 */
	@ApiField("sales_order_id")
	private String salesOrderId;

	/**
	 * 任务拉取时该字段无返回内容，确认领取时会返回该字段。
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 任务拉取时该字段无返回内容，确认领取且当前商户是你方存量商户时返回该字段，通过此字段判断是否是你方的存量商户，为空则是非存量leads，非存量leads判断下联系方式是否已下发，未下发的需要走外呼获取
	 */
	@ApiListField("smid_list")
	@ApiField("string")
	private List<String> smidList;

	/**
	 * 商户在线上有签约意愿时必有，结合task_tag字段判断是否签约，未签约或者当前字段为空或者activity_id字段为空则是弱leads
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 任务编号
	 */
	@ApiField("task_no")
	private String taskNo;

	/**
	 * 任务标签，解释说明:
WILLNGNESS -强意愿用户（多次提报）
NOT_SIGNING -线上未签约，如果solutionId不为空则说明有签约意愿但是并没有实际签约动作，作业时可以做商户行为参考
HAS_SIGNED-线上已签约，作业时如果需要切换任务，需要先退出卖进方案
STOCK-线下存量摸排出的，有明确安装意愿的商户
ELEME-饿了么的商户
GD_EVALUATION-高德评价通的商户
GD_ONLINE-高德线上投放的商户
ELEME_RETAIL-饿了么零售的商户
ELEME_BRAND-饿了么品牌的商户
	 */
	@ApiListField("task_tags")
	@ApiField("string")
	private List<String> taskTags;

	/**
	 * 任务拉取时无该内容返回，确认领取时返回脱敏内容，如131****2222，确认商户有意图或呼叫商户N次未接通的情况会返回该字段未脱敏数据，N以实际业务沟通为准
	 */
	@ApiField("tel")
	private String tel;

	/**
	 * 在用经营工具，如：收银系统，点单产品
	 */
	@ApiListField("using_biz_tools")
	@ApiField("string")
	private List<String> usingBizTools;

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

	public String getBizIndustry() {
		return this.bizIndustry;
	}
	public void setBizIndustry(String bizIndustry) {
		this.bizIndustry = bizIndustry;
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

	public List<String> getUsingBizTools() {
		return this.usingBizTools;
	}
	public void setUsingBizTools(List<String> usingBizTools) {
		this.usingBizTools = usingBizTools;
	}

}
