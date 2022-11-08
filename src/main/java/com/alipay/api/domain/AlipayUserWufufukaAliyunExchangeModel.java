package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝虎年福卡扣减接口
 *
 * @author auto create
 * @since 1.0, 2022-01-16 22:01:34
 */
public class AlipayUserWufufukaAliyunExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 7375683541163375141L;

	/**
	 * 支付宝订单id+支付宝获取订单+无+url传递
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 阿里云商品id，支付宝用于校验订单-商品关系，url传递后阿里云获取
	 */
	@ApiField("aliyun_item_id")
	private Long aliyunItemId;

	/**
	 * 扩展信息+否+扩展+无+接入方传递
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 请求id+唯一+支付宝更新状态持久化+无+业务方生成
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 扣减时间 + 无 + 支付宝记录 + 无+阿里云系统调用时间+无
	 */
	@ApiField("request_time")
	private Date requestTime;

	/**
	 * 支付宝用户id+否+业务方理解+无+支付宝传递
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public Long getAliyunItemId() {
		return this.aliyunItemId;
	}
	public void setAliyunItemId(Long aliyunItemId) {
		this.aliyunItemId = aliyunItemId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
