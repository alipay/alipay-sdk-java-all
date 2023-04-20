package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流单摘要
 *
 * @author auto create
 * @since 1.0, 2023-03-28 10:44:10
 */
public class InsOpenLogisticsDigestDTO extends AlipayObject {

	private static final long serialVersionUID = 2426578568896784179L;

	/**
	 * 物流商名称
	 */
	@ApiField("logistics_company_name")
	private String logisticsCompanyName;

	/**
	 * 物流商快递单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 物流状态:0:已下单;1:已揽收;5:入库;2:已签收;8:已投柜;9:待取件;
	 */
	@ApiField("logistics_status")
	private Long logisticsStatus;

	public String getLogisticsCompanyName() {
		return this.logisticsCompanyName;
	}
	public void setLogisticsCompanyName(String logisticsCompanyName) {
		this.logisticsCompanyName = logisticsCompanyName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public Long getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(Long logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

}
