package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁购票发码退款
 *
 * @author auto create
 * @since 1.0, 2019-10-10 16:32:08
 */
public class AlipayCommerceCityfacilitatorVoucherRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4172443213436479174L;

	/**
	 * 城市编码请参考查询：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201504/t20150415_712722.html；
已支持城市：广州 440100，深圳 440300，杭州330100。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
