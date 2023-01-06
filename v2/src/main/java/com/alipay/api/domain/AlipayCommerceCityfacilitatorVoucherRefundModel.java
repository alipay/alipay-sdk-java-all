package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁购票发码退款
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:57:34
 */
public class AlipayCommerceCityfacilitatorVoucherRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6857783367984735782L;

	/**
	 * 城市编码请参考查询 <a href="http://www.mca.gov.cn/article/sj/xzqh/">中华人民共和国行政区划代码</a>。
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
