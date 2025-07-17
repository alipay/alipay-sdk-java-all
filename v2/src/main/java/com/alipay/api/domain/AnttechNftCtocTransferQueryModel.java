package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C藏品流转状态查询
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:35:39
 */
public class AnttechNftCtocTransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6872548283967238327L;

	/**
	 * 业务单号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 鲸探授权用户id(已转加密)
	 */
	@ApiField("from_id_no")
	private String fromIdNo;

	/**
	 * 发起账号类型， 鲸探授权用户id(已转加密):OPEN_UID
	 */
	@ApiField("from_id_type")
	private String fromIdType;

	/**
	 * 鲸探授权用户id(已转加密)
	 */
	@ApiField("to_id_no")
	private String toIdNo;

	/**
	 * 发起账号类型， 鲸探授权用户id(已转加密):OPEN_UID
	 */
	@ApiField("to_id_type")
	private String toIdType;

	/**
	 * 流转类型
	 */
	@ApiField("transfer_type")
	private String transferType;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getFromIdNo() {
		return this.fromIdNo;
	}
	public void setFromIdNo(String fromIdNo) {
		this.fromIdNo = fromIdNo;
	}

	public String getFromIdType() {
		return this.fromIdType;
	}
	public void setFromIdType(String fromIdType) {
		this.fromIdType = fromIdType;
	}

	public String getToIdNo() {
		return this.toIdNo;
	}
	public void setToIdNo(String toIdNo) {
		this.toIdNo = toIdNo;
	}

	public String getToIdType() {
		return this.toIdType;
	}
	public void setToIdType(String toIdType) {
		this.toIdType = toIdType;
	}

	public String getTransferType() {
		return this.transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

}
