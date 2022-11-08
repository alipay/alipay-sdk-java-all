package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询商户会员交易明细
 *
 * @author auto create
 * @since 1.0, 2022-11-07 17:05:50
 */
public class AntMerchantExpandMembercardTransactionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3666172765482123129L;

	/**
	 * 交易明细类型，指定要查询的明细类型，枚举如下：
RECHARGE=充值，
PAYMENT=支付，
REFUND=退款，
RETURN=退卡
	 */
	@ApiListField("biz_type")
	@ApiField("string")
	private List<String> bizType;

	/**
	 * 查询结束时间，格式"yyyy-MM-dd HH:mm:ss"，查询时间范围最大为30天
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商家的安心充配置的唯一编号
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	/**
	 * 蚂蚁统一会员ID，指定则查询指定用户的交易记录，不指定则查所有用户的交易记录
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询的页数，从1开始，最大1000
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，最小1，最大20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询开始时间，格式"yyyy-MM-dd HH:mm:ss"，查询时间范围最大为30天
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 蚂蚁统一会员ID，指定则查询指定用户的交易记录，不指定则查所有用户的交易记录
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getBizType() {
		return this.bizType;
	}
	public void setBizType(List<String> bizType) {
		this.bizType = bizType;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMemberProductId() {
		return this.memberProductId;
	}
	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
