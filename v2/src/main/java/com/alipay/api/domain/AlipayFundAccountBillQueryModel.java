package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 托管户账单查询接口
 *
 * @author auto create
 * @since 1.0, 2022-07-03 19:10:21
 */
public class AlipayFundAccountBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8326764683143799218L;

	/**
	 * 开户场景码
	 */
	@ApiField("account_scene_code")
	private String accountSceneCode;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 账单开始时间
	 */
	@ApiField("bill_begin_time")
	private String billBeginTime;

	/**
	 * 账单结束时间
	 */
	@ApiField("bill_end_time")
	private String billEndTime;

	/**
	 * JSON格式，传递业务扩展参数，使用前请与支付宝工程师联系！
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户会员的唯一标识
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 查询页码，必须大于0
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小，每页条目数需满足0< page_size < 100
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAccountSceneCode() {
		return this.accountSceneCode;
	}
	public void setAccountSceneCode(String accountSceneCode) {
		this.accountSceneCode = accountSceneCode;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBillBeginTime() {
		return this.billBeginTime;
	}
	public void setBillBeginTime(String billBeginTime) {
		this.billBeginTime = billBeginTime;
	}

	public String getBillEndTime() {
		return this.billEndTime;
	}
	public void setBillEndTime(String billEndTime) {
		this.billEndTime = billEndTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
