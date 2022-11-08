package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员钱包账户余额明细查询
 *
 * @author auto create
 * @since 1.0, 2022-05-20 15:17:51
 */
public class AntMerchantMemberwalletBalancedetailsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3759781666285658497L;

	/**
	 * 查询结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 会员钱包产品ID
	 */
	@ApiField("member_wallet_id")
	private String memberWalletId;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页长
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 会员钱包账户ID
	 */
	@ApiField("wallet_id")
	private String walletId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMemberWalletId() {
		return this.memberWalletId;
	}
	public void setMemberWalletId(String memberWalletId) {
		this.memberWalletId = memberWalletId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
