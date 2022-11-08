package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝虎年福气商店订单状态更新接口
 *
 * @author auto create
 * @since 1.0, 2021-12-10 15:55:43
 */
public class AlipayUserWufufukaAliyunFinishModel extends AlipayObject {

	private static final long serialVersionUID = 5144438612475568842L;

	/**
	 * 支付宝订单id，url传递获取，支付宝根据该id查询对应订单
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 阿里云订单id，支付宝落库，用于订单详情页url拼接及问题排查
	 */
	@ApiField("aliyun_order_id")
	private String aliyunOrderId;

	/**
	 * 扩展信息，扩展性预留，用于传递其他信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 请求id，单笔唯一，阿里云生成，支付宝根据id跟库中数据比较保证唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 请求时间，支付宝落库
	 */
	@ApiField("request_time")
	private Date requestTime;

	/**
	 * 更新目标状态，支付宝只感知SUCCESS状态，其他会认为参数异常
	 */
	@ApiField("target_status")
	private String targetStatus;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getAliyunOrderId() {
		return this.aliyunOrderId;
	}
	public void setAliyunOrderId(String aliyunOrderId) {
		this.aliyunOrderId = aliyunOrderId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public String getTargetStatus() {
		return this.targetStatus;
	}
	public void setTargetStatus(String targetStatus) {
		this.targetStatus = targetStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
