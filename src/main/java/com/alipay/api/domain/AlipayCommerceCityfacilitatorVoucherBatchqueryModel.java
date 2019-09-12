package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地铁购票订单批量查询
 *
 * @author auto create
 * @since 1.0, 2016-08-03 16:11:01
 */
public class AlipayCommerceCityfacilitatorVoucherBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7798937517961464891L;

	/**
	 * 城市编码请参考查询：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201504/t20150415_712722.html；
已支持城市：广州 440100，深圳 440300，杭州330100。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 支付宝交易号列表
	 */
	@ApiListField("trade_nos")
	@ApiField("string")
	private List<String> tradeNos;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<String> getTradeNos() {
		return this.tradeNos;
	}
	public void setTradeNos(List<String> tradeNos) {
		this.tradeNos = tradeNos;
	}

}
