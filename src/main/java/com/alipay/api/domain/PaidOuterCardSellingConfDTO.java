package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付费外卡售卖基础配置
 *
 * @author auto create
 * @since 1.0, 2021-08-18 17:21:27
 */
public class PaidOuterCardSellingConfDTO extends AlipayObject {

	private static final long serialVersionUID = 7366819963415691428L;

	/**
	 * 售卖结束时间。
格式：yyyy-MM-dd HH:mm:ss
如果永久有效则不传。
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 售卖方案列表
	 */
	@ApiField("price_detail")
	private PaidOuterCardPriceDetailDTO priceDetail;

	/**
	 * 售卖地址
	 */
	@ApiField("selling_url")
	private String sellingUrl;

	/**
	 * 售卖开始时间。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_date")
	private Date startDate;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public PaidOuterCardPriceDetailDTO getPriceDetail() {
		return this.priceDetail;
	}
	public void setPriceDetail(PaidOuterCardPriceDetailDTO priceDetail) {
		this.priceDetail = priceDetail;
	}

	public String getSellingUrl() {
		return this.sellingUrl;
	}
	public void setSellingUrl(String sellingUrl) {
		this.sellingUrl = sellingUrl;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
