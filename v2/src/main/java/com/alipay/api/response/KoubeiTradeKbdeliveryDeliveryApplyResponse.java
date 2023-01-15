package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LogisticsExternalInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.kbdelivery.delivery.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:09:22
 */
public class KoubeiTradeKbdeliveryDeliveryApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7853713897724298778L;

	/** 
	 * 附加数据，在查询API和物流变更通知回执中原样返回，该字段主要用于第三方系统携带订单的自定义数据
	 */
	@ApiField("attach")
	private String attach;

	/** 
	 * 物流单成功创建时间
时间格式：yyyyMMddHHmmss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 返回物流载体信息；
在取餐柜模式下，为返回申请的设备信息
	 */
	@ApiField("logistics_external_info")
	private LogisticsExternalInfo logisticsExternalInfo;

	/** 
	 * 口碑物流单，单号；
	 */
	@ApiField("logistics_order_no")
	private String logisticsOrderNo;

	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getAttach( ) {
		return this.attach;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setLogisticsExternalInfo(LogisticsExternalInfo logisticsExternalInfo) {
		this.logisticsExternalInfo = logisticsExternalInfo;
	}
	public LogisticsExternalInfo getLogisticsExternalInfo( ) {
		return this.logisticsExternalInfo;
	}

	public void setLogisticsOrderNo(String logisticsOrderNo) {
		this.logisticsOrderNo = logisticsOrderNo;
	}
	public String getLogisticsOrderNo( ) {
		return this.logisticsOrderNo;
	}

}
