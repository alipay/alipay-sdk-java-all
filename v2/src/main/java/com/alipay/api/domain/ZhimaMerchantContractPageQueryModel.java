package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约信息分页查询
 *
 * @author auto create
 * @since 1.0, 2021-05-17 10:40:44
 */
public class ZhimaMerchantContractPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3644613472845454652L;

	/**
	 * 查询开始时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 要查询的合约状态列表，多选 ，逗号分隔
初始化,待应约状态:INIT
生效 :EFFECT
完结: COMPLETE
关闭:CLOSE
失效:INVALID
	 */
	@ApiField("contract_status_list")
	private String contractStatusList;

	/**
	 * 当前页,从1开始
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 查询结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 是否包含合约履约事件信息，如打卡信息等。默认false
	 */
	@ApiField("include_event_detail")
	private Boolean includeEventDetail;

	/**
	 * 是否查询事项,默认false
	 */
	@ApiField("include_item")
	private Boolean includeItem;

	/**
	 * 发约单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	/**
	 * 每页条数，默认5条，最多支持10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 应约者主体id(淘宝id/支付宝user_id/商户id)
	 */
	@ApiField("sign_principal_id")
	private String signPrincipalId;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getContractStatusList() {
		return this.contractStatusList;
	}
	public void setContractStatusList(String contractStatusList) {
		this.contractStatusList = contractStatusList;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Boolean getIncludeEventDetail() {
		return this.includeEventDetail;
	}
	public void setIncludeEventDetail(Boolean includeEventDetail) {
		this.includeEventDetail = includeEventDetail;
	}

	public Boolean getIncludeItem() {
		return this.includeItem;
	}
	public void setIncludeItem(Boolean includeItem) {
		this.includeItem = includeItem;
	}

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSignPrincipalId() {
		return this.signPrincipalId;
	}
	public void setSignPrincipalId(String signPrincipalId) {
		this.signPrincipalId = signPrincipalId;
	}

}
