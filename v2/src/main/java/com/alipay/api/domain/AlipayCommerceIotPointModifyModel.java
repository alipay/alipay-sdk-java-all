package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改点位信息
 *
 * @author auto create
 * @since 1.0, 2023-11-17 16:11:16
 */
public class AlipayCommerceIotPointModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5279772643336363389L;

	/**
	 * 经营地址
	 */
	@ApiField("address")
	private PointAddressInfo address;

	/**
	 * 点位经营时间
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
	 * 固定联系电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 外部点位ID
	 */
	@ApiField("out_device_point_id")
	private String outDevicePointId;

	/**
	 * 经营类目
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
