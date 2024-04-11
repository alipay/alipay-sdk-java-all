package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流请求扩展信息，
在CUPBOARD（取餐柜模式 场景），为指定设备编号，单元格编号；
 *
 * @author auto create
 * @since 1.0, 2019-01-25 20:27:28
 */
public class LogisticsExternalCarrierInfo extends AlipayObject {

	private static final long serialVersionUID = 4597484375614684937L;

	/**
	 * 物流载体指定标识；
在CUPBOARD（取餐柜模式 场景）为指定设备号
	 */
	@ApiField("carrier_no")
	private String carrierNo;

	/**
	 * 物流载体状态：
WAIT_SIGN：待签收
SIGN：已签收
CANCELED：已撤销
	 */
	@ApiField("carrier_status")
	private String carrierStatus;

	/**
	 * 物流载体指定子物理标识；
在CUPBOARD（取餐柜模式 场景：该标识为格子物理编号，即格子唯一标识
	 */
	@ApiField("carrier_sub_id")
	private String carrierSubId;

	/**
	 * 物流载体指定子展示标识；
在CUPBOARD（取餐柜模式 场景：该标识为格子展示编号，商户可自行设置
	 */
	@ApiField("carrier_sub_no")
	private String carrierSubNo;

	public String getCarrierNo() {
		return this.carrierNo;
	}
	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	public String getCarrierStatus() {
		return this.carrierStatus;
	}
	public void setCarrierStatus(String carrierStatus) {
		this.carrierStatus = carrierStatus;
	}

	public String getCarrierSubId() {
		return this.carrierSubId;
	}
	public void setCarrierSubId(String carrierSubId) {
		this.carrierSubId = carrierSubId;
	}

	public String getCarrierSubNo() {
		return this.carrierSubNo;
	}
	public void setCarrierSubNo(String carrierSubNo) {
		this.carrierSubNo = carrierSubNo;
	}

}
