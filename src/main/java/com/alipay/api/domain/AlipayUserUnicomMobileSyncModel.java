package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联通老用户转宝卡套餐后，使用该接口将转宝卡手机号同步支付宝
 *
 * @author auto create
 * @since 1.0, 2017-11-29 23:15:10
 */
public class AlipayUserUnicomMobileSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7412499819231476237L;

	/**
	 * 业务状态发生变更的时间戳，精确到毫秒
	 */
	@ApiField("gmt_status_change")
	private Long gmtStatusChange;

	/**
	 * 联通老用户转宝卡套餐手机号，必须是联通手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 对手机号操作类型。CARD_ACTIVE:联通老用户转入宝卡套餐；CARD_CLOSE:宝卡用户转出宝卡套餐
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 联通资费产品名称
	 */
	@ApiField("product_name")
	private String productName;

	public Long getGmtStatusChange() {
		return this.gmtStatusChange;
	}
	public void setGmtStatusChange(Long gmtStatusChange) {
		this.gmtStatusChange = gmtStatusChange;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
