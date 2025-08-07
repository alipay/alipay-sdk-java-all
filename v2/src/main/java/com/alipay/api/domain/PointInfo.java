package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 点位信息
 *
 * @author auto create
 * @since 1.0, 2023-11-16 11:00:20
 */
public class PointInfo extends AlipayObject {

	private static final long serialVersionUID = 7564877293282261354L;

	/**
	 * 经营地址
	 */
	@ApiField("address")
	private PointAddressInfo address;

	/**
	 * 经营时间
	 */
	@ApiListField("business_time")
	@ApiField("point_business_time")
	private List<PointBusinessTime> businessTime;

	/**
	 * 联系手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系固定电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 外部点位编号
	 */
	@ApiField("out_device_point_id")
	private String outDevicePointId;

	/**
	 * 新版门店类目标准二级类目code。类目标准及与原类目映射关系参见 <a href="https://gw.alipayobjects.com/os/bmw-prod/4b3f82df-e53e-4b84-bc41-fe025101e726.xlsx">支付宝门店类目-最新</a> 表格。
	 */
	@ApiField("point_category_code")
	private String pointCategoryCode;

	/**
	 * 点位分组
	 */
	@ApiField("point_group")
	private String pointGroup;

	/**
	 * 点位名称
	 */
	@ApiField("point_name")
	private String pointName;

	public PointAddressInfo getAddress() {
		return this.address;
	}
	public void setAddress(PointAddressInfo address) {
		this.address = address;
	}

	public List<PointBusinessTime> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<PointBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getOutDevicePointId() {
		return this.outDevicePointId;
	}
	public void setOutDevicePointId(String outDevicePointId) {
		this.outDevicePointId = outDevicePointId;
	}

	public String getPointCategoryCode() {
		return this.pointCategoryCode;
	}
	public void setPointCategoryCode(String pointCategoryCode) {
		this.pointCategoryCode = pointCategoryCode;
	}

	public String getPointGroup() {
		return this.pointGroup;
	}
	public void setPointGroup(String pointGroup) {
		this.pointGroup = pointGroup;
	}

	public String getPointName() {
		return this.pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

}
