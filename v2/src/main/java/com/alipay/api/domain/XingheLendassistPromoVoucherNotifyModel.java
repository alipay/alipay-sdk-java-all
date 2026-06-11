package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发券通知来报
 *
 * @author auto create
 * @since 1.0, 2026-06-03 11:37:55
 */
public class XingheLendassistPromoVoucherNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6326723582675373561L;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 用户姓名
	 */
	@ApiField("cust_name")
	private String custName;

	/**
	 * 用户身份证号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 机构代码（开放平台appId）
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 机构券信息
JSON 格式字符串
	 */
	@ApiField("inst_voucher_info")
	private String instVoucherInfo;

	/**
	 * 通知类型，券领取通知（固定）：INST_VOUCHER_RECEIVE
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 请求流水号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getCustName() {
		return this.custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getInstVoucherInfo() {
		return this.instVoucherInfo;
	}
	public void setInstVoucherInfo(String instVoucherInfo) {
		this.instVoucherInfo = instVoucherInfo;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
