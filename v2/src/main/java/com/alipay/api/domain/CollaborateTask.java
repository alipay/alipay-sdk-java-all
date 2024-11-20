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
 * @since 1.0, 2024-10-08 19:38:51
 */
public class CollaborateTask extends AlipayObject {

	private static final long serialVersionUID = 2818591981631581119L;

	/**
	 * 任务拉取时该字段无返回内容，确认领取时会返回该字段。
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
	 * 任务编号
	 */
	@ApiField("task_no")
	private String taskNo;

	/**
	 * 任务拉取时该字段无返回内容，确认领取时会返回该字段。
	 */
	@ApiField("tel")
	private String tel;

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

	public String getTaskNo() {
		return this.taskNo;
	}
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
