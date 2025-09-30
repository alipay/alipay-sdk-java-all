package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户消费（领取、核销）特权数据同步
 *
 * @author auto create
 * @since 1.0, 2025-06-30 10:29:17
 */
public class AlipayUserPartnerPrivilegeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6886449581791817938L;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 是否使用悦管家服务。值可以为Y或N，只有当status=FINISHED时，此属性才需要必填，如果为空则默认按“未使用”处理。高铁接站场景属性
	 */
	@ApiField("butler_use_flag")
	private String butlerUseFlag;

	/**
	 * 是否使用礼宾车服务。值可以为Y或N，只有当status=FINISHED时，此属性才需要必填，如果为空则默认按“未使用”处理。高铁接站场景属性
	 */
	@ApiField("car_use_flag")
	private String carUseFlag;

	/**
	 * 所属城市，高铁接站场景需要填写
	 */
	@ApiField("city")
	private String city;

	/**
	 * 车厢号，高铁接站场景需要填写
	 */
	@ApiField("compartment_number")
	private String compartmentNumber;

	/**
	 * 当前用户在特权周期内已经享有次数
	 */
	@ApiField("current_count")
	private Long currentCount;

	/**
	 * 当前用户在商家侧的等级英文编码（如 golden 可表示黄金会员），如果商家没有等级体系，则使用默认等级码：member
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 当前等级的过期时间
	 */
	@ApiField("grade_expired_time")
	private Date gradeExpiredTime;

	/**
	 * 当前用户在特权记账周期内最大享有次数。例如，5元话费充值现金券，用户每月可领取并使用一次，那么，在记账周期（月）内用户最大享有次数为 1 次。
	 */
	@ApiField("max_count")
	private Long maxCount;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部商家侧的机构ID，非必填，当pid无法区分商家时，合作商家需要传递此字段
	 */
	@ApiField("out_partner_id")
	private String outPartnerId;

	/**
	 * 用户手机号码，高铁接站场景需要填写
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 商家特权的ID，可唯一定位一个特权。可以是特权配置ID或数据库ID
	 */
	@ApiField("privilege_id")
	private String privilegeId;

	/**
	 * 注册渠道
	 */
	@ApiField("register_channel")
	private String registerChannel;

	/**
	 * 由支付宝分配，具体值由支付宝定义。 D2D:高铁接站场景；INTERFLOW_PARTNER_MEMBER:互通联名会员场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 服务电话，高铁接站场景需要填写
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 站点信息，高铁接站场景需要填写
	 */
	@ApiField("station")
	private String station;

	/**
	 * 当前用户消费商家特权的状态：1.INIT（领取）；2.USED（已使用）；3.EXPIRED（已过期）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商家特权标题或名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 车次，高铁接站场景需要填写
	 */
	@ApiField("train_number")
	private String trainNumber;

	/**
	 * 特权记账周期：1.LIFE（终身）；2.YEAR（年）；3.SEASON（季度）；4.MONTH（月）；5.WEEK（周）；6.DAY（日）
	 */
	@ApiField("trans_quantum")
	private String transQuantum;

	/**
	 * 出行时间。格式：
yyyy-MM-dd HH:mm:ss，高铁接站场景需要填写
	 */
	@ApiField("travel_time")
	private Date travelTime;

	/**
	 * 用户姓名，高铁接站场景需要填写
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户支付金额。单位：元，只支持两位小数点的正数，如：88.88。如果用户无需额外支付金额，可不用传值。高铁接站场景属性
	 */
	@ApiField("user_pay_amount")
	private String userPayAmount;

	/**
	 * 供应商编码，非必填，当pid无法区分商家时，合作商家需要传递此字段
	 */
	@ApiField("vendor")
	private String vendor;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getButlerUseFlag() {
		return this.butlerUseFlag;
	}
	public void setButlerUseFlag(String butlerUseFlag) {
		this.butlerUseFlag = butlerUseFlag;
	}

	public String getCarUseFlag() {
		return this.carUseFlag;
	}
	public void setCarUseFlag(String carUseFlag) {
		this.carUseFlag = carUseFlag;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCompartmentNumber() {
		return this.compartmentNumber;
	}
	public void setCompartmentNumber(String compartmentNumber) {
		this.compartmentNumber = compartmentNumber;
	}

	public Long getCurrentCount() {
		return this.currentCount;
	}
	public void setCurrentCount(Long currentCount) {
		this.currentCount = currentCount;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getGradeExpiredTime() {
		return this.gradeExpiredTime;
	}
	public void setGradeExpiredTime(Date gradeExpiredTime) {
		this.gradeExpiredTime = gradeExpiredTime;
	}

	public Long getMaxCount() {
		return this.maxCount;
	}
	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutPartnerId() {
		return this.outPartnerId;
	}
	public void setOutPartnerId(String outPartnerId) {
		this.outPartnerId = outPartnerId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPrivilegeId() {
		return this.privilegeId;
	}
	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}

	public String getRegisterChannel() {
		return this.registerChannel;
	}
	public void setRegisterChannel(String registerChannel) {
		this.registerChannel = registerChannel;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getStation() {
		return this.station;
	}
	public void setStation(String station) {
		this.station = station;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrainNumber() {
		return this.trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTransQuantum() {
		return this.transQuantum;
	}
	public void setTransQuantum(String transQuantum) {
		this.transQuantum = transQuantum;
	}

	public Date getTravelTime() {
		return this.travelTime;
	}
	public void setTravelTime(Date travelTime) {
		this.travelTime = travelTime;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPayAmount() {
		return this.userPayAmount;
	}
	public void setUserPayAmount(String userPayAmount) {
		this.userPayAmount = userPayAmount;
	}

	public String getVendor() {
		return this.vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
