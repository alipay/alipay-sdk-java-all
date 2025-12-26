package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-26 14:42:42
 */
public class TourOrderSyncResponse extends AlipayObject {

	private static final long serialVersionUID = 5826143456982458325L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识。
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
	 * 下单用户的支付宝userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 入库业务号。碰一下场景必须保存
	 */
	@ApiField("vid")
	private String vid;

	/**
	 * null
	 */
	@ApiListField("voucher_user_ids")
	@ApiField("string")
	private List<String> voucherUserIds;

	/**
	 * null
	 */
	@ApiListField("vourcher_user_ids")
	@ApiField("string")
	private List<String> vourcherUserIds;

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

	public List<String> getVoucherUserIds() {
		return this.voucherUserIds;
	}
	public void setVoucherUserIds(List<String> voucherUserIds) {
		this.voucherUserIds = voucherUserIds;
	}

	public List<String> getVourcherUserIds() {
		return this.vourcherUserIds;
	}
	public void setVourcherUserIds(List<String> vourcherUserIds) {
		this.vourcherUserIds = vourcherUserIds;
	}

}
