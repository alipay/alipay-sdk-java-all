package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商家物流运单同步接口
 *
 * @author auto create
 * @since 1.0, 2020-03-17 10:48:18
 */
public class AlipayCommerceLogisticsWaybillMinimctSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6469349214896267914L;

	/**
	 * 物流公司编码，具体详见接口开发文档
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 运单参数扩展列表
	 */
	@ApiListField("merchant_ext_info")
	@ApiField("param_ext_info")
	private List<ParamExtInfo> merchantExtInfo;

	/**
	 * 运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public List<ParamExtInfo> getMerchantExtInfo() {
		return this.merchantExtInfo;
	}
	public void setMerchantExtInfo(List<ParamExtInfo> merchantExtInfo) {
		this.merchantExtInfo = merchantExtInfo;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
