package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码资金划拨详情查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:05:50
 */
public class AlipayCommerceEducateTuitioncodeFundtransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6643353986429715132L;

	/**
	 * 订单付款人的支付宝用户编号
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 资金划拨操作类型：DISBURSE - 打款；REFUND - 退款
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 外部商户的订单编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 资金划拨的外部请求编号，对应服务商申请打款或申请退款请求的request_id
	 */
	@ApiField("out_req_no")
	private String outReqNo;

	/**
	 * 直付通二级商户的支付宝编号
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 订单付款人的支付宝用户编号
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutReqNo() {
		return this.outReqNo;
	}
	public void setOutReqNo(String outReqNo) {
		this.outReqNo = outReqNo;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
