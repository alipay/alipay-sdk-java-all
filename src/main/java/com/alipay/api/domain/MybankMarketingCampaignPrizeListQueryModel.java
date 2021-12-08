package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户已拥有的奖品列表
 *
 * @author auto create
 * @since 1.0, 2019-08-23 14:23:40
 */
public class MybankMarketingCampaignPrizeListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8829533686635147638L;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 分页查询时的页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询时每页返回的列表大小，最大为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * COUPON_VOUCHER 利息红包
DISCOUNT_VOUCHER 打折券
	 */
	@ApiField("type")
	private String type;

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
