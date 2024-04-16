package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻快招商户侧简历投递同步
 *
 * @author auto create
 * @since 1.0, 2022-12-07 15:38:08
 */
public class ZhimaCustomerJobworthQuickhireSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6396452373694592688L;

	/**
	 * 投递者年龄
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 求职者手机号，工作证投递链路非必填，非工作证投递链路必填
	 */
	@ApiField("contact_no")
	private String contactNo;

	/**
	 * 商户侧投递唯一ID，后续芝麻快招同步给商户侧联系情况或者其他信息时候商户侧用此ID进行关联
	 */
	@ApiField("deliver_id")
	private String deliverId;

	/**
	 * 标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("deliver_time")
	private Date deliverTime;

	/**
	 * 0 = 非工作证投递，1 = 工作证投递
	 */
	@ApiField("deliver_type")
	private Long deliverType;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 选填
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 蚂蚁开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 岗位唯一标识
	 */
	@ApiField("recruit_code_id")
	private String recruitCodeId;

	/**
	 * 信用服务id,由芝麻信用运营分配，联系业务对接人获得，写死即可
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getContactNo() {
		return this.contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDeliverId() {
		return this.deliverId;
	}
	public void setDeliverId(String deliverId) {
		this.deliverId = deliverId;
	}

	public Date getDeliverTime() {
		return this.deliverTime;
	}
	public void setDeliverTime(Date deliverTime) {
		this.deliverTime = deliverTime;
	}

	public Long getDeliverType() {
		return this.deliverType;
	}
	public void setDeliverType(Long deliverType) {
		this.deliverType = deliverType;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRecruitCodeId() {
		return this.recruitCodeId;
	}
	public void setRecruitCodeId(String recruitCodeId) {
		this.recruitCodeId = recruitCodeId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
