package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券平台批量发券
 *
 * @author auto create
 * @since 1.0, 2022-12-22 14:06:15
 */
public class AlipayMarketingVoucherBatchsendModel extends AlipayObject {

	private static final long serialVersionUID = 6119592628852965616L;

	/**
	 * 是否异步发放
	 */
	@ApiField("async")
	private Boolean async;

	/**
	 * 业务来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 支付宝用户ID(映射的openId)
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，用户幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券是否需要主动领取
	 */
	@ApiField("to_claim")
	private Boolean toClaim;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券列表
	 */
	@ApiListField("vouchers")
	@ApiField("open_batch_voucher")
	private List<OpenBatchVoucher> vouchers;

	public Boolean getAsync() {
		return this.async;
	}
	public void setAsync(Boolean async) {
		this.async = async;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
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

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public Boolean getToClaim() {
		return this.toClaim;
	}
	public void setToClaim(Boolean toClaim) {
		this.toClaim = toClaim;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<OpenBatchVoucher> getVouchers() {
		return this.vouchers;
	}
	public void setVouchers(List<OpenBatchVoucher> vouchers) {
		this.vouchers = vouchers;
	}

}
