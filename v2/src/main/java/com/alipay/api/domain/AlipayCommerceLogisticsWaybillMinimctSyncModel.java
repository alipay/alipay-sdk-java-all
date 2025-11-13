package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商家物流运单同步接口
 *
 * @author auto create
 * @since 1.0, 2022-11-02 17:26:14
 */
public class AlipayCommerceLogisticsWaybillMinimctSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2374544875867138615L;

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
	 * 收件人手机号
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

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

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
