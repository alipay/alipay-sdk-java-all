package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券平台批量过期券
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:53:09
 */
public class AlipayMarketingVoucherBatchExpireModel extends AlipayObject {

	private static final long serialVersionUID = 2821679866893478514L;

	/**
	 * 业务来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 支付宝用户ID(映射的openId)
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，用户幂等控制。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券列表
	 */
	@ApiListField("vouchers")
	@ApiField("open_batch_expire_voucher")
	private List<OpenBatchExpireVoucher> vouchers;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
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

	public List<OpenBatchExpireVoucher> getVouchers() {
		return this.vouchers;
	}
	public void setVouchers(List<OpenBatchExpireVoucher> vouchers) {
		this.vouchers = vouchers;
	}

}
