package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外跳服务商接口埋点通知
 *
 * @author auto create
 * @since 1.0, 2025-10-16 16:42:43
 */
public class AlipayCommerceMedicalRegisterBurrypointNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2484911351767779684L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 埋点下单失败消息
	 */
	@ApiField("burry_point_error_msg")
	private String burryPointErrorMsg;

	/**
	 * 埋点动作
	 */
	@ApiField("burry_point_type")
	private String burryPointType;

	/**
	 * 埋点属性
	 */
	@ApiField("burrypoint_prop")
	private String burrypointProp;

	/**
	 * 来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 服务商医生姓名
	 */
	@ApiField("isv_doc_name")
	private String isvDocName;

	/**
	 * 服务商医生编码
	 */
	@ApiField("isv_doc_no")
	private String isvDocNo;

	/**
	 * 服务商科室名称
	 */
	@ApiField("isv_hos_dept_name")
	private String isvHosDeptName;

	/**
	 * 服务商科室ID
	 */
	@ApiField("isv_hos_dept_no")
	private String isvHosDeptNo;

	/**
	 * 医院名称
	 */
	@ApiField("isv_hos_name")
	private String isvHosName;

	/**
	 * 医院唯一编码
	 */
	@ApiField("isv_hos_no")
	private String isvHosNo;

	/**
	 * 号源ID
	 */
	@ApiField("number_id")
	private String numberId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 挂号订单属性
	 */
	@ApiField("order_prop")
	private String orderProp;

	/**
	 * 平台编码，由支付宝统一提供
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 号源排班日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 排班id
	 */
	@ApiField("register_id")
	private String registerId;

	/**
	 * 支付宝url跳转三方请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 子场景编码
	 */
	@ApiField("sub_scene_code")
	private String subSceneCode;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBurryPointErrorMsg() {
		return this.burryPointErrorMsg;
	}
	public void setBurryPointErrorMsg(String burryPointErrorMsg) {
		this.burryPointErrorMsg = burryPointErrorMsg;
	}

	public String getBurryPointType() {
		return this.burryPointType;
	}
	public void setBurryPointType(String burryPointType) {
		this.burryPointType = burryPointType;
	}

	public String getBurrypointProp() {
		return this.burrypointProp;
	}
	public void setBurrypointProp(String burrypointProp) {
		this.burrypointProp = burrypointProp;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getIsvDocName() {
		return this.isvDocName;
	}
	public void setIsvDocName(String isvDocName) {
		this.isvDocName = isvDocName;
	}

	public String getIsvDocNo() {
		return this.isvDocNo;
	}
	public void setIsvDocNo(String isvDocNo) {
		this.isvDocNo = isvDocNo;
	}

	public String getIsvHosDeptName() {
		return this.isvHosDeptName;
	}
	public void setIsvHosDeptName(String isvHosDeptName) {
		this.isvHosDeptName = isvHosDeptName;
	}

	public String getIsvHosDeptNo() {
		return this.isvHosDeptNo;
	}
	public void setIsvHosDeptNo(String isvHosDeptNo) {
		this.isvHosDeptNo = isvHosDeptNo;
	}

	public String getIsvHosName() {
		return this.isvHosName;
	}
	public void setIsvHosName(String isvHosName) {
		this.isvHosName = isvHosName;
	}

	public String getIsvHosNo() {
		return this.isvHosNo;
	}
	public void setIsvHosNo(String isvHosNo) {
		this.isvHosNo = isvHosNo;
	}

	public String getNumberId() {
		return this.numberId;
	}
	public void setNumberId(String numberId) {
		this.numberId = numberId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderProp() {
		return this.orderProp;
	}
	public void setOrderProp(String orderProp) {
		this.orderProp = orderProp;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSubSceneCode() {
		return this.subSceneCode;
	}
	public void setSubSceneCode(String subSceneCode) {
		this.subSceneCode = subSceneCode;
	}

}
