package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-04 11:02:35
 */
public class TourOrderSyncResponse extends AlipayObject {

	private static final long serialVersionUID = 6159544654524459259L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识。一码通场景必须保存
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 凭证号
	 */
	@ApiField("out_voucher_id")
	private String outVoucherId;

	/**
	 * 支付宝用户的userId。
一码通场景必须保存
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 入库业务号。碰一下场景必须保存
	 */
	@ApiField("vid")
	private String vid;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutVoucherId() {
		return this.outVoucherId;
	}
	public void setOutVoucherId(String outVoucherId) {
		this.outVoucherId = outVoucherId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
