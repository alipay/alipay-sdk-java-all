package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券平台券延期接口
 *
 * @author auto create
 * @since 1.0, 2022-12-22 14:07:20
 */
public class AlipayMarketingVoucherDelayModel extends AlipayObject {

	private static final long serialVersionUID = 6814917787143367465L;

	/**
	 * 1、券模板上的过期时间为绝对时间，传不传都使用券模板上的过期时间
2、券模板上的过期时间为相对时间，min（券激活时间+相对时间，入参expired_time）
	 */
	@ApiField("expired_time")
	private String expiredTime;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 支付宝用户ID(映射的openId) ，必须保证待使用的券ID归属于该支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，用户幂等控制。相同voucher_id和out_biz_no被认为是同一次操作
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户ID ，必须保证待使用的券ID归属于该支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 待延期的券id ，来自发券接口alipay.marketing.voucher.send
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
