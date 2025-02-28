package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 水电燃账单提醒上传
 *
 * @author auto create
 * @since 1.0, 2024-11-19 11:11:30
 */
public class AlipayEbppEbppBillNotifyUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5612223512957827139L;

	/**
	 * 账单提醒用户信息
	 */
	@ApiListField("bill_notify_info")
	@ApiField("bill_notify_info")
	private List<BillNotifyInfo> billNotifyInfo;

	/**
	 * 省码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 账单提醒类型
	 */
	@ApiField("type")
	private String type;

	public List<BillNotifyInfo> getBillNotifyInfo() {
		return this.billNotifyInfo;
	}
	public void setBillNotifyInfo(List<BillNotifyInfo> billNotifyInfo) {
		this.billNotifyInfo = billNotifyInfo;
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
