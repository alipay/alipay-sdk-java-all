package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付费外卡售卖基础配置
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:48:34
 */
public class PaidOuterCardSellingConfDTO extends AlipayObject {

	private static final long serialVersionUID = 1366677431384817228L;

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
	@ApiListField("price_detail")
	@ApiField("paid_outer_card_price_detail_d_t_o")
	private List<PaidOuterCardPriceDetailDTO> priceDetail;

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

	public List<PaidOuterCardPriceDetailDTO> getPriceDetail() {
		return this.priceDetail;
	}
	public void setPriceDetail(List<PaidOuterCardPriceDetailDTO> priceDetail) {
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
