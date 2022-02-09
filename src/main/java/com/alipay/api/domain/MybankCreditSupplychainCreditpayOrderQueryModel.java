package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询赊呗订单
 *
 * @author auto create
 * @since 1.0, 2020-07-15 16:59:09
 */
public class MybankCreditSupplychainCreditpayOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7126125644798777743L;

	/**
	 * 支付宝Id
	 */
	@ApiField("custom_info")
	private Member customInfo;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 分页查询的每页数据数量
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/**
	 * 页数，从1-N
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 赊呗内部方案，调用方向服务提供方申请
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 查询订单状态,淘宝拍卖场景【ONWAY在途，CRATE投标中，VALID中标，CANCEL未中标，CLEAR已还款】
	 */
	@ApiField("status")
	private String status;

	/**
	 * 交易来源
	 */
	@ApiField("trade_source")
	private String tradeSource;

	public Member getCustomInfo() {
		return this.customInfo;
	}
	public void setCustomInfo(Member customInfo) {
		this.customInfo = customInfo;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getItemsPerPage() {
		return this.itemsPerPage;
	}
	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeSource() {
		return this.tradeSource;
	}
	public void setTradeSource(String tradeSource) {
		this.tradeSource = tradeSource;
	}

}
