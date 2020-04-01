package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁购票核销码发码
 *
 * @author auto create
 * @since 1.0, 2019-10-10 16:30:53
 */
public class AlipayCommerceCityfacilitatorVoucherGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 6815295271169356134L;

	/**
	 * 城市编码请参考查询：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201504/t20150415_712722.html；
已支持城市：广州 440100，深圳 440300，杭州330100。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 起点站站点编码
	 */
	@ApiField("site_begin")
	private String siteBegin;

	/**
	 * 终点站站点编码
	 */
	@ApiField("site_end")
	private String siteEnd;

	/**
	 * 地铁票购票数量
	 */
	@ApiField("ticket_num")
	private String ticketNum;

	/**
	 * 单张票价，元为单价
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/**
	 * 地铁票种类
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 订单总金额，元为单位
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 支付宝交易号（交易支付时，必须通过指定sellerId：2088121612215201，将钱支付到指定的中间户中）
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getSiteBegin() {
		return this.siteBegin;
	}
	public void setSiteBegin(String siteBegin) {
		this.siteBegin = siteBegin;
	}

	public String getSiteEnd() {
		return this.siteEnd;
	}
	public void setSiteEnd(String siteEnd) {
		this.siteEnd = siteEnd;
	}

	public String getTicketNum() {
		return this.ticketNum;
	}
	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getTicketPrice() {
		return this.ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
