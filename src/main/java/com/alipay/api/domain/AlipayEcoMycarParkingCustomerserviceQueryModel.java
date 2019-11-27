package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车数据查询接口
 *
 * @author auto create
 * @since 1.0, 2019-10-08 18:23:10
 */
public class AlipayEcoMycarParkingCustomerserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2552376781182599657L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 扩展参数字段,json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * isv的应用标识
	 */
	@ApiField("isv_appid")
	private String isvAppid;

	/**
	 * isv的外部订单号
	 */
	@ApiField("out_biz_trade_no")
	private String outBizTradeNo;

	/**
	 * 请求类型：
- 1：车牌绑定代扣关系
- 2：查询停车订单信息
	 */
	@ApiField("request_type")
	private String requestType;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getIsvAppid() {
		return this.isvAppid;
	}
	public void setIsvAppid(String isvAppid) {
		this.isvAppid = isvAppid;
	}

	public String getOutBizTradeNo() {
		return this.outBizTradeNo;
	}
	public void setOutBizTradeNo(String outBizTradeNo) {
		this.outBizTradeNo = outBizTradeNo;
	}

	public String getRequestType() {
		return this.requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
