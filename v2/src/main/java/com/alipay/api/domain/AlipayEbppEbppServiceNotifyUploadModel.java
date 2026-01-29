package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 水电燃服务账单提醒上传
 *
 * @author auto create
 * @since 1.0, 2024-11-19 11:11:56
 */
public class AlipayEbppEbppServiceNotifyUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8363256855415211725L;

	/**
	 * 账单服务提醒用户信息列表
	 */
	@ApiListField("bill_service_info")
	@ApiField("bill_service_info")
	private List<BillServiceInfo> billServiceInfo;

	/**
	 * 省码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 账单服务提醒类型
	 */
	@ApiField("type")
	private String type;

	public List<BillServiceInfo> getBillServiceInfo() {
		return this.billServiceInfo;
	}
	public void setBillServiceInfo(List<BillServiceInfo> billServiceInfo) {
		this.billServiceInfo = billServiceInfo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
